package org.example.vending_machine;

public class ReturnChangeState implements VendingMachineState {
    private final VendingMachine vendingMachine;

    public ReturnChangeState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;

    }

    @Override
    public void selectProduct(Product product) {
        System.out.println("Please collect the change first.");

    }

    @Override
    public void insertCoin(Coin coin) {
        System.out.println("Please collect the change first.");

    }

    @Override
    public void insertNote(Note note) {
        System.out.println("Please collect the change first.");

    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please collect the change first.");

    }

    @Override
    public void returnChange() {
        //calculate change
        //set state to idle
        double change = vendingMachine.getTotalPayment() - vendingMachine.getSelectedProduct().getPrice();
        if (change > 0) {
            System.out.println("Change returned: $" + change);
        } else {
            System.out.println("No change to return.");
        }
        vendingMachine.resetPayment();
        vendingMachine.resetSelectedProduct();
        vendingMachine.setCurrentState(vendingMachine.getIdleState());
    }
}
