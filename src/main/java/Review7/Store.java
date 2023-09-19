package Review7;

public class Store {
    public static void main(String[] args) {

        Book book1=new Book();
        book1.title="";
        book1.author="";
        book1.year=1975;
        book1.price=45;
        //book1.page=298; CE: variable does not exist in the book class

        book1.read();
        book1.changePrice(41);
        double total=book1.totalWithTax(0.1);
        System.out.println("The price with taxes="+total);
        new Book();
        new Book();

        // new Magazine(); we do not have Magazine class - so we cannot
        // create an object of Magazine

    }

}
