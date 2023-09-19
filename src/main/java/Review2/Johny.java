import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your gender: M or F");
        System.out.println("Enter your age");
        char gender = scanner.next().charAt(0);
        int age = scanner.nextInt();
        if (age > 25) {
            if (gender == 'F') {
                System.out.println("Woman");
            }else{
                System.out.println("Girl");

                if (age < 25) {
                    if (gender == 'M') {
                        System.out.println("Boy");
                    } else {
                        System.out.println("Man");
                    }

                }
            }
        }
    }
}