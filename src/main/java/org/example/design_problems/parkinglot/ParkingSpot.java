package org.example.parkinglot;

import org.example.parkinglot.vehicle.Vehicle;
import org.example.parkinglot.vehicle.VehicleType;

public class ParkingSpot {
    private final int spotNumber;
    private boolean isOccupied;
    private VehicleType vechileType;

    private Vehicle vehicle;

    private Ticket ticket;

    public ParkingSpot(int id, VehicleType vehicleType) {
        this.spotNumber = id;
        this.vechileType = vehicleType;
        this.isOccupied = true;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public VehicleType getVechileType() {
        return vechileType;
    }

    public void setVechileType(VehicleType vechileType) {
        this.vechileType = vechileType;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public boolean park(Vehicle vechile) {
        this.vehicle = vechile;
        this.isOccupied = false;
        return true;
    }

    public void unPark() {
        this.vehicle = null;
        this.isOccupied = false;
    }
}
