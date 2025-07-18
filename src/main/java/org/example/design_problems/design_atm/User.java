package org.example.design_atm;

public class User {
    private final String name;
    private final BankAccount bankAccount;
    private final Card card;

    public User(String name, BankAccount bankAccount, Card card) {
        this.name = name;
        this.bankAccount = bankAccount;
        this.card = card;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public String getName() {
        return name;
    }
}
