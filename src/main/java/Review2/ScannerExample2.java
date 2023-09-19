package Review2;

import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your Fullname");
        String fName=scanner.nextLine();
        System.out.println("Please Enter your City");
        String city=scanner.nextLine(); // to consume the enter press
        System.out.println(fName+" "+city);

    }
}
