package org.example.practice.strategy_dp;

public class Demo {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.setPaymentStrategy(new PaypalStrategy("1234567890"));
        shop.doPayment(100.0);

        shop.setPaymentStrategy(new CreditCardStrategy("98765", 1234));
        shop.doPayment(200.0);
    }
}
