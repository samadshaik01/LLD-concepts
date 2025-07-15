package org.example.parkinglot.fees;

import org.example.parkinglot.Ticket;

public interface FeeStrategy {
    double calculateFee(Ticket ticket);
}
