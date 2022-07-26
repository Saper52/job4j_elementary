package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void whenP12K3Square45(){
        double expected = 4.5;
        int p = 12;
        double k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void whenP20K4Square8(){
        int expected = 8;
        int p = 20;
        double k=4;
        double out = SqArea.square(p,k);
        Assert.assertEquals(expected, out, 0.01);
    }
}