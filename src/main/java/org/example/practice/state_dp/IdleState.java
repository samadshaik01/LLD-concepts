package org.example.practice.state_dp;

public class IdleState implements VendingMachineState {

    VendingMachine vendingMachine;
    public IdleState(VendingMachine vendingMachine) {
        this.vendingMachine=vendingMachine;
    }

    @Override
    public void selectItem() {

    }

    @Override
    public void insertCoin() {

    }


    @Override
    public void dispatchItem() {

    }

    @Override
    public void returnChange() {

    }
}
