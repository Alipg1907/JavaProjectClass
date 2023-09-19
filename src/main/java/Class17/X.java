package Class17;

public class X {
    String name;
    void printName(){
        System.out.println(name);
    }
}
class Y extends X{
    String height;
    void printHeight(){
        System.out.println(height);
    }
}
class Z extends Y{
    void printNameHeight(){
        System.out.println(name+" "+height);
    }
}