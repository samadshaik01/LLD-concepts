package org.example.design_atm;

import org.example.design_atm.state.*;

public class ATM {
    private final IdleState idleState;
    private final HasCardState hasCardState;
    private final SelectOptionState selectOptionState;
    private State currentState;
    private final CheckBalanceState checkBalanceState;
    private final WithdrawCashState withdrawCashState;

    private Card card;

    public ATM() {
        this.idleState = new IdleState(this);
        this.currentState = new IdleState(this);
        this.hasCardState = new HasCardState(this);
        this.selectOptionState = new SelectOptionState(this);
        this.checkBalanceState = new CheckBalanceState(this);
        this.withdrawCashState = new WithdrawCashState(this);
}
    public State getCurrentState() {
        return currentState;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public void setCurrentState(State state) {
        this.currentState = state;
    }

    public HasCardState getHasCardState() {
        return hasCardState;
    }

    public IdleState getIdleState() {
        return idleState;
    }

    public SelectOptionState getSelectOptionState() {
        return selectOptionState;
    }

    public void insertCard(Card card) {
        currentState.insertCard(card);
    }

    public void authenticatePin(int pin) {
        currentState.authenticatePin(pin);

    }

    public Card getCard() {
        return card;
    }

    public void selectOperation(TransactionType transactionType) {
        currentState.selectOperation(transactionType);
    }

    public CheckBalanceState getCheckBalanceState() {
        return checkBalanceState;
    }

    public WithdrawCashState getWithdrawCashState() {
        return withdrawCashState;
    }

    public void exit() {

    }
}
