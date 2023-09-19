package Class15;

public class DogTester {
    public static void main(String[] args) {
        Dog d1 = new Dog("Jacky", "German",
                "Pink", 25); // creating object syntax

        d1.printInfo();
        Dog d2 = new Dog("Lazy", "Italian",
                "Blue", 10);
        d2.printInfo();

        String name="Alina";
        int size = name.length();

    }
}


