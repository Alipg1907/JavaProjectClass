package Class5LogicalOperators;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number please");
        double number = input.nextDouble();
        if (number >= 1 && number <= 10) {
            System.out.println("It is a small number");
        } else if (number >= 11 && number <= 100) {
            System.out.println("It is medium number");
        } else if  (number >= 101 && number <= 1000) {
            System.out.println(" it is large number");
        }
    }
}

