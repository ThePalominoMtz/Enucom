package com.mx.week1.day5.polymorphism.entity;

public class PickUp extends Vehicle {
    private int chargeCapacity;

    public String showData() {
        return """
                VEHICLE
                Brand: %s
                SubBrand: %s
                Model: %s
                Charge Capacity: %d
                """.formatted(brand, subBrand, model, chargeCapacity);
    }

    public PickUp() {
    }

    public PickUp(String brand, String subBrand, String model, int chargeCapacity) {
        super(brand, subBrand, model);
        this.chargeCapacity = chargeCapacity;
    }

    public int getChargeCapacity() {
        return chargeCapacity;
    }

    public void setChargeCapacity(int chargeCapacity) {
        this.chargeCapacity = chargeCapacity;
    }

    @Override
    public String toString() {
        return "PickUp{" +
               "chargeCapacity=" + chargeCapacity +
               ", brand='" + brand + '\'' +
               ", subBrand='" + subBrand + '\'' +
               ", model='" + model + '\'' +
               '}';
    }
}
