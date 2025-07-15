package org.example.carrental_system;

import java.time.LocalDate;
import java.util.List;

import static org.example.carrental_system.CarType.SUDAN;

public class Demo {
    public static void main(String[] args) {

        CarrentalSystem carrentalSystem = new CarrentalSystem();

        Car car1 = new Car("ABC_brand", CarType.SUV, 100.0, true, "ABC123");
        Car car2 = new Car("XYZ_brand", SUDAN, 80.0, true, "XYZ456");

        carrentalSystem.addCar(car1);
        carrentalSystem.addCar(car2);

        Customer customer = new Customer("AP-123", "samad", "123456789");

        List<Car> availableCars = carrentalSystem.searchCars("XYZ_brand", SUDAN, LocalDate.of(2025, 01, 01), LocalDate.of(2025, 01, 10));
        System.out.println("Available Cars: " + availableCars);

        Car selectedCar = availableCars.get(0);

        Reservation reservation=carrentalSystem.makeReservation(customer, selectedCar, LocalDate.of(2025, 01, 01), LocalDate.of(2025, 01, 10));
        System.out.println("Reservation ID: " + reservation.getReservationID());

        boolean paymentSuccess = carrentalSystem.processPayment(reservation);
        if (paymentSuccess) {
            System.out.println("Payment successful. Total cost: " + reservation.getTotalCost());
        } else {
            System.out.println("Payment failed. Reservation canceled.");
            carrentalSystem.cancelReservation(reservation.getReservationID());
        }

    }
}
