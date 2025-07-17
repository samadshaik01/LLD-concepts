package org.example.practice.state_dp;

public class VendingMachine {
    final IdleState idleState;
    final ReadyState readyState;
    final DispatchState dispatchState;
    final ReturnChangeState returnChangeState;
    final VendingMachineState currentState;

    public VendingMachine() {
        this.idleState = new IdleState(this);
        this.readyState = new ReadyState(this);
        this.dispatchState = new DispatchState(this);
        this.returnChangeState = new ReturnChangeState(this);
        this.currentState = idleState;
    }
}
