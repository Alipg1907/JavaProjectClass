package Class5LogicalOperators;

import java.util.Scanner;

public class E3NoOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the name of the country");
        String country = input.nextLine();

        if (!country.equals("Iran")) {
            System.out.println("welcome you are allowed");
        }
    }
}

//if you dont want to worry about lower/upper case input
//You can use equalsIgnoreCase()