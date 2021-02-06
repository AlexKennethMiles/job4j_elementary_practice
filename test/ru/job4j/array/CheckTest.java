package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CheckTest {
    @Test
    public void whenArrayIsMono() {
        boolean[] input = {false, false, false, false, false, false};
        boolean rsl = Check.mono(input);
        assertThat(rsl, is(true));
    }

    @Test
    public void whenArrayIsNotMono() {
        boolean[] input = {true, true, true, true, false, true};
        boolean rsl = Check.mono(input);
        assertThat(rsl, is(false));
    }

    @Test
    public void whenArrayIsMonoAdditional() {
        boolean[] input = {false};
        boolean rsl = Check.mono(input);
        assertThat(rsl, is(true));
    }
}
