package Class10Notes;

public class CarTester {
    public static void main(String[] args) {
        Car bmw=new Car();
        bmw.make="German";
        bmw.models="xseries,mseries,iseries";

        bmw.shape="sedan,sport,suv";
        bmw.price=75000;
        System.out.println(bmw.make);
        System.out.println(bmw.shape);
        System.out.println(bmw.models);
        bmw.drive();
        bmw.size();


    }

}
