package ru.job4j;


public class Examples {
    public static void maks(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("Max number - a");
        } else if (c > b) {
            System.out.println("Max number - c");
        } else {
            System.out.println("Max number - b");
        }
    }

    public static void main(String[] args) {
        Examples.maks(4, 6, 7);
    }
}