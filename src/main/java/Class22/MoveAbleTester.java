package Class22;

public class MoveAbleTester {
    public static void main(String[] args) {
        MoveAble[] arr = {new CAr(), new Dog()};
        for (MoveAble a : arr) {
            a.move();
        }

    }

}
