package org.example.carrental_system;

public class Customer {
    private final String name;
    private final String licenceNumber;
    private final String phoneNumber;

    public Customer(String licenceNumber, String name, String phoneNumber) {
        this.licenceNumber = licenceNumber;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}
