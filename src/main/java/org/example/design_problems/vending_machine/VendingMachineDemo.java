package org.example.vending_machine;

public class VendingMachineDemo {
    public static void main(String[] args) {
        VendingMachine vendingMachine = VendingMachine.getInstance();

        Product coke = vendingMachine.addProduct("Coke", 10, 3);
        Product pepsi = vendingMachine.addProduct("Pepsi", 15, 2);
        Product water = vendingMachine.addProduct("Water", 5, 5);

        vendingMachine.selectProduct(coke);

        vendingMachine.addCoin(Coin.FIVE_RUPEES);
        vendingMachine.addCoin(Coin.TEN_RUPEES);

        vendingMachine.dispenceProduct();
        vendingMachine.returnChange();
    }

}
