package Class10Notes;

public class PhoneTester {
    public static void main(String[] args) {
        Phone iphone=new Phone();
        iphone.make="Apple";
        iphone.os="IOS 17";
        iphone.price=999;
        iphone.sendText();
        iphone.call();

        Phone iphone12=new Phone();
        iphone12.make="Apple";
        iphone12.model="pro max";
        iphone12.os="16";
        iphone12.price=600;
        iphone12.sendText();
        iphone12.sendText();





    }
}
