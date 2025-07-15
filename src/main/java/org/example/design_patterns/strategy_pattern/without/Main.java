package org.example.design_patterns.strategy_pattern.without;

public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();
        

        // Pay using Credit Card
        paymentContext.pay("CreditCard", 100.0, "1234-5678-9876-5432");

        // Pay using PayPal
        paymentContext.pay("PayPal", 200.0, "john.doe@example.com");

        // Pay using Bank Transfer
        paymentContext.pay("BankTransfer", 300.0, "987654321");

        // Invalid payment type
        paymentContext.pay("Crypto", 400.0, "bitcoin-wallet-address");

    }
}
