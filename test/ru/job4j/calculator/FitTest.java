package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void manWeight() {
        short height = 187;
        double expected = 100.05F;
        double rsl = Fit.manWeight(height);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void womanWeight() {
        short height = 170;
        double expected = 80.5F;
        double rsl = Fit.manWeight(height);
        Assert.assertEquals(expected, rsl, 0.01);
    }
}