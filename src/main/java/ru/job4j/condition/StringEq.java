package ru.job4j.condition;

public class StringEq {
    public static void main(String[] args) {
        String first = new String("two");
        String one = "one";
        String three = "lalalal";
        if (first == one) {     /*нельзя так сравнивать переменные с ссылочным типом, */
            System.out.println("first equals one (compare through ==)"); /* т.к. они хранят в */
        } else {                                                         /* себе адрес на объект в котором значение */
            System.out.println("first does not equal one (compare through ==)");
        }
        if (first.equals(three)) {
            System.out.println("first equals three");
        } else {
            System.out.println("first does not equal three");
        }
        System.out.println(first + " " + one + " " + three);
    }
}
