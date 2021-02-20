package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CheckSumIndexesTest {
    @Test
    public void collectNewArray1() {
        int[][] data = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int[] rsl = CheckSumIndexes.collectNewArray(data, 3);
        int[] expected = {1, 2, 3, 5, 6, 8, 9, 11, 12, 14, 15, 16};
        assertThat(rsl, is(expected));
    }

    @Test
    public void collectNewArray2() {
        int[][] data = {
                {1, 0, 3, 4},
                {0, 6, 7, 8},
                {9, 10, 11, 0},
                {13, 0, 15, 16}
        };
        int[] rsl = CheckSumIndexes.collectNewArray(data, 5);
        int[] expected = {1, 3, 4, 6, 7, 8, 9, 10, 11, 13, 15};
        assertThat(rsl, is(expected));
    }
}
