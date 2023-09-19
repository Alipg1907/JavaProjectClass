package Class19;

public class MinimumFinder {

        public static int findMinimum(int num1, int num2) {
            if (num1 < num2) {
                return num1;
            } else {
                return num2;
            }
        }

        public static void main(String[] args) {
            int result = findMinimum(5, 3);
            System.out.println("Minimum: " + result); // This will print "Minimum: 3"
        }
    }

