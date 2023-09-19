package Class11;

import java.util.Scanner;

public class method {
    public static void main(String[] args) {
    takeUserInput();
        System.out.println("Please enter the details again");
    takeUserInput();


    }
    static void takeUserInput(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please, enter your name");
        String name=scan.nextLine();
        System.out.println("Please, enter your age");
        int age=scan.nextInt();
        System.out.println("Your name is "+name+" and you are "+age+" years old");

    }

}

