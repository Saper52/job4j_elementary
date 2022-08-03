package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int result = Max.max(1, 2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To4Then5() {
        int left = 5;
        int right = 4;
        int expexted = 5;
        int result = Max.max(5, 4);
        assertThat(result).isEqualTo(expexted);
    }

    @Test
    public void when5To5ThenEqual() {
        int left = 5;
        int right = 5;
        int expected = 5;
        int result = Max.max(5, 5);
        assertThat(result).isEqualTo(expected);
    }
}