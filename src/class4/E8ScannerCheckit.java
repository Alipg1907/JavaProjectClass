package class4;

import java.util.Scanner;

public class E8ScannerCheckit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your name");
        String name=scanner.next();
        if (name.equals("Fenerbahce")) {
            System.out.println("this year will be champion");
        }else if (name.equals("AliPG")) {
            System.out.println("I am FB fan");
        }else if (name.equals("notChampion")){
        System.out.println("That is not Funny");

        }
    }
    }

