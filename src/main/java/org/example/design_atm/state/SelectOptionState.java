package org.example.design_atm.state;

import org.example.design_atm.ATM;
import org.example.design_atm.Card;
import org.example.design_atm.TransactionType;

public class SelectOptionState implements State {
    private final ATM atm;

    public SelectOptionState(ATM atm) {
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
        switch (operation) {
            case WithDRAW:
                System.out.println("Withdrawing money...");
                atm.setCurrentState(atm.getWithdrawCashState());
                break;
            case CHECK_BALANCE:
                System.out.println("Checking balance...");
                atm.setCurrentState(atm.getCheckBalanceState());
                break;
            default:
                System.out.println("Invalid operation selected.");
        }
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
