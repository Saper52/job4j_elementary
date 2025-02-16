package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SquareTest {

    @Test
    public void whenBound3Then0124() {
        int bound = 3;
        int[] result = Square.calculate(bound);
        int[] expected = {0, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenBound5Than014916() {
        int bound = 5;
        int[] result = Square.calculate(bound);
        int[] expected = {0, 1, 4, 9, 16};
        assertThat(result).containsExactly(expected);
    }
}