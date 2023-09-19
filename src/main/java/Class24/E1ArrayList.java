package Class24;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<String>();
        names.add("Deepali");
        names.add("Ahmed");
        names.add("Mike");
        names.add("John");
        names.add("Ali");

        //names.remove(0);
        names.remove("Deepali");
        System.out.println(names);
        names.add("Ehab");
        names.add(2,"ehab");
        System.out.println(names);
        names.set(1,"Jamel");
        System.out.println(names);


    }
}
