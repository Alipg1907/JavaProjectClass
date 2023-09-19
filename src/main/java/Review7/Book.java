package Review7;

public class Book {
    /* syntax of variables
        dataType name;


     */
    String author;
    String title;
    int year;
    double price;
     /*syntax of method
     returnType name
     void read()
     I can create my own methods;
        1)with parameter or without
        2)with return or without

      */
    void read(){
        System.out.println("I am reading "+ title + " book by "+author);
    }
    void changePrice(int newPrice){
        System.out.println("The price of the book "+title+" was changed from "+price+" to "+newPrice);
    }
    double totalWithTax(double tax){
        double total=price+(price*tax);
        return total;
    }
}
