package org.example.carrental_system;

import org.example.carrental_system.payment.CreditcardPaymentProcessor;
import org.example.carrental_system.payment.PaymentProcessor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class CarrentalSystem {
    private final Map<String, Reservation> reservationsList;
    private final Map<String, Car> carsInventory;
    private final PaymentProcessor paymentProcessor;

    public CarrentalSystem() {
        this.carsInventory = new ConcurrentHashMap<>();
        this.reservationsList = new ConcurrentHashMap<>();
        this.paymentProcessor = new CreditcardPaymentProcessor();
    }

    public void addCar(Car car) {
        carsInventory.put(car.getLicensePlate(), car);
    }

    public List<Car> searchCars(String brand, CarType cartype, LocalDate startDate, LocalDate endDate) {
        List<Car> availableCars = new ArrayList<>();
        for (Car car : carsInventory.values()) {
            if (car.isAvailable() && brand.equals(car.getBrand()) && cartype.equals(car.getCarType())) {
                if (checkAvailabilityBetweenDays(car, startDate, endDate)) {
                    availableCars.add(car);
                }
            }
        }

        return availableCars;
    }

    private boolean checkAvailabilityBetweenDays(Car car, LocalDate startDate, LocalDate endDate) {
        for (Reservation reservation : reservationsList.values()) {
            if (reservation.getCar().equals(car)) {
                if (startDate.isBefore(reservation.getEndDate()) && endDate.isAfter(reservation.getStartDate())) {
                    return false;
                }
            }
        }
        return true;
    }

    public synchronized Reservation makeReservation(Customer customer, Car car, LocalDate startDate, LocalDate endDate) {
        if (checkAvailabilityBetweenDays(car, startDate, endDate)) {
            String reservationId = generateReservationId();
            Reservation reservation = new Reservation(car, reservationId, customer, startDate, endDate);
            reservationsList.put(reservationId, reservation);
            car.setAvailable(false);
            return reservation;
        }
        return null;

    }

    private String generateReservationId() {
        return "RES" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
    }

    public boolean processPayment(Reservation reservation) {
        if (reservation != null) {
            return paymentProcessor.processPayment(reservation.getTotalCost());
        }
        return false;
    }

    public void cancelReservation(String reservationID) {
        Reservation reservation = reservationsList.remove(reservationID);
        if (reservation != null) {
            reservation.getCar().setAvailable(true);
        }
    }
}