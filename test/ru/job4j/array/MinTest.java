package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinTest {
    @Test
    public void whenFirstMin() {
        int[] array = {0, 5, 10};
        assertThat(Min.findMin(array), is(0));
    }

    @Test
    public void whenMiddleMin() {
        int[] array = {10, 2, 5};
        assertThat(Min.findMin(array), is(2));
    }

    @Test
    public void whenLastMin() {
        int[] array = {10, 5, 3};
        assertThat(Min.findMin(array), is(3));
    }

    @Test
    public void whenAllMin() {
        int[] array = {6, 6, 6};
        assertThat(Min.findMin(array), is(6));
    }
}
