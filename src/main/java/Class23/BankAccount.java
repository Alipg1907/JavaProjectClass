package Class23;

public class BankAccount {

    private String name;
    final private long bankAccountNumber;
    private double balance;
    final private String userName;
    private String password;
    private String accountType;

    public BankAccount(String name, long bankAccountNumber, double balance, String userName, String password, String accountType) {
        this.name = name;
        this.bankAccountNumber = bankAccountNumber;
        this.balance = balance;
        this.userName = userName;
        this.password = password;
        this.accountType = accountType;
    }

    public BankAccount(long bankAccountNumber, String userName, String password,String accountType) {

        this.bankAccountNumber = bankAccountNumber;
        this.userName = userName;
        this.password = password;
        this.accountType=accountType;
    }

    public BankAccount( String userName, String accountType,long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
        this.userName = userName;
        this.accountType = accountType;
    }

    public String getName(){
        return name;

    }
    public long getBankAccountNumber(){
        return bankAccountNumber;
    }

    void setName (String name){
        this.name=name;

    }

    String getAccountType(){
        return accountType;

    }
    void setAccountType(String accountType){
        this.accountType=accountType;

    }

    public static class BankAccountTester {
        public static void main(String[] args) {
            BankAccount b=new BankAccount("Marta",12524567,1234456, "user123","Pass123","Checking");

            System.out.println(b.getName());
            System.out.println(b.getBankAccountNumber());
            b.setName("Shawn");
            System.out.println(b.getName());

        }
    }
}
