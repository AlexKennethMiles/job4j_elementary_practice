package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortAdditional() {
        int[] input = {1, 0, 0, 1, 1, 0};
        int[] result = SortSelected.sort(input);
        int[] expect = {0, 0, 0, 1, 1, 1};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortAllZero() {
        int[] input = {0, 0, 0, 0, 0};
        int[] result = SortSelected.sort(input);
        int[] expect = {0, 0, 0, 0, 0};
        assertThat(result, is(expect));
    }

    @Test
    public void whenComplexSort() {
        int[] input = {1, 3, 3, 3, 1, 3, 3, 1, 2, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = {1, 1, 1, 1, 2, 3, 3, 3, 3, 3};
        assertThat(result, is(expect));
    }

    @Test
    public void whenNoSort() {
        int[] input = {0, 0, 0, 1, 1, 1, 2, 2, 2};
        int[] result = SortSelected.sort(input);
        int[] expect = {0, 0, 0, 1, 1, 1, 2, 2, 2};
        assertThat(result, is(expect));
    }
}
