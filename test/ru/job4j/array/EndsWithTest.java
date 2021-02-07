package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class EndsWithTest {
    @Test
    public void whenEndWithPrefixThenTrue1() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean rsl = EndsWith.endsWith(word, post);
        assertThat(rsl, is(true));
    }

    @Test
    public void whenEndWithPrefixThenTrue2() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'H', 'e', 'l', 'l', 'o'};
        boolean rsl = EndsWith.endsWith(word, post);
        assertThat(rsl, is(true));
    }

    @Test
    public void whenEndWithPrefixThenTrue3() {
        char[] word = {'o'};
        char[] post = {'o'};
        boolean rsl = EndsWith.endsWith(word, post);
        assertThat(rsl, is(true));
    }

    @Test
    public void whenEndWithPrefixThenTrueAdditional1() {
        char[] word = {'o'};
        char[] post = {};
        boolean rsl = EndsWith.endsWith(word, post);
        assertThat(rsl, is(true));
    }

    @Test
    public void whenEndWithPrefixThenTrueAdditional2() {
        char[] word = {};
        char[] post = {};
        boolean rsl = EndsWith.endsWith(word, post);
        assertThat(rsl, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse1() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'e'};
        boolean rsl = EndsWith.endsWith(word, post);
        assertThat(rsl, is(false));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse2() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'H', 'e', 'l', 'l', 'e'};
        boolean rsl = EndsWith.endsWith(word, post);
        assertThat(rsl, is(false));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse3() {
        char[] word = {'o'};
        char[] post = {'e'};
        boolean rsl = EndsWith.endsWith(word, post);
        assertThat(rsl, is(false));
    }
}
