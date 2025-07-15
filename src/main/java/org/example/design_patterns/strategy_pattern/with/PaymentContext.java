package org.example.design_patterns.strategy_pattern.with;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    //we can even have a constructor to set thhe default payment strategy (only when we no need to pass credit card details in params)
/*    public PaymentContext() {
        this.paymentStrategy = new CreditCardPayment();
    }*/


    // Set the payment strategy at runtime
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Execute the payment
    public void pay(double amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Payment strategy is not set.");
        }
        paymentStrategy.pay(amount);
    }
}
