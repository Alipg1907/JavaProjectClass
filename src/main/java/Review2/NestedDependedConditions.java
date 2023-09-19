package Review2;

public class NestedDependedConditions {
    public static void main(String[] args) {
        String day = "monday";
        boolean winter = false;

        double accountBalance = 5000;
        //with non primitive CANT use == !! after IF
        // == equals() != !equals() means not equal
        if (winter) {
            if (day.equals("Sunday")) {

                if (accountBalance > 2000) {
                    System.out.println("we can buy this");


                } else {
                    System.out.println("it is too expensive");
                }

            }    /////Diffrec

        } else if (day.equals("Saturday")) {
            System.out.println("It is saturday Let s go dinner");

        } else {
            System.out.println("lets wait for Sunday");
        }
    }
}

/**
 * if () {
 *
 * }  if() {
 *
 * }
 */

//With primitive datatype we can use >< == ! = etc but with
// with nonprimitive we have to use the equal method.


