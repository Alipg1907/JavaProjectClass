package Review9;

import java.util.Scanner;

public class PrinterTester {
    public static void main(String[] args) {
        Printer p=new Printer();
        p.print("java");
        p.print("java",20);
        p.print(10,20,20,34,56,8989);
        p.print("a","s","d");
        p.print(21.2,11.2,22.5);
        System.out.println();
        System.out.println(Math.abs(15));
        Scanner scanner=new Scanner(System.in);
        scanner.nextByte();
        scanner.nextByte(2);
        //String.valueOf(100);
        String str=String.valueOf(100);
        System.out.println(str);
    }
}
