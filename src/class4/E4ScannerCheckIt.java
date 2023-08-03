package class4;

import java.util.Scanner;

public class E4ScannerCheckIt {
    public static void main(String[] args) {
        System.out.println("Please Enter Your Name");


        Scanner scanner=new Scanner(System.in);
        // taking an input from the user and storing in int a name variable
        //creating the object of the Scanner so that we can reuse the
        //logic from this class which is already written for us by java developers
        String name=scanner.next();
        if (name.equals("Ali")) {
            System.out.println("Java instructor");
        } else{
            System.out.println("I don't know you");

        }


    }
}
