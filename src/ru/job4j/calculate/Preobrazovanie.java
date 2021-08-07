package ru.job4j.calculate;

public class Preobrazovanie {
    public static void main(String[] args) {
        byte q = 127; // от -128 до 127;
        short w = q; // от -32768 до 32767
        int e = w;   // от -2147483648 до 2147483647
        long r = e;  // от -9223372036854775808 до 9223372036854775807
        System.out.println("Преобразование числа без потерь " + r + " " + e + " " + w + " " + q);
        double t = 1.1234413; // от -3.4E+38 до 3.4E+38
        int y = (int) Math.round(t); // от -1.7E+308 до 1.7E+308
        System.out.println("Преобразование чисел с плавающей точкой" + t + " " + y);
        int u = 110;        // от -2147483648 до 2147483647
        char i = (char) u; // от 0 до 65536, это символи в юникод, знаки препинания и иероглифы
        System.out.println("Преобразование из инт в чар " + i);
        int rsl = 100 + 'h';
        System.out.println("Результат вычисления: " + rsl);
    }
}
