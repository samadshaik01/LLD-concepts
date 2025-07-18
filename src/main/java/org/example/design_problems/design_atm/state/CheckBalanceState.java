package org.example.design_atm.state;

import org.example.design_atm.ATM;
import org.example.design_atm.Card;
import org.example.design_atm.TransactionType;

public class CheckBalanceState implements State {

    private final ATM atm;

    public CheckBalanceState(ATM atm) {
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

    }

    @Override
    public void checkBalance() {
        System.out.println("Checking balance...");
    }

    @Override
    public void exit() {

    }
}
