package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return rsl;
    }

    public static void main(String[] args) {
        double result = TrgArea.area(3, 3, 3);
        System.out.println("Хелов, площадь треугольника равна " + result);
    }
}
