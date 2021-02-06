package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap1to3() {
        int[] input = {0, 1, 2, 3};
        int[] expect = {0, 3, 2, 1};
        int[] rsl = SwitchArray.swap(input, 1, 3);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap0to0() {
        int[] input = {0, 1, 2, 3, 4};
        int[] expect = {0, 1, 2, 3, 4};
        int[] rsl = SwitchArray.swap(input, 0, 0);
        assertThat(rsl, is(expect));
    }
    @Test
    public void whenSwap4to1() {
        int[] input = {0, 1, 2, 3, 4};
        int[] expect = {0, 4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 4, 1);
        assertThat(rsl, is(expect));
    }
}
