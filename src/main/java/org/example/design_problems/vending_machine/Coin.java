package org.example.vending_machine;

public enum Coin {
    ONE_RUPEE(1), TWO_RUPEES(2), FIVE_RUPEES(5), TEN_RUPEES(10);

    private final double value;

    Coin(double value) {

        this.value = value;
    }

    public double getValue() {
        return this.value;
    }
}