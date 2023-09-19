package EnhancedLoop;

public class EnhancedLoop3 {
    public static void main(String[] args) {
        int[] nums = {10, 23, 25, 56, 45, 20};
        int largest=0;

        for (int n:nums){

            if(n>largest){
                largest=n;
            }

        }
        System.out.println(largest);

    }
}


//Find largest number