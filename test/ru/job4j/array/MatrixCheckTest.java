package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixCheckTest {
    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };
        boolean rsl = MatrixCheck.monoHorizontal(input, 1);
        assertThat(rsl, is(true));
    }

    @Test
    public void whenHasMonoHorizontalNotThere() {
        char[][] input = {
                {'X', 'X', 'X'},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };
        boolean rsl = MatrixCheck.monoHorizontal(input, 2);
        assertThat(rsl, is(false));
    }

    @Test
    public void whenHasNotMonoHorizontal() {
        char[][] input = {
                {'1', 'I', '!'},
                {'!', '1', 'I'},
                {'I', '!', '1'}
        };
        boolean rsl = MatrixCheck.monoHorizontal(input, 0);
        assertThat(rsl, is(false));
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'}
        };
        boolean rsl = MatrixCheck.monoVertical(input, 2);
        assertThat(rsl, is(true));
    }

    @Test
    public void whenHasNotMonoVertical() {
        char[][] input = {
                {'1', '!', 'I'},
                {'I', '1', '!'},
                {'!', 'I', '1'}
        };
        boolean rsl = MatrixCheck.monoVertical(input, 0);
        assertThat(rsl, is(false));
    }

    @Test
    public void whenHasMonoVerticalNotThere() {
        char[][] input = {
                {'X', ' ', 'X'},
                {'X', ' ', 'X'},
                {'X', ' ', 'X'}
        };
        boolean rsl = MatrixCheck.monoVertical(input, 1);
        assertThat(rsl, is(false));
    }
}
