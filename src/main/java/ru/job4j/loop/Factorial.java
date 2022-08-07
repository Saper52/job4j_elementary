package ru.job4j.loop;

public class Factorial {
    public static int calc(int in) {
        int sum = 1;
        if (in != 0) {
            for (int i = 1; i <= in; i++) {
                sum = sum * i;
            }
        }
        return sum;
    }
}