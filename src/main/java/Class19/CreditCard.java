package Class19;

public class CreditCard {
    protected double balance;
    protected double interest;

    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    public void calculateInterest() {
        double calculatedInterest = balance * interest;
        System.out.println("Interest calculated on CreditCard: $" + calculatedInterest);
    }
}

class Visa extends CreditCard {
    public Visa(double balance, double interest) {
        super(balance, interest);
    }
}

class AX extends CreditCard {
    public AX(double balance, double interest) {
        super(balance, interest);
    }

    @Override
    public void calculateInterest() {
        double calculatedInterest = balance * interest * 3; // Overridden calculation for AX
        System.out.println("Interest calculated on AX Card: $" + calculatedInterest);
    }
}

class Main {
    public static void main(String[] args) {
        CreditCard genericCard = new CreditCard(1000.0, 0.1);
        Visa visaCard = new Visa(1500.0, 0.15);
        AX axCard = new AX(2000.0, 0.2);

        System.out.println("Interest for Generic CreditCard:");
        genericCard.calculateInterest();

        System.out.println("\nInterest for Visa Card:");
        visaCard.calculateInterest();

        System.out.println("\nInterest for AX Card:");
        axCard.calculateInterest();
    }


}
