package Class5LogicalOperators;

import java.util.Scanner;

public class Practice11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("what is your country");
        String country=input.nextLine();
        country=country.toLowerCase(); //it will let you use first letter upper !
        switch (country) {
            case "turkey" :
            System.out.println("Turkish");
            break;
            case "italian":
                System.out.println("Italian");
                break;
            case "usa":
                System.out.println("English");
                break;
            default:
                System.out.println("wrong country");

        }

    }
}
