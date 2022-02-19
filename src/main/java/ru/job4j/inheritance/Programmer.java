package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String experienceLevel;

    public Programmer(String name, String surname, String education, String birthday, int experience, String experienceLevel) {
        super(name, surname, education, birthday, experience);
        this.experienceLevel = experienceLevel;
    }

    public String getExperienceLevel() {
        return experienceLevel;
    }
}
