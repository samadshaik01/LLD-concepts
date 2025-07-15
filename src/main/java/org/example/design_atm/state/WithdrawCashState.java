package org.example.design_atm.state;

import org.example.design_atm.ATM;
import org.example.design_atm.Card;
import org.example.design_atm.TransactionType;

public class WithdrawCashState implements State {

    private final ATM atm;

    public WithdrawCashState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard(Card card) {

    }

    @Override
    public void authenticatePin(int pin) {

    }

    @Override
    public void selectOperation(TransactionType operation) {

    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawing cash: " + amount);
    }

    @Override
    public void checkBalance() {
    }

    @Override
    public void exit() {

    }
}
