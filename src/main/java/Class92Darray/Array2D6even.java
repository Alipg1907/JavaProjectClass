package Class92Darray;

public class Array2D6even {
    public static void main(String[] args) {
        int[][] numbers = {
                {10, 20, 30, 40},
                {15, 30, 35, 45},
                {16, 20, 32, 22}};

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers.length; col++) {
                if (numbers[row][col] % 2 == 0)
                System.out.print(numbers[row][col] + " ");

            }
            System.out.println();
        }
    }
}
