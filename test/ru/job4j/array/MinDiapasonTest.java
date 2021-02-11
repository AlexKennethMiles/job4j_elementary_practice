package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinDiapasonTest {
    @Test
    public void whenFirstMin() {
        int[] array = {-1, 0, 5, 10};
        assertThat(MinDiapason.findMin(array, 1, 3), is(0));
    }

    @Test
    public void whenLastMin() {
        int[] array = {10, 5, 3, 1};
        assertThat(MinDiapason.findMin(array, 1, 3), is(1));
    }

    @Test
    public void whenMiddleMin() {
        int[] array = {10, 2, 5, 1};
        assertThat(MinDiapason.findMin(array, 0, 2), is(2));
    }

    @Test
    public void whenMiddleMinAdditional() {
        int[] array = {3};
        assertThat(MinDiapason.findMin(array, 0, 0), is(3));
    }

    @Test
    public void whenIncorrectFinish() {
        int[] array = {4, 5, 6, 7};
        assertThat(MinDiapason.findMin(array, 2, -1), is(6));
    }
}
