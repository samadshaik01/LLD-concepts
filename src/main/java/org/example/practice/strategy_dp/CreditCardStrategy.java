package org.example.practice.strategy_dp;

public class CreditCardStrategy implements PaymentStrategy {

    final String cardNumber;
    final int pin;

    public CreditCardStrategy(String cardNumber, int pin) {
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("payment done with creditcard " + amount);
        return false;
    }
}
