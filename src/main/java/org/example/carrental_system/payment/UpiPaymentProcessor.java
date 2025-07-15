package org.example.carrental_system.payment;

public class UpiPaymentProcessor implements PaymentProcessor {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing UPI payment of amount: " + amount);
        return true;
    }
}
