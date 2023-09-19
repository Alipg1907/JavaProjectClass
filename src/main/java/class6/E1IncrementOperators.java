package class6;

//Operators are Symbol which perform an operation on data.
// There are many different types of operators in java.
//for example
//Arithmetic operators
//These operators help us perorm simple mathmetical operations \
//such as
//Addition => +
//Subtraction => -
// Multiplication => *
//Division => /
//Modulus => %
//    SHORTHAND operators
// -- They help us perform Mathematical operations but using a little shorter syntax.
// add and update the variable += int a=10 a=20 =>30
// subtract and update the variable -= int a=10 a-=2= => -10
// Multiple and update the variable *= int a=10 a*20 => 200
//Multiple and update the variable *= int a=10 a*20 =>200
// Divide and update teh variable /= int a=10 a/=20 => 0
// Modulus and update the variable %= int=10 a%20 => 10
//note 10%20 if the first number smaller than second one,results will be always first one
// Relational Operators
//There operators help us compare things
// == checks if two objects are equal
// != check if two objects are not equal
// > Greater than
// < Less than
// >= greater than and equal
// <= less than equal
//
//Logical Operators
// They help us combine multiple boolean conditions.
// ! NOT
// || OR
// && AND
// Increment / Decrement operators
// ++  'This will help us increase the value of a variable by one'
// --  'This will help us decrease the value of a variable by one'
//  Example int =age18; age++; >>>>>sout(age): 19 (++increased +1)
// very important sout(++age) increment will be first then will be printed
// If sout(age++) print will be frist increment will be later !!!
//




public class E1IncrementOperators {
    public static void main(String[] args) {
        int age=100;
        age++; //101
        age++; //102
        age--; //101

        System.out.println(age);
    }

}
