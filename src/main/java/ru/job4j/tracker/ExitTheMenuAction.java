package ru.job4j.tracker;

public class ExitTheMenuAction implements UserAction {
    private final Output out;

    public ExitTheMenuAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Exit program";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}