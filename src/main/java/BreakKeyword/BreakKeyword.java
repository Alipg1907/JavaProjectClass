package BreakKeyword;

public class BreakKeyword {
    public static void main(String[] args) {

        int[] nums = {10, 23, 25, 56, 45, 20};

        for(int n:nums){

            if(n==45){
                System.out.println("found");
                break;
            }
        }

    }
}

//You have to search the array for number 45 it is present in the array
// print found
//Break Keyword:
//Break keyword is used in switch cases statements and with the loop to terminate
//the loop prematurely.
//why should we use break keyword?
//Using break keyword can help save a lot of processing time and our code can
// execute faster.