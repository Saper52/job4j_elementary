package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int fihish) {
        int count = 0;
        for (int i = 1; i <= fihish; i++) {
            if (CheckPrimeNumber.check(i)) {
                count++;
            }
        }
        return count;
    }
}
