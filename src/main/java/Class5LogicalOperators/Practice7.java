package Class5LogicalOperators;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number");
        int number = scanner.nextInt();
        if (number >= 1 && number <= 10) {
            System.out.println("small");
        } else if (number >= 11 & number <= 100) {
            System.out.println("medium");


        } else if (number >= 101 && number <= 1000) {
            System.out.println("large");
        }
    }

}
