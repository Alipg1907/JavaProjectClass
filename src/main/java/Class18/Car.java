package Class18;

public class Car {
    private String make;
    private String model;
    private double price;
    private String color;
    public Car(String make, String model, double price,String color){
        this.make=make;
        this.model=model;
        this.price=price;
        this.color=color;
    }

    public Car(String make, String model, double price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }
    void printInfo(){
        System.out.println(make+" "+model+" "+price+" "+color);
    }

}
class BMW extends Car{
   public BMW(String make, String model, double price,String color){
       //calling the constructor from parent class
       super(make, model, price); // must be same number of parameter on constructor
   }
    }
class Audi extends Car{
    boolean sunRoof;
    public Audi(String make, String model, double price,String color,Boolean sunRoof){
        super(make, model, price, color);
        this.sunRoof=sunRoof;
    }
}

