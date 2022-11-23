package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу банковско сервиса:
 * операции со счетами{@link Account} и пользователями{@link User}.
 * @author SERGEY KUVALDIN
 * @version 1.0
 */
public class BankService {
    /**
     * Хранение пользователей системы с привязанными к ним счетами
     * осуществляется в ассоциативной карте типа HashMap
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход пользователя, проверяет что такого пользоваетля
     * еще нет в системе, и добавляет его в список пользователей.
     * По умолчанию к пользователю добавляется пустой список типа ArrayList.
     * @param user пользователь, который добавляется в систему
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод добавляет новый счет к пользователю, если такого счета
     * у пользователя еще нет.
     * @param passport номер паспорта пользователя, к которому добавляется счет
     * @param account счет, который нужно добавить к пользователю
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> userAccounts = users.get(user);
            if (!userAccounts.contains(account)) {
                userAccounts.add(account);
            }
        }
    }

    /**
     * Метод позволяет найти пользователя по номеру паспорта.
     * @param passport номер паспорта искомого пользователя
     * @return возвращает пользователя если такой есть, либо возвращает null
     */
    public User findByPassport(String passport) {
        User rsl = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                rsl = user;
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод ищет счет пользователя по реквизитам.
     * @param passport номер паспорта пользователя
     * @param requisite номер искомого счета пользователя
     * @return возвращает счет пользователя или null, если счет не найден
     */
    public Account findByRequisite(String passport, String requisite) {
        Account rsl = null;
        User user = findByPassport(passport);
        if (user != null) {
            for (Account account : users.get(user)) {
                if (account.getRequisite().equals(requisite)) {
                    rsl = account;
                    break;
                }
            }
        }
        return rsl;
    }

    /**
     * Метод предназначен для перечисления денег с одного счёта на другой счёт.
     * Принимает на вход номер паспорта и реквизиты отправителя,
     * номер паспорта и реквизиты получателя, и сумму перевода.
     * Ищет счета отправителя и получателя по реквизитам {@link #findByRequisite} и
     * переводит указанную сумму с одного счета на другой.
     * @param srcPassport номер паспорта отправителя
     * @param srcRequisite реквизиты отправителя
     * @param destPassport номер паспорта получателя
     * @param destRequisite реквизиты получателя
     * @param amount сумма перевода
     * @return возвращает true при выполнении перевода / false если не найден счет или
     * недостаточно денег на счете отправителя
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account src = findByRequisite(srcPassport, srcRequisite);
        Account dest = findByRequisite(destPassport, destRequisite);
        if (src != null && dest != null && src.getBalance() >= amount) {
            src.setBalance(src.getBalance() - amount);
            dest.setBalance(dest.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}