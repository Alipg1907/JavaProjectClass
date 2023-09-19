package Class10Notes;

public class Student {
    //Properties/Attributes
    String name;
    int age;
    String id;

    // Methods/functions/Behaviours
    void study() {
        System.out.println("Studying 16 hours a day.......");
    }

    public static void main(String[] args) {
        // we are creating an actual student by using the Student class
        Student ehabObj = new Student();
        ehabObj.name = "Ehab";
        ehabObj.age = 22;
        ehabObj.id = "abc123";
        ehabObj.study(); //scanner.nextInt();

        Student habibobj=new Student();
        habibobj.name="Habib";
        habibobj.age=20;
        habibobj.id="abd123";
        habibobj.study();


    }
}
