package org.example.design_patterns.strategy_pattern.with;

public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        // Pay using Credit Card
        paymentContext.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432", "John Doe"));
        paymentContext.pay(100.0);

        // Pay using PayPal
        paymentContext.setPaymentStrategy(new PayPalPayment("john.doe@example.com"));
        paymentContext.pay(200.0);

/*      Problems without This Approach
        1. Hard to Extend:
        Adding a new payment method (e.g., cryptocurrency) requires modifying the PaymentProcessor class, which violates the Open/Closed Principle.

        2. Code Duplication:
        Each payment method's logic is hardcoded, leading to potential duplication if similar logic is needed elsewhere.

        3. Violation of Single Responsibility Principle:
        The PaymentProcessor class is responsible for both selecting the payment method and executing the payment logic, making it harder to maintain.

        4. Scalability Issues:
        As the number of payment methods grows, the if-else block becomes harder to manage and debug\

       */
    }
}
