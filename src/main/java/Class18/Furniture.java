package Class18;

public class Furniture {
    String color="Black";

}
class Chair extends Furniture{
    String color="Brown";
    void printColor(){
        String color="Blue"; //it will execute blue because blue is closer to print
        System.out.println(color);
        System.out.println(super.color); // if you super it will call first parameter
        System.out.println(this.color); //instance variable
    }
}
class FurnitureTester{
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printColor();
    }
}