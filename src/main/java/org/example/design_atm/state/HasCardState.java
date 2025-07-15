package org.example.design_atm.state;

import org.example.design_atm.ATM;
import org.example.design_atm.Card;
import org.example.design_atm.TransactionType;

public class HasCardState implements State {
    private final ATM atm;

    public HasCardState(ATM atm) {
        this.atm = atm;
    }


    @Override
    public void insertCard(Card card) {

    }

    @Override
    public void authenticatePin(int pin) {
        if (atm.getCard().getPin() == pin) {
            System.out.println("Pin is correct");
            atm.setCurrentState(atm.getSelectOptionState());
        } else {
            System.out.println("Pin is incorrect");
            atm.setCurrentState(atm.getIdleState());
        }

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
