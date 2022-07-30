package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;
//либо весь пакет import  ru.job4j.math.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double diffAndDivision(double first, double second) {
        return sum(difference(first, second), division(first, second));
    }

    public static double sumAllAction(double first, double second) {
        return sum(sumAndMultiply(first, second), diffAndDivision(first, second));
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + diffAndDivision(10, 20));
        System.out.println("Результат расчета равен: " + sumAllAction(10, 20));
    }
}
