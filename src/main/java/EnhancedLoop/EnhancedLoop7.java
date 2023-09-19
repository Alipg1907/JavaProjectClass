package EnhancedLoop;

public class EnhancedLoop7 {
    public static void main(String[] args) {
        int[] nums = {10,77,25,56,60,20};
        int largest=nums[2]; // because it is asking even number you must initiliza with an even number !
        for(int d:nums ){

            if(d>largest&& d%2==0){
                largest=d;
            }

        }
        System.out.println(largest);
    }
}



//find Largest even number