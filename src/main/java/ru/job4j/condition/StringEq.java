package ru.job4j.condition;

public class StringEq {
    public static void main(String[] args) {
        String first = new String("two");
        String one = "one";
        String three = "lalalal";
        if (first==one){
            System.out.println("first equals one (compare through ==)");
        } else {
            System.out.println("first does not equal one (compare through ==)");
        }
        if (first.equals(three)){
            System.out.println("first equals three");
        } else {
            System.out.println("first does not equal three");
        }
        System.out.println(first + " " + one + " " + three);
    }
}
