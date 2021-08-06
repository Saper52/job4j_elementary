package ru.job4j.calculator;

public class MathFunc {
    public static int func1(int x) {
        int y = x * x + 10;
        return y;
    }

    public static int func2(int x) {
        int y = 1 / x;
        return y;
    }

    public static int func3(int x) {
        int y = 8 / x * 2;
        return y;
    }

    public static void main(String[] args) {
        int result1 = MathFunc.func1(3);
        int result2 = MathFunc.func2(50);
        int result3 = MathFunc.func3(1);
        int total = result3;
        System.out.println(total);
    }
}