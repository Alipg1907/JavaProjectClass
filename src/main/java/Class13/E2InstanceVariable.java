package Class13;

public class E2InstanceVariable {

    String name="Hind"; //instance veriable
    void printAge(){
        int age=25; // if you add static it will not turn static , because it is local variable
        System.out.println(age);
        System.out.println(name);
    }
    void printCountry(){
        //System.out.println(age); error it is a local variable
                                 //   can't be usable.
        System.out.println(name); // will useable becuase it instance variable
        System.out.println(country);
    }
    static String country="Uganda"; //when add static front of instance variable it turns to static.
}
