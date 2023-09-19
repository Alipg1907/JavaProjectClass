package Class5LogicalOperators;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Height in inches"); //prompt the user
        int height = input.nextInt(); //to enter person height inj inches
        if (height < 60) {
            System.out.println("short");
        } else if (height >= 60 && height <= 72) {
            System.out.println("Medium");

        } else {
            System.out.println("Tall");
        }
    }

}
