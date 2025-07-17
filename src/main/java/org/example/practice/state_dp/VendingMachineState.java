package org.example.practice.state_dp;

public interface VendingMachineState {
    void selectItem();
    void insertCoin();
    void dispatchItem();
    void returnChange();
}
