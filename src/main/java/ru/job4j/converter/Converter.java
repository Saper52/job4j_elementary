package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {

        int rubles = 200;
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(200);
        System.out.println("140 rubles are " + euro + "euro");
        System.out.println(rubles + " rubles are " + dollar + "dollar$");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        in = 120;
        expected = 2;
        out = Converter.rubleToDollar(in);
        passed = out == expected;
        System.out.println("120 rubles are 2 dollars. Test result : " + passed);
    }
}
