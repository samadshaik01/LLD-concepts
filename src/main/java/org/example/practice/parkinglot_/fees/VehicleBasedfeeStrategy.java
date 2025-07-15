package org.example.practice.parkinglot_.fees;

import org.example.practice.parkinglot_.Ticket;
import org.example.practice.parkinglot_.vechile.VehicleType;

import java.util.Map;

public class VehicleBasedfeeStrategy implements PaymentStrategy {

    private final static Map<VehicleType, Double> feesMap = Map.of(VehicleType.BIKE, 100.0, VehicleType.CAR, 200.0, VehicleType.TRUCK, 300.0);

    @Override
    public double calculateFees(Ticket ticket) {
        double fair = feesMap.get(ticket.getParkingspot().getVehicle().getType());
        long duration = ticket.getExitTimestamp() - ticket.getEntryTimestamp();
        long hours = (duration / (1000 * 60 * 60)) + 1;
        return fair * hours;
    }
}
