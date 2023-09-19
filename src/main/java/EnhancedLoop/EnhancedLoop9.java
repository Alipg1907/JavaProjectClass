package EnhancedLoop;

public class EnhancedLoop9 {
    public static void main(String[] args) {
        int[] nums = {10, 23, 25, 56, 45, 20};
        //nums[1]=0; // means array1 change with 0
        for (int i = 0; i < nums.length ; i++) {

            if(nums[i]>20){
                nums[i]=0;

            }
            System.out.println(nums[i]);
        }

    }
}
