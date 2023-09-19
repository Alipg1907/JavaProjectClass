package BreakKeyword;

public class BreakKeyword4 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Batch 17 is Greatest of all time");
            if(i%2==0){
                continue;
            }
            System.out.println("I was kidding");
        }
    }
}
//continue:
// Continue keyword is used to skip he code from a loop once we hit the skip keyword
//java ignores the rest of the code in the loop and jumps to the next iteration.!!