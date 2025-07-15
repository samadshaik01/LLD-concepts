package org.example.parkinglot.fees;

import org.example.parkinglot.Ticket;

public class FlatRateFeeStrategy implements FeeStrategy {
    private static final double FLAT_RATE = 100.0;

    @Override
    public double calculateFee(Ticket ticket) {
        long duration = ticket.getExitTimestamp() - ticket.getEntryTimestamp();
        long hours = (duration / (1000 * 60 * 60)) + 1;
        return FLAT_RATE * hours;
    }
}


