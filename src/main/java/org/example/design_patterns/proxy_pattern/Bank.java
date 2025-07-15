package org.example.design_patterns.proxy_pattern;

public class Bank implements Account {

    @Override
    public void getAccountNumber() {
        System.out.println("Account Number: 123456789");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdrawal successful.");
    }
}
