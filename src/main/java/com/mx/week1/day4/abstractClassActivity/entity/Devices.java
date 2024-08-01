package com.mx.week1.day4.abstractClassActivity.entity;

public abstract class Devices {
    protected String name;
    protected String color;
    protected String brand;
    protected int size;
    protected boolean isWireless;


    public void information(String color, int size) {
        System.out.println("Im a " + color + " device with " + size + " of size");
    }

    public abstract void purpose();

    public Devices() {
    }

    public Devices(String name, String color, String brand, int size, boolean isWireless) {
        this.name = name;
        this.color = color;
        this.brand = brand;
        this.size = size;
        this.isWireless = isWireless;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }

    @Override
    public String toString() {
        return "Devices{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", size=" + size +
                ", isWireless=" + isWireless +
                '}';
    }
}
