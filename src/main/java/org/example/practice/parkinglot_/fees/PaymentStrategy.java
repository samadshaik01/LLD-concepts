package org.example.practice.parkinglot_.fees;

import org.example.practice.parkinglot_.Ticket;

public interface PaymentStrategy {
    public double calculateFees(Ticket ticket);
}
