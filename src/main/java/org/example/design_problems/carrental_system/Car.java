package org.example.carrental_system;

public class Car {
    private String licensePlate;
    private CarType carType;
    private String brand;
    private double perDayRate;
    private boolean isAvailable;

    public Car(String brand, CarType carType, double perDayRate, boolean isAvailable, String licensePlate) {
        this.brand = brand;
        this.carType = carType;
        this.perDayRate = perDayRate;
        this.isAvailable = isAvailable;
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public double getPerDayRate() {
        return perDayRate;
    }

    public void setPerDayRate(double perDayRate) {
        this.perDayRate = perDayRate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", carType=" + carType +
                ", perDayRate=" + perDayRate +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
