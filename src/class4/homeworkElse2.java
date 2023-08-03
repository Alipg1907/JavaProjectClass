package class4;

import java.util.Scanner;

public class homeworkElse2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the city");
        String city=scanner.next();
        System.out.println("Please enter the temperature");
        int temp = scanner.nextInt();
        int celsius = 5*(temp - 32)/9;
        System.out.println("The temperature of the " + city + " is " + celsius);


    }



}
