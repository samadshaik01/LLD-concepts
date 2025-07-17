package org.example.practice.strategy_dp;

public class Shop {

    PaymentStrategy paymentStrategy;

    public Shop() {
        // this.paymentStrategy = new CreditCardStrategy("12345", 0123); we can set only when we not passing creditcard details
    }

    void addtoCart() {
    }

    void checkOut() {
    }

    void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;

    }

    boolean doPayment(double amount) {
        return paymentStrategy.pay(amount);
    }
}
