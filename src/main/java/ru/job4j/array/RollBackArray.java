package ru.job4j.array;

public class RollBackArray {
    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            int lastIndex = index;
            int currentIndex = result.length - 1 - index;
            result[currentIndex] = array[lastIndex];
        }
        return result;
    }
}