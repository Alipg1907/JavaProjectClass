package main.java.Class24;

import java.util.ArrayList;

public class Cars {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("AUDI");
        cars.add("VOLVO");
        System.out.println(cars);
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        for (String car : cars) {
            System.out.println(car);


        }
    }
}
