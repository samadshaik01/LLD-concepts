package org.example.practice.parkinglot_.vechile;

public abstract class Vehicle {
    private int licencePlate;
    private VehicleType type;

    public Vehicle(int licencePlate, VehicleType type) {
        this.licencePlate = licencePlate;
        this.type = type;
    }

    public int getLicencePlate() {
        return licencePlate;
    }

    public VehicleType getType() {
        return type;
    }
}
