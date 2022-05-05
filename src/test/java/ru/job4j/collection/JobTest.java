package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class JobTest {
    @Test
    public void whenComparatorDescByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorAscByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Task", 0),
                new Job("Task", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorAscByName() {
        Comparator<Job> name = new JobAscByName();
        int rsl = name.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorDescByName() {
        Comparator<Job> name = new JobDescByName();
        int rsl = name.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorAscByPriority() {
        Comparator<Job> name = new JobAscByPriority();
        int rsl = name.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorDescByPriority() {
        Comparator<Job> name = new JobDescByPriority();
        int rsl = name.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
}