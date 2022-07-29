package ru.job4j.calculator;

public class Calculator {
    public static void plus(int one, int two) {
        int onePlustwo = one + two;
        System.out.println(onePlustwo);
    }

    public static void main(String[] args) {
        Calculator.plus(1, 2);
        Calculator.plus(2, 5);
    }
}
