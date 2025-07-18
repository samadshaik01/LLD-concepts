package org.example.vending_machine;

public class DispenseState implements VendingMachineState {
    private final VendingMachine vendingMachine;

    public DispenseState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectProduct(Product product) {
        System.out.println("Product is already selected");

    }

    @Override
    public void insertCoin(Coin coin) {
        System.out.println("payment already made");

    }

    @Override
    public void insertNote(Note note) {
        System.out.println("payment already made");

    }

    @Override
    public void dispenseProduct() {
        Product product = vendingMachine.getSelectedProduct();
        vendingMachine.getInventory().updateQuantity(product, vendingMachine.getInventory().getQuantity(product) - 1);
        System.out.println("Product dispensed: " + product.getName());
        vendingMachine.setCurrentState(vendingMachine.getReturnChangeState());

    }

    @Override
    public void returnChange() {
        System.out.println("collect the dispensed product first");

    }
}
