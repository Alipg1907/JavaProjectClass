package Review2;


// Type casting is converting data from one datatype to another datatype.
// For example we can convert an integer to float or other way around.
// there are two types of type casting
// 1) implicit/Auto/widening
//2) explicit/manual/narrowing
//example:
//int number=(float)10.5  WRONG
// must be same datatype !!
// String s=(String)'C'; //it will give error because,
//

public class Casting {
    public static void main(String[] args) {
        int number=(int)10.5;
        System.out.println(number);

        float num=20.100F;
        long num2 = 10;
        num2=(long)num;
        System.out.println(num2);

        //boolean bool=(boolean)12.5; error
        char c=(char)1907; //explicit // number 1 or number is coming from ASCII Table
        System.out.println(c);
    }
}

