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

    @Test
    public void whenFind3() {
        int[] input = new int[]{5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFindNothing() {
        int[] input = new int[]{0, 1, 0, 0, 0, 1, 0, 0};
        int value = 2;
        int start = 3;
        int finish = 7;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind0() {
        int[] input = new int[]{1, 2, 1};
        int value = 1;
        int start = 0;
        int finish = 2;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind4() {
        int[] input = new int[]{1, 2, 1, 2, 1};
        int value = 1;
        int start = 3;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 4;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind5() {
        int[] input = new int[]{1, 2, 3, 4, 5, 6};
        int value = 6;
        int start = 5;
        int finish = 5;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 5;
        assertThat(result, is(expect));
    }
}
