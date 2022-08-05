package ru.job4j.condition;

/* isEven() - проверяет, что число четное;
isPositive() - проверяет, что число положительное;
 */
public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return num < 0;
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static boolean notEvenOrNotPositive(int num) {
        return notEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(LogicNot.isEven(num));
    }
}
