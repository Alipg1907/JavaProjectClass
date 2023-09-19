package Class10Notes;

public class Car2Tester {
    public static void main(String[] args) {
        Car2 mercedes= new Car2();
        mercedes.make="Mercedes";
        mercedes.models="C series, S series, G series";
        mercedes.price=85000;
        mercedes.moveForward();
        mercedes.applyBrakes();
        mercedes.moveForward();
        mercedes.applyBrakes();

    }
}
