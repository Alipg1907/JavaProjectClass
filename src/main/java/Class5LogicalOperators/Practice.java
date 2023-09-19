package Class5LogicalOperators;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What month did you born");
        String month = input.nextLine();
        if (month.equals("June") || month.equals("July")
                || month.equals("August")) {
            System.out.println("You were born in summer season");
        } else if (month.equals("November") || month.equals("December")
                || month.equals("January")) {
            System.out.println("You were born in winter season");
        } else {
            System.out.println("You were born in fall season");

        }
    }
}

