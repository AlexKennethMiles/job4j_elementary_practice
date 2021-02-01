package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int expected = 120;
        int res = Factorial.calc(5);
        assertThat(res, is(expected));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int expected = 1;
        int res = Factorial.calc(0);
        assertThat(res, is(expected));
    }
}
