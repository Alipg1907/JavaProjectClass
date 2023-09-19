package Review9;

public class Printer {
     void print(){
        System.out.println("Hello");

    }
     void print(String word){
        System.out.println(word);
    }

    void print(int age){
        System.out.println(age);
    }
    //var args
    void print(int...a){
        System.out.println("Pass as many");

    }
    void print(double...arr){
         for(double num:arr){
             System.out.print(num);
         }
    }
    void print (String...a){
        System.out.println("pass some of them");
    }

    void print(String word,int num){
        System.out.println(word+" "+num);

    }
    public static void main(String[] args) {

    }

}
