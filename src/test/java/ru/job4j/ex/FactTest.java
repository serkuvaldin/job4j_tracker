package ru.job4j.ex;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenNIsNegative() {
        Fact fact = new Fact();
        fact.calc(-1);
    }

    @Test
    public void when4Than24() {
        Fact fact = new Fact();
        int rsl = fact.calc(4);
        assertThat(rsl, is(24));
    }
}