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

    @Test
    public void whenDiagonal() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'}
        };
        char[] rsl = MatrixCheck.extractDiagonal(input);
        char[] expect = {'X', 'X', 'X'};
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenDiagonalIsDifferent() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'Y', ' '},
                {' ', ' ', 'Z'}
        };
        char[] rsl = MatrixCheck.extractDiagonal(input);
        char[] expect = {'X', 'Y', 'Z'};
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenDiagonalOfOne() {
        char[][] input = {{'X'}};
        char[] rsl = MatrixCheck.extractDiagonal(input);
        char[] expect = {'X'};
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenDataMonoVerticalByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataMonoByFalseThenFalse() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenDataMonoHorizontalByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataMultipleMono() {
        char[][] input = {
                {' ', 'X', ' ', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', 'X', 'X', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(true));
    }
}
