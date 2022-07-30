package ru.job4j.condition;

public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java! ";
        System.out.println(idea);
        idea += "But I am a newbie.";
        int year = 2022;
        idea += year;
        System.out.println(idea);
        int i = 10000;
        byte b = (byte) i;
        short s = (short) i;
        System.out.println("Вывод в консоль значения после преобразования: " + b);
        System.out.println("Вывод в консоль значения после преобразования: " + s);
        double d = 94.984751;
        int ii = (int) Math.round(d);
        short ss = 1500;
        char cc = (char) ss;
        double dd = cc;
        System.out.println("Вывод в консоль значения после преобразования: " + dd);
    }
}
