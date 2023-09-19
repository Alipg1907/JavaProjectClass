package Class14;
//Create a method that will accept an array as parameter and returns reversed String.
// Method should be avaible
// to all classes within your project and accesible by class name
public class Task3Ask {


    static String reverseStr(String inputStr){

        String reversed="";
        for (int i = inputStr.length()-1; i>=0; i--) {
            reversed=reversed+inputStr.charAt(i);

        }
        return reversed;

    }

}


