package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap4to7() {
        int[] input = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int source = 4;
        int dest = 7;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {0, 1, 2, 3, 7, 5, 6, 4, 8, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap5to9() {
        int[] input = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int source = 5;
        int dest = 9;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {0, 1, 2, 3, 4, 9, 6, 7, 8, 5};
        assertThat(result).containsExactly(expected);
    }
}
