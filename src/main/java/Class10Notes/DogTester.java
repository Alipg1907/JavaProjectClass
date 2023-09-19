package Class10Notes;

public class DogTester {

    public static void main(String[] args) {
    Dog lunasObj=new Dog();
    //assigning a value to name using lunasobj
    lunasObj.name="Luna";
    lunasObj.gender='F';
    lunasObj.breed="Shiba";
    lunasObj.weight=10;
    lunasObj.age=20;
        System.out.println(lunasObj.name);
        System.out.println(lunasObj.age);
        System.out.println(lunasObj.breed);
        // we are calling the bark method on lunasobj
    lunasObj.bark();
    lunasObj.eat();
    lunasObj.sleep();



    }
}
