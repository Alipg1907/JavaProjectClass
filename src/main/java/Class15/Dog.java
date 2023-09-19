package Class15;

public class Dog {
    String name;
    String breed;
    String color;
    int age;

    Dog (String dName, String dBreed, String dColor, int dAge){
        name=dName;
        breed=dBreed;
        color=dColor;
        age=dAge;

    }
    void bark(){
        System.out.println("wuff wuff....");
    }
    void printInfo(){
        System.out.println(name+" "+breed+" "+
                color+" "+age);
    }
}
