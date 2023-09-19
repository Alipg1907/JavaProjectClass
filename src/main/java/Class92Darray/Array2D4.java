package Class92Darray;

public class Array2D4 {
    public static void main(String[] args) {
        int[][] numbers = {
                {10, 20, 30, 40},
                {100, 200, 303, 400},
                {1, 2, 3, 4}};

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(numbers[row][col] + " ");

            }
            System.out.println();
        }
    }
}