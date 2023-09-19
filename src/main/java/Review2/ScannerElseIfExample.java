package Review2;

import java.util.Scanner;

public class ScannerElseIfExample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your age to calculate the discount");

        int age=scanner.nextInt();
        /*
        if age is greater than 60 offer 20% discount
        if age is greater than 50 offer 15% discount
        if age is greater than 40 offer 10% discount
        no discount
         */
        if(age>60){
            System.out.println("You get 20% Discount");
        }else if(age>50){
            System.out.println("you get 15% Discount");
        }else if(age>40){
            System.out.println("you get 10% Discount");
        }else{
            System.out.println("No Discount for. Please try after 10 years");
        }
    }
}