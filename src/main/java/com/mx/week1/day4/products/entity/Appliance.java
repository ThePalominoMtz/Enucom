package com.mx.week1.day4.products.entity;

import com.mx.week1.day4.products.implementations.IProducts;

public class Appliance implements IProducts {

    private String brand;
    private String model;
    private double price;

    public Appliance() {
    }

    public Appliance(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void showDetails() {
        System.out.println("Object Appliance Details:{" +
                           "brand='" + brand + '\'' +
                           ", model='" + model + '\'' +
                           ", price=" + price +
                           '}');
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Appliance{" +
               "brand='" + brand + '\'' +
               ", model='" + model + '\'' +
               ", price=" + price +
               '}' + "\n";
    }
}
