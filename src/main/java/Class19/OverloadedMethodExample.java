package Class19;

public class OverloadedMethodExample {
    private void printMessage() {
        System.out.println("No arguments provided.");
    }

    private void printMessage(String message) {
        System.out.println("Message: " + message);
    }

    private void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Message " + (i + 1) + ": " + message);
        }
    }

    public static void main(String[] args) {
        OverloadedMethodExample example = new OverloadedMethodExample();

        // Call the overloaded methods
        example.printMessage();                           // Form 1
        example.printMessage("Hello, Java!");             // Form 2
        example.printMessage("Overloaded", 3);            // Form 3
    }
}


//Create 1 class with a private method that has 3 overloaded forms.
// Then call each overloaded method with specific arguments and observe result.