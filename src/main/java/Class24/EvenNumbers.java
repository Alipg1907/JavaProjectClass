package main.java.Class24;

import java.util.ArrayList;

public class EvenNumbers {
    public static void main(String[] args) {
        ArrayList<Integer>evenNumbers = new ArrayList<>();
        for (int i = 2; i <= 500 ; i +=2) {
            evenNumbers.add(i);
        }

       /* for (int i = 0; i < evenNumbers.size() ; i++) {
            if(evenNumbers.get(i)%5==0){
                evenNumbers.remove(i);
            }

        }*/


        evenNumbers.removeIf(banana-> banana % 5 ==0);
        System.out.println(evenNumbers);
    }


}

//Create an arrayList of even numbers from 1
//to 500. Remove any number that is divisible
//by 5 from that arrayList.