package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static int indexInRange(int[] data, int el, int start, int finish) {
        int[] range = new int[finish + 1];
        for (int i = start; i <= finish; i++) {
            range[i] = data[i];
        }
        return indexOf(range, el);
    }
}

