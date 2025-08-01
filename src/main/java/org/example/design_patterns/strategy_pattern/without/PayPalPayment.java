package org.example.design_patterns.strategy_pattern.without;

public class PayPalPayment implements PaymentStrategy {

    private String email;
    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal account: " + email);
    }

}
