package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ArrayCharTest {
    @Test
    public void whenStartWithPrefixThenTrue1() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean rsl = ArrayChar.startWith(word, pref);
        assertThat(rsl, is(true));
    }

    @Test
    public void whenStartWithPrefixThenTrue2() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e', 'l', 'l', 'o'};
        boolean rsl = ArrayChar.startWith(word, pref);
        assertThat(rsl, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse1() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean rsl = ArrayChar.startWith(word, pref);
        assertThat(rsl, is(false));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse2() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'h', 'e'};
        boolean rsl = ArrayChar.startWith(word, pref);
        assertThat(rsl, is(false));
    }
}
