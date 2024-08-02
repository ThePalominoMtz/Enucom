package com.mx.week1.day5.polymorphism.entity;

public class Tourism extends Vehicle {

    private int numSeats;

    public String showData() {
        return """
                VEHICLE
                Brand: %s
                SubBrand: %s
                Model: %s
                NumSeats: %d
                """.formatted(brand, subBrand, model, numSeats);
    }

    public Tourism() {
    }

    public Tourism(String brand, String subBrand, String model, int numSeats) {
        super(brand, subBrand, model);
        this.numSeats = numSeats;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }
}
