package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[]{5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = {5, 6, 7, 8, 9};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasNot8ThenMinus1() {
        int[] data = new int[]{5, 1, 8, 2, 6, 4, 9};
        int el = 11;
        int start = 2;
        int finish = 5;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenStartEqualFinishThenMinus1() {
        int[] data = {1, 3, 5, 6, 7, 8, 16};
        int el = 8;
        int start = 4;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}