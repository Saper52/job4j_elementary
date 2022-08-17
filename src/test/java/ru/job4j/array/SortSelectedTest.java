package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort321() {
        int[] data = new int[]{3, 2, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort64597() {
        int[] data = new int[]{6, 4, 5, 9, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{4, 5, 6, 7, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortRandomValues() {
        int[] data = new int[]{5, 8, 7, 2, 3, 4, 0, 5, 7, 8, 2, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{0, 2, 2, 3, 3, 4, 5, 5, 7, 7, 8, 8};
        assertThat(result).containsExactly(expected);
    }
}