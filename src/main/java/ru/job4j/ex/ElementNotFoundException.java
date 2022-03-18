package ru.job4j.ex;

public class ElementNotFoundException extends Exception {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException();
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            int index = indexOf(new String[]{"one", "two", "three"}, "no");
            System.out.println("index: " + index);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
