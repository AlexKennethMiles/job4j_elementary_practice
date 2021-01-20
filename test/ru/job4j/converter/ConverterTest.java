package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {
    @Test
    public void rubleToEuro() {
        int in = 140;
        int expected = 2;
        int euro = Converter.rubleToEuro(in);
        Assert.assertEquals(euro, expected);
    }

    @Test
    public void rubleToDollar() {
        int in = 240;
        int expected = 4;
        int dollar = Converter.rubleToDollar(in);
        Assert.assertEquals(dollar, expected);
    }

    @Test
    public void euroToRuble() {
        int in = 15;
        int expected = 900;
        int ruble = Converter.dollarToRuble(in);
        Assert.assertEquals(ruble, expected);
    }

    @Test
    public void dollarToRuble() {
        int in = 5;
        int expected = 350;
        int ruble = Converter.euroToRuble(in);
        Assert.assertEquals(ruble, expected);
    }
}
