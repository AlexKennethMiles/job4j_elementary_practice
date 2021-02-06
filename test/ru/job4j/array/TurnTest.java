package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TurnTest {
    @Test
    public void whenArray12345To54321() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expect = {5, 4, 3, 2, 1};
        int[] rsl = Turn.back(input);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenArray123456To654321() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] expect = {6, 5, 4, 3, 2, 1};
        int[] rsl = Turn.back(input);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenArray111000To000111() {
        int[] input = {1, 1, 1, 0, 0, 0};
        int[] expect = {0, 0, 0, 1, 1, 1};
        int[] rsl = Turn.back(input);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenArray10000To00001() {
        int[] input = {1, 0, 0, 0, 0};
        int[] expect = {0, 0, 0, 0, 1};
        int[] rsl = Turn.back(input);
        assertThat(rsl, is(expect));
    }
}
