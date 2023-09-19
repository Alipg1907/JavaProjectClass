package EnhancedLoop;

public class EnhancedLoop10Practice {
    public static void main(String[] args) {
        int[] nums = {10,77,25,56,60,20,-10,-5};
        int smallest = nums[6];
        for(int n:nums){
            if(n<smallest){
                smallest=n;
            }

        }
        System.out.println(smallest);
    }
}


//find the smallest number , expected answer 10