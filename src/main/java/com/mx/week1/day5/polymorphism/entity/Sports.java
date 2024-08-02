package com.mx.week1.day5.polymorphism.entity;

public class Sports extends Vehicle {
    private int numCylinders;

    public String showData() {
        return """
                VEHICLE
                Brand: %s
                SubBrand: %s
                Model: %s
                NumCylinders: %d
                """.formatted(brand, subBrand, model, numCylinders);
    }

    public Sports() {
    }

    public Sports(String brand, String subBrand, String model, int numCylinders) {
        super(brand, subBrand, model);
        this.numCylinders = numCylinders;
    }

    public int getNumCylinders() {
        return numCylinders;
    }

    public void setNumCylinders(int numCylinders) {
        this.numCylinders = numCylinders;
    }

    @Override
    public String toString() {
        return "Sports{" +
               "numCylinders=" + numCylinders +
               ", brand='" + brand + '\'' +
               ", subBrand='" + subBrand + '\'' +
               ", model='" + model + '\'' +
               '}';
    }
}
