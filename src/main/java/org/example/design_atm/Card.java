package org.example.design_atm;


public class Card {
    private final String cardNumber;
    private final int pin;
    private final BankAccount bankAccount;

    public Card(String cardNumber, int pin, BankAccount bankAccount) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.bankAccount = bankAccount;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getPin() {
        return pin;
    }
}
