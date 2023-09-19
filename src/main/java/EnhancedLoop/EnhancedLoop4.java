package EnhancedLoop;

public class EnhancedLoop4 {
    public static void main(String[] args) {
        int[] nums = {-10, -23, -25, -56, -45, -20};
        int largest= nums[4]; //or we can write int largest= -56

        // instead of 0 put element number !!
        //If numbers are negative if we initiliaze int to 0 we qill not get
        // right reults!! so it is better to initiliza it to any element number on loop

        for (int n:nums){

            if(n>largest){
                largest=n;
            }

        }
        System.out.println(largest);

    }

}
