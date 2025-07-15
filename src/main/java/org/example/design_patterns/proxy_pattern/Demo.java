package org.example.design_patterns.proxy_pattern;

public class Demo {
    public static void main(String[] args) {
        Account account = new Atm();
        account.getAccountNumber();
        account.withdraw();
    }
}
