package ru.job4j.early;

import static java.lang.Character.*;

public class PasswordValidator {

    private static final String[] ILLEGAL_STR = {"qwerty", "12345", "password", "admin", "user"};

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        for (String str : ILLEGAL_STR) {
            if (password.toLowerCase().contains(str)) {
                throw new IllegalArgumentException("Password shouldn't contain substrings: "
                        + "qwerty, 12345, password, admin, user");
            }
        }
        boolean lower = false;
        boolean upper = false;
        boolean digit = false;
        boolean specSymbol = false;
        for (char pwChar : password.toCharArray()) {
            if (isUpperCase(pwChar)) {
                upper = true;
            }
            if (isLowerCase(pwChar)) {
                lower = true;
            }
            if (isDigit(pwChar)) {
                digit = true;
            }
            if (!isDigit(pwChar) && !isLetter(pwChar)) {
                specSymbol = true;
            }
        }
        if (!upper) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (!lower) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (!digit) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!specSymbol) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        return password;
    }
}