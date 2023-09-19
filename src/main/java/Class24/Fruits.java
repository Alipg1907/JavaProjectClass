package main.java.Class24;

import java.util.ArrayList;

public class Fruits {

    /*
    create an arraylist of fruit then remove all the fruit which contains the
    letter "a" or ends with the letter "e"
     */
    public static void main(String[] args) {


        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("milk");
        fruits.add("banana");
        fruits.add("coffee");
        fruits.add("table");
        fruits.add("Bee");
        fruits.add("TV");


        // Lamda method
        fruits.removeIf(y ->y.contains("a")||y.endsWith("e"));
        System.out.println(fruits);

        String name ="ghkjkg";
        var name2="dsffs";
        var age=20;
        var salary=1000;


    }
}