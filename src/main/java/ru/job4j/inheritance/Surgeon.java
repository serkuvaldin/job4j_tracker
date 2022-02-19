package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private int surgeries;

    public Surgeon(String name, String surname, String education, String birthday, String clinic, int surgeries) {
        super(name, surname, education, birthday, clinic);
        this.surgeries = surgeries;
    }

    public int getSurgeries() {
        return surgeries;
    }
}
