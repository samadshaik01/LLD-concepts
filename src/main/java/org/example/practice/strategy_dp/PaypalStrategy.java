package org.example.practice.strategy_dp;

public class PaypalStrategy implements PaymentStrategy {

    final String mobileNumber;

    public PaypalStrategy(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("payment done with paypal " + amount);
        return false;
    }
}
