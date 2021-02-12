package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SkipNegativeTest {
    @Test
    public void skip() {
        int[][] input = {
                {1, -2},
                {1, 2}
        };
        int[][] rsl = SkipNegative.skip(input);
        int[][] expect = {
                {1, 0},
                {1, 2}
        };
        assertThat(rsl, is(expect));
    }

    @Test
    public void expect() {
        int[][] input = {
                {1, 0},
                {1, 2}
        };
        int[][] rsl = SkipNegative.skip(input);
        int[][] expect = {
                {1, 0},
                {1, 2}
        };
        assertThat(rsl, is(expect));
    }

    @Test
    public void allNegatives() {
        int[][] input = {
                {-8, -0, -3},
                {-4, -2, -9}
        };
        int[][] rsl = SkipNegative.skip(input);
        int[][] expect = {
                {0, 0, 0},
                {0, 0, 0}
        };
        assertThat(rsl, is(expect));
    }
}
