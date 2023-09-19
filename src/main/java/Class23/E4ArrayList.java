package Class23;

import java.util.ArrayList;

public class E4ArrayList {

    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList();
        arr.add("Ace");
        arr.add("habib");
        arr.add("3");
        System.out.println(arr.get(0));
        System.out.println(arr.isEmpty()); //checks if it is empty
        System.out.println(arr.contains("Ace")); //searches if the "Ace in array
        System.out.println(arr.indexOf("habib"));
    }
}
