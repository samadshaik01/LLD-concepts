package org.example.practice.parkinglot_;


import java.util.Date;
import java.util.UUID;

public class Ticket {
    private String ticketId;
    private long entryTimestamp;
    private long exitTimestamp;
    private Parkingspot parkingspot;

    public Ticket(Parkingspot parkingspot) {
        this.ticketId = UUID.randomUUID().toString();
        this.entryTimestamp = new Date().getTime();
        this.parkingspot = parkingspot;
    }

    public String getTicketId() {
        return ticketId;
    }


    public long getEntryTimestamp() {
        return entryTimestamp;
    }


    public long getExitTimestamp() {
        return exitTimestamp;
    }

    public void setExitTimestamp() {
        this.exitTimestamp = new Date().getTime();
    }

    public Parkingspot getParkingspot() {
        return parkingspot;
    }

    public void setParkingSpot(Parkingspot parkingSpot) {
        this.parkingspot = parkingSpot;
    }
}
