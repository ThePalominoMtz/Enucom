package com.mx.week1.day3.clothes;

public class Clothes {

    private int key;
    private String type;
    private String brand;
    private int size;
    private String origin;
    private double price;

    public Clothes() {
    }

    public Clothes(int key) {
        this.key = key;
    }

    public Clothes(int key, String type, String brand, int size, String origin, double price) {
        this.key = key;
        this.type = type;
        this.brand = brand;
        this.size = size;
        this.origin = origin;
        this.price = price;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "key=" + key +
                ", type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", size=" + size +
                ", origin='" + origin + '\'' +
                ", price=" + price +
                '}' + "\n";
    }
}
