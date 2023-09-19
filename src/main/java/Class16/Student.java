package Class16;

public class Student {
    private String name;
    private String address;

    public Student(String name, String address){
    this.name= name;
    this.address = address;
    }
    public void displayInfo(){
        System.out.println("name: "+name);
        System.out.println("Adderss: "+address);
    }

}

//Write a Student class that have instance variables name and address.
//Create a constructor that will initialize those variables.
//Print name & address of given student using displayInfo method.