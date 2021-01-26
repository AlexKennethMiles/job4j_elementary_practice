package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {
    @Test
    public void maxR1L2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void maxR2L0() {
        int result = Max.max(2, 0);
        assertThat(result, is(2));
    }

    @Test
    public void maxRNeg1L2() {
        int result = Max.max(-1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void maxR1L1() {
        int result = Max.max(1, 1);
        assertThat(result, is(1));
    }
}
