package org.example.carrental_system.payment;

public class CreditcardPaymentProcessor implements PaymentProcessor {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing credit card payment of amount: " + amount);
        return true;
    }
}
