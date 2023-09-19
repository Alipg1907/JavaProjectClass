package Class92Darray;

public class Array2D8AskJohny {
    public static void main(String[] args) {
        int[][] numbers = {
                {10, 20, 30, 40},
                {15, 30, 35, 45},
                {16, 20, 32, 22}};
        int sum=0;
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers [row].length; col++) {
                sum=sum+numbers[row][col];

            }

        }
        System.out.println(sum);
    }

}//numbers.length 'row
// numbers[i].length 'column