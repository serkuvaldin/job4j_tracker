package ru.job4j.poly;

public class Bus implements Transport {

    private int passengers;
    private double fuelPrice = 55.44;

    @Override
    public void drive() {
        System.out.println("Ok, let's go!");
    }

    @Override
    public void passengers(int numOfPassengers) {
        this.passengers = numOfPassengers;
    }

    @Override
    public double refuel(double liters) {
        return liters * fuelPrice;
    }
}
