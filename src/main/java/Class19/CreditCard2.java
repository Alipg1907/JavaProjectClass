package Class19;

public class CreditCard2 {

    public void CalInterest(double balance){
        System.out.println(balance*0.05);
    }
}
class Visaa extends CreditCard2{

}
class AXX extends CreditCard2{

    public void CalInterest(double balance){
        System.out.println(balance*0.07);
    }

}

//Create a class CreditCard Create an instance method that will calculate
//interest based on the given balance.
//Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
//Call the method by creating an object of each of the three classes