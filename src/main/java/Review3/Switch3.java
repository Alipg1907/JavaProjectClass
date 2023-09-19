package Review3;

import java.util.Scanner;

public class Switch3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
