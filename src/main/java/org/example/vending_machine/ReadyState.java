package org.example.vending_machine;

public class ReadyState implements VendingMachineState {
    private final VendingMachine vendingMachine;

    public ReadyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectProduct(Product product) {
        System.out.println("Product alredy selected: " + product.getName());
    }

    @Override
    public void insertCoin(Coin coin) {
        vendingMachine.addCoin(coin);
        vendingMachine.checkPaymentStatus();

    }

    @Override
    public void insertNote(Note note) {
        vendingMachine.addNote(note);
        vendingMachine.checkPaymentStatus();
    }

    @Override
    public void dispenseProduct() {
        System.out.println("please make payment first.");
    }

    @Override
    public void returnChange() {
        System.out.println("please make payment first.");

    }
    public void checkPaymentStatus() {
        if(vendingMachine.getTotalPayment()>=vendingMachine.getSelectedProduct().getPrice()) {
            vendingMachine.setCurrentState(vendingMachine.getDispenseState());
        } else {
            System.out.println("insufficient amount, please insert more coins");
        }
    }
}
