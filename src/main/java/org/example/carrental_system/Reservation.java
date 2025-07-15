package org.example.carrental_system;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reservation {
    private final String ReservationID;
    private final Customer Customer;
    private final Car Car;
    private final LocalDate StartDate;
    private final LocalDate EndDate;
    private final double TotalCost;

    public Reservation(Car car, String reservationID, Customer customer, LocalDate startDate, LocalDate endDate) {
        Car = car;
        ReservationID = reservationID;
        Customer = customer;
        StartDate = startDate;
        EndDate = endDate;
        TotalCost = calculateTotalCost(startDate, endDate);
    }

    private final double calculateTotalCost(LocalDate startDate, LocalDate endDate) {

        return ChronoUnit.DAYS.between(startDate, endDate) * Car.getPerDayRate();

    }

    public Car getCar() {
        return Car;
    }

    public Customer getCustomer() {
        return Customer;
    }

    public LocalDate getEndDate() {
        return EndDate;
    }

    public String getReservationID() {
        return ReservationID;
    }

    public LocalDate getStartDate() {
        return StartDate;
    }

    public double getTotalCost() {
        return TotalCost;
    }
}

