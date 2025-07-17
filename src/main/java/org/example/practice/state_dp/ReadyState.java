package org.example.practice.state_dp;

public class ReadyState implements VendingMachineState {
    VendingMachine vendingMachine;

    public ReadyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
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
