package org.example.design_atm.state;

import org.example.design_atm.Card;
import org.example.design_atm.TransactionType;

public interface State {

    void insertCard(Card card);
    void authenticatePin(int pin);
    void selectOperation(TransactionType operation);
    void withdraw(double amount);
    void checkBalance();
    void exit();
}
