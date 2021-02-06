package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] input = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas12ThenNone() {
        int[] input = new int[]{10, 11, 13, 14};
        int value = 12;
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas0Then2() {
        int[] input = new int[]{-2, -1, 0, 1};
        int value = 0;
        int result = FindLoop.indexOf(input, value);
        int expect = 2;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas1Then5() {
        int[] input = new int[]{0, 0, 0, 0, 0, 1, 0, 0};
        int value = 1;
        int result = FindLoop.indexOf(input, value);
        int expect = 5;
        assertThat(result, is(expect));
    }
}
