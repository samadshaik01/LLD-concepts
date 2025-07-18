package org.example.vending_machine;

public class VendingMachine {
    private static VendingMachine instance;
    private final Inventory inventory;
    private final IdleState idleState;
    private final ReadyState readyState;
    private final ReturnChangeState returnChangeState;
    private DispenseState dispenseState;
    private VendingMachineState currentState;
    private Product selectedProduct;
    private double totalPayment;

    private VendingMachine() {
        inventory = new Inventory();
        idleState = new IdleState(this);
        readyState = new ReadyState(this);
        dispenseState = new DispenseState(this);
        returnChangeState = new ReturnChangeState(this);
        currentState = idleState;
        selectedProduct = null;
        totalPayment = 0.0;
    }

    public synchronized static VendingMachine getInstance() {
        if (instance == null) {
            instance = new VendingMachine();
        }
        return instance;
    }


    public void setCurrentState(VendingMachineState currentState) {
        this.currentState = currentState;
    }

    public DispenseState getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(DispenseState dispenseState) {
        this.dispenseState = dispenseState;
    }

    public IdleState getIdleState() {
        return idleState;
    }


    public Inventory getInventory() {
        return inventory;
    }

    public ReadyState getReadyState() {
        return readyState;
    }


    public ReturnChangeState getReturnChangeState() {
        return returnChangeState;
    }


    public Product getSelectedProduct() {
        return selectedProduct;
    }

    public void setSelectedProduct(Product product) {
        this.selectedProduct = product;
    }

    public double getTotalPayment() {
        return totalPayment;
    }


    public void addCoin(Coin coin) {
        totalPayment += coin.getValue();
        System.out.println("Coin inserted: " + coin);
        checkPaymentStatus();
    }

    public void addNote(Note note) {
        totalPayment += note.getValue();
        checkPaymentStatus();
    }

    public void checkPaymentStatus() {
        if (totalPayment >= selectedProduct.getPrice()) {
            currentState = dispenseState;
        } else {
            System.out.println("insufficient amount, please insert more coins");
        }
    }

    public void updateProductQuantity() {
        inventory.updateQuantity(selectedProduct, 1);

    }

    public void resetPayment() {
        totalPayment = 0.0;
    }

    public void resetSelectedProduct() {
        selectedProduct = null;
    }

    public Product addProduct(String name, double price, int quantity) {
        Product product = new Product(name, price);
        inventory.addProduct(product, quantity);
        return product;
    }

    public void dispenceProduct() {
        currentState.dispenseProduct();

    }

    public void returnChange() {
        currentState.returnChange();
    }

    public void selectProduct(Product product) {
        currentState.selectProduct(product);
    }
}
