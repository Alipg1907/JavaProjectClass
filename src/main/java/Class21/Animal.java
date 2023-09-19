package Class21;

public abstract class Animal {
    String name;
    String breed;
    String color;
    abstract void speak();
    /*{
        System.out.println("Animals speak");
    }*/
    abstract void sleep();
    /*{
        System.out.println("Animals");
    } */
    abstract void eat ();
    //abstract String getString(String a,int b);
    public void printInfo(){
        System.out.println(name+" "+breed+" "+color);
    }
}
class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("Wuf Wuff");
    }

    @Override
    void sleep() {
        System.out.println("Sleeping for last 10 hours.....");
    }

    @Override
    void eat() {
        System.out.println("Eating bones .....");

    }

}
class Cat extends Animal{

    @Override
    void speak() {
        System.out.println("Meow Meow.......");
    }

    @Override
    void sleep() {
        System.out.println("Cats sleep for 12-16 hours");
    }

    @Override
    void eat() {
        System.out.println("Like to eat Fish...");
    }
}
