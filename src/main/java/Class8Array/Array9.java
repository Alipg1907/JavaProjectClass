package Class8Array;

public class Array9 {


    public static void main(String[] args) {

        int[] numbers = {20, 10, 50, 30, 40}; //150
        int sum = 0; // we give 0 value to not effect value
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i]; //pick the previous value of the sum and
                                    // add it to current value of the array
        }
        System.out.println(sum);

    }

}

//add all the numbers from the array and print the sum at the end.