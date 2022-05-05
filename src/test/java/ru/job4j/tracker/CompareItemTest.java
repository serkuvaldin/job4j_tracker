package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CompareItemTest {

    @Test
    public void reverseSortByName() {
        List<Item> items = Arrays.asList(
                new Item("Ben"),
                new Item("Ann"),
                new Item("Ron")
        );
        List<Item> expected = Arrays.asList(
                new Item("Ron"),
                new Item("Ben"),
                new Item("Ann")
        );
        Collections.sort(items, new ItemDescByName());
        assertThat(items, is(expected));
    }

    @Test
    public void sortByName() {
        List<Item> items = Arrays.asList(
                new Item("Ben"),
                new Item("Ann"),
                new Item("Ron")
        );
        List<Item> expected = Arrays.asList(
                new Item("Ann"),
                new Item("Ben"),
                new Item("Ron")
        );
        Collections.sort(items, new ItemAscByName());
        assertThat(items, is(expected));
    }
}