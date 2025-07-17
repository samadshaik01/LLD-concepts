package org.example.practice.state_dp;

public class ReturnChangeState implements VendingMachineState {
    VendingMachine vendingMachine;

    public ReturnChangeState(VendingMachine vendingMachine) {
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
