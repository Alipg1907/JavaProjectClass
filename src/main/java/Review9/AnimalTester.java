package Review9;

public class AnimalTester {
    public static void main(String[] args) {
      Dog d=new Dog();
      d.speak();
      d.sleep();

      Animal a = new Animal();
      a.speak();

      Animal c=new Dog(); //Type casting big dataype store to small
                            // implicit small datatype store to big datatype
       c.speak();
       double e=10; // implicit because 10 is int. , so you are storing
                    // small datatype to big datatype. (implicit, auto or wide)

        int b=(int)10.5;            // if you do opposite way, it will called explicit.
        
    }
}
