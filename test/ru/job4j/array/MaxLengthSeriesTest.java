package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxLengthSeriesTest {
    @Test
    public void test() {
        assertEquals(1, MaxLengthSeries.find(new int[]{1}));
        assertEquals(1, MaxLengthSeries.find(new int[]{2, 1}));
        assertEquals(2, MaxLengthSeries.find(new int[]{1, 2}));
        assertEquals(4, MaxLengthSeries.find(new int[]{1, 2, 0, 1, 2, 3}));
        assertEquals(4, MaxLengthSeries.find(new int[]{1, 2, 1, 1, 2, 3}));
        assertEquals(1, MaxLengthSeries.find(new int[]{3, 2, 1}));
    }
}
