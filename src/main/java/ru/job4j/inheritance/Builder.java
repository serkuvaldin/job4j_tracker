package ru.job4j.inheritance;

public class Builder extends Engineer {

    private int built;

    public Builder(int built) {
        this.built = built;
    }

    public int getBuilt() {
        return built;
    }
}
