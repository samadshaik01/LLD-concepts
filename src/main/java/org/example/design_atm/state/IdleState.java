package org.example.design_atm.state;

import org.example.design_atm.ATM;
import org.example.design_atm.Card;
import org.example.design_atm.TransactionType;

public class IdleState implements State {
    private final ATM atm;

    public IdleState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard(Card card) {
        atm.setCard(card);
        System.out.println("Card is inserted");
        atm.setCurrentState(atm.getHasCardState());
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

    }

    @Override
    public void exit() {

    }
}
