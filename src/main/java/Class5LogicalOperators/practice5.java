package Class5LogicalOperators;

public class practice5 {
    public static void main(String[] args) {
        int day = 5;
        if (day > 1 && day <= 5) {
            System.out.println("It is a weekday");
        } else if (day == 6 || day == 7) {
            System.out.println("it is a weekday");
        } else {
            System.out.println("invalid day");
        }
    }

}
