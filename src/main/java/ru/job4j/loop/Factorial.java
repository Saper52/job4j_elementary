package ru.job4j.loop;

public class Factorial {
    public static int calc(int in) {
        int sum = 1;
        for (int i = 2; i <= in; i++) {
            sum = sum * i;
        }
        return sum;
    }
}