package Review3;

import java.util.Scanner;

public class SwitchWithLoop {

    public static void main(String[] args) {
        for (int i = 1 ; i <= 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("What is your favorite fruit");
            String fruit = scanner.next();

            switch (fruit) {
                case "orange":
                    System.out.println("It is usually Orange");
                    break;
                case "banana":
                    System.out.println("Yellow Bananas are good");
                    break;
                case "Strawberry":
                    System.out.println("I like Red Strawberries");
                    break;
                case "Blue berry":
                    System.out.println("Blue berries are very good for heart");
                    break;
                default:
                    System.out.println("I don't like this fruit");

            }
        }
    }
}