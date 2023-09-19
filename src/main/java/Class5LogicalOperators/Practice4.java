package Class5LogicalOperators;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner dayput = new Scanner(System.in);
        System.out.println("what is number the day");
        int day = dayput.nextInt();
        if (day >= 1 && day == 5) {
            System.out.println("it is a weekday");
        } else if (day > 5 && day == 7) {
            System.out.println("It is a weekday");

            } else {
                System.out.println("invalid day");
            }
        }
    }



