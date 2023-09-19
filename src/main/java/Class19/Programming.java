package Class19;

public class Programming {
    public Programming(){
        System.out.println("I love programming languages");
    }
    public Programming(String word) { //programming is grey color that means it s not using
        System.out.println("I love " + word);
    }

    public static void main(String[]args){
       Programming p = new Programming("Java");
    }
}




//Create a class named programming. while creating an object of the class,
// if nothing is passed to it, then the message
// "I love programming languages" should be printed.
//If some  String is poassed to it then in place of "programming languages"
// the value variavble should be printed. example, if we pass "Java", then " I love Java" should be printed.