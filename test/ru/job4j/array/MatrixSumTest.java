package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixSumTest {
    @Test
    public void whenSingle() {
        int[][] input = {{10}};
        int rsl = MatrixSum.sum(input);
        int expect = 10;
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenOne() {
        int[][] input = {
                {10},
                {5},
                {3},
                {2}
        };
        int rsl = MatrixSum.sum(input);
        int expect = 20;
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenTwo() {
        int[][] input = {
                {1, 2},
                {1, 2}
        };
        int rsl = MatrixSum.sum(input);
        int expect = 6;
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenThree() {
        int[][] input = {
                {1, 2, 1},
                {1, 2, 0}
        };
        int rsl = MatrixSum.sum(input);
        int expect = 7;
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenThreeInSingle() {
        int[][] input = {{1, 2, 3, 4, 5, 6, 7, 8, 9}};
        int rsl = MatrixSum.sum(input);
        int expect = 45;
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenZero() {
        int[][] input = {{}};
        int rsl = MatrixSum.sum(input);
        int expect = 0;
        assertThat(rsl, is(expect));
    }
}
