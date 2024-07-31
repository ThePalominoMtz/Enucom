package com.mx.week1.day1.telephone;

public class telephone {

    private String brand;
    private String model;
    private int price;
    private int memory;
    private int ram;

    public telephone() {
    }

    public telephone(String brand, String model, int price, int memory, int ram) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.memory = memory;
        this.ram = ram;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "telephone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", memory=" + memory +
                ", ram=" + ram +
                '}'+"\n";
    }
}
