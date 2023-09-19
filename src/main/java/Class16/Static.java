package Class16;

public class Static {
private static int static1;
static {
    static1= 1;
    System.out.println("Static block");
}

    public static void main(String[] args) {
        System.out.println("Static1"+ static1);
    }
}


// Write program that have static constructor
// and observe result.