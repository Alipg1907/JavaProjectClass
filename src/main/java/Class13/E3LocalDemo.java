package Class13;

public class E3LocalDemo {
    int sum=0; // you can use as local variable also.
   void addElements() {

       int[] arr = {10, 20, 30};
       int sum=0; //if it is possible always go with local variable
       for (int i = 0; i < arr.length; i++) {
                sum=sum+arr[i];
       }
       System.out.println(sum);
   }

}
//impostant for debugging local variable always better