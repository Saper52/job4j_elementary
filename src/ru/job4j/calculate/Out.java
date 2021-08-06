package ru.job4j.calculate;

public class Out {
    public static void main (String [] args){
        String lyrics = "На улице лето";
        System.out.println(lyrics);
        String name = "Ivan";
        String surname = "Inanov";
        String otchestvo = "Ivanych";
        String probel = " ";
        byte age = 33;
        String id = name+probel+surname+probel+otchestvo +probel +age +" лет";
        System.out.println(id);
    }
}
