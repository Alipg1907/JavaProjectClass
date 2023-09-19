package main.java.Class24;

import java.util.ArrayList;

public class Drinks {

    public static void main(String[] args) {

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("coffee");
        drinks.add("tea");
        drinks.add("cola");
        drinks.add("sprite");

        for (int i = 0; i < drinks.size(); i++) {

            if(drinks.get(i).contains("a")|| drinks.get(i).contains("e")){
                drinks.set(i,"water");


            }

        }



        System.out.println(drinks);



    }

}
