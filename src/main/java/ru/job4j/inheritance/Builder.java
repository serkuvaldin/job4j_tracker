package ru.job4j.inheritance;

public class Builder extends Engineer {

    private int built;

    public Builder(String name, String surname, String education, String birthday, int experience, int built) {
        super(name, surname, education, birthday, experience);
        this.built = built;
    }

    public int getBuilt() {
        return built;
    }
}
