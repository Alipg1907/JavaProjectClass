package Class8Array;

public class arrays6Practice {

    public static void main(String[] args) {


        int[]numbers={10,20,4,3,8,45,96};

        int count=0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>10){
                count++;
            }

        }

        System.out.println(count);
    }
}

//count how many numbers are gretaer than 10 in below array
//expected answer 3
