package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void whenExist() {
        boolean result = Triangle.exist(3.0, 4.0, 5.0);
        assertThat(result, is(true));
    }

    @Test
    public void whenDoesntExist() {
        boolean result = Triangle.exist(1.0, 1.0, 10.0);
        assertThat(result, is(false));
    }
}
