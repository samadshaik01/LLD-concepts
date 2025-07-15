package org.example.practice.parkinglot_.fees;

import org.example.practice.parkinglot_.Ticket;

public class FlatefeeStrategy implements PaymentStrategy {


    public static final double FLAT_FAIR = 100.0;

    @Override
    public double calculateFees(Ticket ticket) {
        long duration = ticket.getExitTimestamp() - ticket.getEntryTimestamp();
        long hours = (duration / (1000 * 60 * 60)) + 1;
        return FLAT_FAIR * hours;
    }
}
