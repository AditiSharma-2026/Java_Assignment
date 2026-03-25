// Abstract class
abstract class Payment {
    // Abstract method
    abstract void pay(double amount);
}

// Subclass 1: Credit Card Payment
class CreditCardPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Payment of Rs." + amount + " made using Credit Card.");
    }
}

// Subclass 2: UPI Payment
class UPIPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Payment of Rs." + amount + " made using UPI.");
    }
}

// Subclass 3: Net Banking Payment
class NetBankingPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Payment of Rs." + amount + " made using Net Banking.");
    }
}

// Main class
public class PaymentSystem {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();
        Payment p3 = new NetBankingPayment();

        p1.pay(1500.50);
        p2.pay(750.00);
        p3.pay(3200.75);
    }
}
