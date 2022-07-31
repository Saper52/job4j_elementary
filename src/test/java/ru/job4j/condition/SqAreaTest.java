package ru.job4j.condition;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int p = 6;
        int k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K3Square4dot68() {
        int p = 10;
        int k = 3;
        double expected = 4.68;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP35K4Square49() {
        int p = 35;
        int k = 4;
        double expected = 49;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP50K4Square100() {
        int p = 50;
        int k = 4;
        double expected = 100;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected);
    }
}