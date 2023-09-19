package class3;

public class E7IfElseStatements { // if we use curly braces w don't use semi-colon
    public static void main(String[] args) {
        double accountBalance=800;
        double price=1000;
        if(accountBalance>=price) { //800>=1000 false if statements false java will ignore it amd will use else
            System.out.println("You can buy this item");
        }else{
            System.out.println("You need to save more");

        }

    }
}
