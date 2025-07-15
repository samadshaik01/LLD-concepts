package org.example.practice.parkinglot_;

import org.example.practice.parkinglot_.vechile.Vehicle;
import org.example.practice.parkinglot_.vechile.VehicleType;

public class Parkingspot {
    private final int spotId;
    private final VehicleType type;
    private boolean isOccupied;

    private Vehicle vehicle;

    public Parkingspot(int spotId, VehicleType vehicleType, boolean isOccupied) {
        this.spotId = spotId;
        this.type = vehicleType;
        this.isOccupied = false;
    }

    public boolean assinVehicle(Vehicle vehicle) {
        if (vehicle.getType().equals(type)) this.vehicle = vehicle;
        isOccupied = true;
        return true;
    }

    public void unAssignVehicle() {
        this.vehicle = null;
        isOccupied = false;
    }


    public int getSpotId() {
        return spotId;
    }


    public VehicleType getType() {
        return type;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
