package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class EqLastTest {
    @Test
    public void whenEq1() {
        int[] first = {1, 2, 3};
        int[] second = {9, 8, 7, 6, 5, 4, 3};
        boolean rsl = EqLast.check(first, second);
        assertThat(rsl, is(true));
    }

    @Test
    public void whenEq2() {
        int[] first = {1, 2, 3};
        int[] second = {5, 4, 3};
        boolean rsl = EqLast.check(first, second);
        assertThat(rsl, is(true));
    }

    @Test
    public void whenEq3() {
        int[] first = {3};
        int[] second = {3};
        boolean rsl = EqLast.check(first, second);
        assertThat(rsl, is(true));
    }

    @Test
    public void whenNotEq1() {
        int[] first = {0, 1, 2};
        int[] second = {3, 3, 4};
        boolean rsl = EqLast.check(first, second);
        assertThat(rsl, is(false));
    }

    @Test
    public void whenNotEq2() {
        int[] first = {4, 3, 2, 1};
        int[] second = {2, 1, 0};
        boolean rsl = EqLast.check(first, second);
        assertThat(rsl, is(false));
    }

    @Test
    public void whenNotEq3() {
        int[] first = {2};
        int[] second = {4};
        boolean rsl = EqLast.check(first, second);
        assertThat(rsl, is(false));
    }
}
