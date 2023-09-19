package class3;

public class E10ElseIf {
    public static void main(String[] args) {
        String fruit="apple"; //if we type any other fruit not in condition will not avaible sout
        if(fruit.equals("Mango")) {     //Fruit=="Mango"
            System.out.println("Price is 5$");
        }else if(fruit.equals("orange")) {
            System.out.println("Price is 4$");
        } else if (fruit.equals("apple")) {
            System.out.println("Price is 1000$");
        }else if(fruit.equals("kiwi")) {
            System.out.println("6$");
        }else{
            System.out.println("This Fruit is not avaible right now");

   // importnat if we use two same fruit conditio java will accept first right condition!
        }
    }
    }
