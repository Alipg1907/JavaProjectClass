package BreakKeyword;

public class BreakKeyword2 {
    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            System.out.println("Outer Loop");
            for (int j = 0; j < 5; j++) {

                if (j == 2) {
                    break;
                }
                System.out.println("inner Loop");
            }
        }
    }

}
