package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private int surgeries;

    public Surgeon(String clinic, int surgeries) {
        super(clinic);
        this.surgeries = surgeries;
    }

    public int getSurgeries() {
        return surgeries;
    }
}
