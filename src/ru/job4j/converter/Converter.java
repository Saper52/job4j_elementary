package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 рублей это " + euro);
        int in = 140;
        int expected = 2;
        int out = (int) Converter.rubleToEuro(140);
        boolean itogo = expected == out;
        System.out.println("140 рублей это 2 евро - " + itogo);
        int inD = 120;
        int expectedD = 2;
        int outD = (int) Converter.rubleToDollar(120);
        boolean passedD = outD == expectedD;
        System.out.println("120 рублей это 2 доллара - " + passedD);
    }
}
