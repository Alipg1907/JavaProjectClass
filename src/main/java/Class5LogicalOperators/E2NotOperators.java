package Class5LogicalOperators;

//write a program that checks if the country is not equal to Iran
//it says you are allowed
public class E2NotOperators {
    public static void main(String[] args) {
        String country = "Iran";
        if (!country.equals("China")) {
            System.out.println("welcome you are allowed");
        } else {
            System.out.println("you are not allowed'");
        }
    }
}
