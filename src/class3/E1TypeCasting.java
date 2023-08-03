package class3;

public class E1TypeCasting {
    public static void main(String[] args) {
        // byte<short<int<long<float<double primitive sizes

        long age=12;
        /// int myAge=age; you cant use smaller variable !! it will give you error

        // byte myAge=age
        byte number=10;
        int number2=number;
        System.out.println(number2);

        float num1=15.6f;
        int num2;
        num2=(int)num1;
        System.out.println(num2);

        float box1=15.0f;
         int box2;
         box2=(int)box1; // tyoe casting narrowing/implicit/manual

         // even decimel number is ending with 0 it will give error so you must to use
           /// must use parantheses for non-decimal part of the float




    }
}
