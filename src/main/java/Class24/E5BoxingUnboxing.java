package main.java.Class24;

public class E5BoxingUnboxing {
    public static void main(String[] args) {

        int a=10;
        Integer number = new Integer(a); // longer way boxing
        Integer number2=10;
        // int to Integre or from primitive to ClassType => Boxing
        int d= number2.intValue(); // converting from a class to a primitive

        //when we go from class to primitive datatype it s called unboxing
        System.out.println(d); // shorter way AUTOBOXING
        Integer c=10;
        int f=c; // Auto UNBOXING!
        System.out.println(f);








    }
}
