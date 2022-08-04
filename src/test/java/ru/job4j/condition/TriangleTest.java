package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class TriangleTest {

    @Test
    public void whenAB4toAC5toBC1ThenNotExist() {
        boolean result = Triangle.exist(4, 5, 1);
        assertThat(result).isFalse();
    }

    @Test
    public void whenAB4toAC5toBC4ThenTrianglExist() {
        boolean result = Triangle.exist(4, 5, 4);
        assertThat(result).isTrue();
    }
}