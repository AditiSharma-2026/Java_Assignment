class Bank {
    final double interestRate = 5.0; // fixed interest rate (5%)

    double calculateInterest(double amount) {
        return (amount * interestRate) / 100;
    }
}

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        double customer1 = 10000;
        double customer2 = 25000;

        System.out.println("Interest for Customer 1: " + bank.calculateInterest(customer1));
        System.out.println("Interest for Customer 2: " + bank.calculateInterest(customer2));
    }
}
