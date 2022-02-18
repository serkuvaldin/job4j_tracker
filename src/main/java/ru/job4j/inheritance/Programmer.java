package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String experienceLevel;

    public Programmer(String name, String surname, int experience, String experienceLevel) {
        super(name, surname, experience);
        this.experienceLevel = experienceLevel;
    }

    public String getExperienceLevel() {
        return experienceLevel;
    }
}
