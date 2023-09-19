package Review2;

public class IfElseScanner {
    public static void main(String[] args) {
        int age=30;
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
