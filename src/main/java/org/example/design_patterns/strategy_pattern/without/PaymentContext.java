package org.example.design_patterns.strategy_pattern.without;

public class PaymentContext {
    public void pay(String paymentType, double amount, String details) {
        if (paymentType.equalsIgnoreCase("CreditCard")) {
            System.out.println("Paid $" + amount + " using Credit Card: " + details);
        } else if (paymentType.equalsIgnoreCase("PayPal")) {
            System.out.println("Paid $" + amount + " using PayPal account: " + details);
        } else if (paymentType.equalsIgnoreCase("BankTransfer")) {
            System.out.println("Paid $" + amount + " using Bank Transfer: " + details);
        } else {
            System.out.println("Invalid payment type: " + paymentType);
        }
    }
}
