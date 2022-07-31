package ru.job4j.condition;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to45then5dot83() {
        int x1 = 1;
        int y1 = 0;
        int x2 = 4;
        int y2 = 5;
        double expected = 5.83;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1534to3029then15dot81() {
        int x1 = 15;
        int y1 = 34;
        int x2 = 30;
        int y2 = 29;
        double expexted = 15.81;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expexted, out, 0.01);
    }

    @Test
    public void when342to764then22dot36() {
        int x1 = 3;
        int y1 = 42;
        int x2 = 7;
        int y2 = 64;
        double expected = 22.36;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}