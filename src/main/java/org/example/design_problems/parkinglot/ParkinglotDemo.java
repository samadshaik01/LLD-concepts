package org.example.parkinglot;

import org.example.parkinglot.fees.VehicleBasedFeeStrategy;
import org.example.parkinglot.vehicle.Car;
import org.example.parkinglot.vehicle.Vehicle;
import org.example.parkinglot.vehicle.VehicleType;

import java.util.List;

public class ParkinglotDemo {

    public static void main(String[] args) {

        ParkingLot parkingLot = ParkingLot.getInstance();

        List<ParkingSpot> parkingSpots1 = List.of(new ParkingSpot(101, VehicleType.CAR), new ParkingSpot(102, VehicleType.CAR), new ParkingSpot(103, VehicleType.BIKE));
        List<ParkingSpot> parkingSpots2 = List.of(new ParkingSpot(201, VehicleType.BIKE), new ParkingSpot(202, VehicleType.TRUCK));

        // Add a floor with different types of spots
        ParkingFloor floor1 = new ParkingFloor(1, parkingSpots1);
        ParkingFloor floor2 = new ParkingFloor(2, parkingSpots2);

        parkingLot.addFloor(floor1);
        parkingLot.addFloor(floor2);

        parkingLot.setFeeStrategy(new VehicleBasedFeeStrategy());


        System.out.println("Available spots for Car:");
        for (ParkingFloor floor : parkingLot.getFloors()) {
            System.out.println("Floor: " + floor.getFloorNumber() + " " + floor.getAvailableSpots(VehicleType.CAR));
        }

        Vehicle car1 = new Car("ABC123", VehicleType.CAR);

        Ticket ticket = parkingLot.parkVehicle(car1);
        System.out.println("Car 1 parked: " + ticket.getTicketId());

        double fees = parkingLot.unparkvehicle(ticket.getTicketId());
        System.out.println("Car 1 unparked: " + ticket.getTicketId() + " Fees: " + fees);

    }
}
