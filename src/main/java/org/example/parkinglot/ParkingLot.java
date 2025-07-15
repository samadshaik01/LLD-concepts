package org.example.parkinglot;

import org.example.parkinglot.fees.FeeStrategy;
import org.example.parkinglot.fees.FlatRateFeeStrategy;
import org.example.parkinglot.vehicle.Vehicle;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ParkingLot {
    private static ParkingLot instance;
    private final List<ParkingFloor> floors;
    private final Map<String, Ticket> activeTickets = new ConcurrentHashMap<>();
    private FeeStrategy feeStrategy;

    private ParkingLot() {
        this.floors = new ArrayList<>();
        this.feeStrategy = new FlatRateFeeStrategy();
    }

    public static synchronized ParkingLot getInstance() {
        if (instance == null) {
            return new ParkingLot();
        }
        return instance;
    }

    public synchronized double unparkvehicle(String tiketId) {
        Ticket ticket = activeTickets.get(tiketId);
        if (ticket == null) {
            throw new RuntimeException("Invalid ticket");
        }
        ParkingSpot spot = ticket.getSpot();
        spot.unPark();
        ticket.setExitTimestamp(new Date().getTime());
        return feeStrategy.calculateFee(ticket);
    }

    public void addFloor(ParkingFloor floor) {
        floors.add(floor);
    }

    public void setFeeStrategy(FeeStrategy feeStrategy) {
        this.feeStrategy = feeStrategy;
    }

    public synchronized Ticket parkVehicle(Vehicle vehicle) {

        for (ParkingFloor floor : floors) {
            Optional<ParkingSpot> spot = floor.getAvailableSpot(vehicle.getVehicleType());
            if (spot.isPresent()) {
                ParkingSpot parkingspot = spot.get();
                if (parkingspot.park(vehicle)) {
                    String ticketId = UUID.randomUUID().toString();
                    Ticket ticket = new Ticket(ticketId, vehicle, parkingspot);
                    activeTickets.put(ticketId, ticket);
                    return ticket;
                }

            }
        }
        throw new RuntimeException("No available spot for " + vehicle.getVehicleType());
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }

}


