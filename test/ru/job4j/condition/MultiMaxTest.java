package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultiMaxTest {
    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(1, 0, -2);
        assertThat(result, is(1));
    }

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(-2, 1, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenEqual() {
        int result = MultiMax.max(0, 0, 0);
        assertThat(result, is(0));
    }
}
