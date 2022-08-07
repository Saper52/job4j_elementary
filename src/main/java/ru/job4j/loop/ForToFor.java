package ru.job4j.loop;

public class ForToFor {
    public static void main(String[] args) {
        int count = 0;
        int countTwo = 0;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println(
                        "Значение индекса внешнего цикла: " + i
                                + " и значение индекса вложенного цикла: " + j
                );
                count = count + 1;
            }
            countTwo++;
        }
        System.out.println("Количество итераций во вложенном цикле: " + count);
        System.out.println("Количество итераций во внешнем цикле: " + countTwo);

    }
}
