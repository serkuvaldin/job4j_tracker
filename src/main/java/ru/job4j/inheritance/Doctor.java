package ru.job4j.inheritance;

public class Doctor extends Professions {

    private String clinic;

    public Doctor(String name, String surname, String education, String birthday, String clinic) {
        super(name, surname, education, birthday);
        this.clinic = clinic;
    }

    public String getClinic() {
        return clinic;
    }

}
