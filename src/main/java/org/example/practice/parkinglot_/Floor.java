package org.example.practice.parkinglot_;

import org.example.practice.parkinglot_.vechile.VehicleType;

import java.util.List;
import java.util.Optional;

public class Floor {
    private int floorNo;
    private List<Parkingspot> parkingspots;

    public Floor(int floorNo, List<Parkingspot> parkingspots) {
        this.floorNo = floorNo;
        this.parkingspots = parkingspots;
    }

    public Optional<Parkingspot> getAvailableParkingSpot(VehicleType vehicleType){
        return parkingspots.stream().filter(parkingspot -> parkingspot.getType().equals(vehicleType) && parkingspot.isOccupied()).findFirst();
    }
}
