package Class14;

public class BankAccount {
     private String name="Fahim";

    String userName="Fahim123";

    String password="pass123";
    public double accountBalance=-300;

    String accountNumber="12345";
    private void printInfo(){
        System.out.println("I am Fahim frombatch 17");


    }


    void printCity(){
        System.out.println("New York");
    }
    public static void main(String[] args) {

        BankAccount bankAccount=new BankAccount();
        System.out.println(bankAccount.name);
        System.out.println(bankAccount.accountNumber);
        System.out.println(bankAccount.accountBalance);

    }

}
