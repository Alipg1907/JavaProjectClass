package Class5LogicalOperators;

public class E8AndOperators {
    public static void main(String[] args) {

        boolean goodCredit = false;
        boolean stableJob = true;
        boolean minimumAge = true;
        if (goodCredit && stableJob && minimumAge) {
            System.out.println("You can have the loan");
        } else {
            System.out.println("You need to fulfill all the requirements");
        }
    }

}