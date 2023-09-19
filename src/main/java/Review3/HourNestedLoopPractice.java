package Review3;

public class HourNestedLoopPractice {
    public static void main(String[] args) {

        for(int h=0;h<24;h++){
            for (int m = 0; m < 60; m++) {

                for (int s = 0; s <60 ; s++) {
                    if(s<10 &&m<10){
                        System.out.println(h+":0"+m+":0"+s);
                    }else if(s>=10 &&m<10){
                        System.out.println(h+":0"+m+":"+s);
                    }else{
                        System.out.println(h+":"+m+":"+s);
                    }

                }
            }

        }
    }
    }



// A nested loop is a loop inside another loop.
//Nested loops are used to solve complex problems in which we have nested data
// or we need to perform nested iterations,
// We can nest a for loop inside a while loop or a for loop inside another for loop.
// Why nested loops:
// As a tester we will be needing them to read excel data.
// We will be needing them to go through multiple pages and from
// each page wemight want to go through multiple items.
//Syntax
//  for (int i = 0; i < ; i++){
//  for (int j = 0; j < ; j++)}