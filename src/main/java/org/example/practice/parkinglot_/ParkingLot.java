package org.example.practice.parkinglot_;

import org.example.practice.parkinglot_.fees.FlatefeeStrategy;
import org.example.practice.parkinglot_.fees.PaymentStrategy;
import org.example.practice.parkinglot_.vechile.Vehicle;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ParkingLot {
    public static final Map<String, Ticket> ACTIVE_TICKETS = new HashMap<>();
    private static ParkingLot instance;
    private List<Floor> floors;
    private PaymentStrategy paymentStrategy;

    private ParkingLot() {
        this.floors = floors;
        this.paymentStrategy = new FlatefeeStrategy();
    }

    public static synchronized ParkingLot getInstance() {
        if (instance == null) {
            return new ParkingLot();
        }
        return instance;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    public Ticket parkVehicle(Vehicle vehicle) throws Exception {
        for (Floor floor : floors) {
            Optional<Parkingspot> availableParkingSpot = floor.getAvailableParkingSpot(vehicle.getType());
            if (availableParkingSpot.isPresent()) {
                Parkingspot spot = availableParkingSpot.get();
                if (spot.assinVehicle(vehicle)) {
                    Ticket ticket = new Ticket(spot);
                    ACTIVE_TICKETS.put(ticket.getTicketId(), ticket);
                    return ticket;
                }
            }
        }
        throw new RuntimeException("unable to park vehicle");
    }

    public void unParkVechile(Ticket ticket) {

    }
}
