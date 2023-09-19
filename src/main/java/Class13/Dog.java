package Class13;

public class Dog {
    String name; // if you write instnce variables inside of void ( local)
                    //it will give error.
    String breed;
    int age;
    void printInfor(){
        System.out.println(name+" "+breed+" "+age);
    }
    void printName(){
        System.out.println(name);
    }
    void changeName(String dogName){
        name=dogName;
    }
}
