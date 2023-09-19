package Class22;

public abstract class ABSTester {
    int age;
    ABSTester(){ // You can create constructor inside of abstract class

    }
    private void Batch17YouShouldStartStudying(){
        System.out.println("It's possible");
    }
    public void anotherM(){
        Batch17YouShouldStartStudying();
    }
    static void abc(){

    }
}
interface A{
    // error int age;
    // You can not create constructor inside of interface
    private void tester (){

    }
    static void abc(){

    }
}
class Tester{
    public static void main(String[] args) {
        //A a=new A() ; You can not create object inside of interface class
    }
}