package com.mx.week1.day5.polymorphism.entity;

public class Vehicle {

    protected String brand;
    protected String subBrand;
    protected String model;

    public String showData() {
        return """
                VEHICLE
                Brand: %s
                SubBrand: %s
                Model: %s
                """.formatted(brand, subBrand, model);
    }

    public Vehicle() {
    }

    public Vehicle(String brand, String subBrand, String model) {
        this.brand = brand;
        this.subBrand = subBrand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSubBrand() {
        return subBrand;
    }

    public void setSubBrand(String subBrand) {
        this.subBrand = subBrand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

