package ru.job4j.inheritance;

public class Engineer extends Professions {

    private int experience;

    public Engineer() {
    }

    public Engineer(String name, String surname, int experience) {
        super(name, surname);
        this.experience = experience;
    }

    public Engineer(String name, String surname, String education, String birthday, int experience) {
        super(name, surname, education, birthday);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

}
