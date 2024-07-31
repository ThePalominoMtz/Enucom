package com.mx.week1.day2.shoe;

public class Shoe {

    private String type;
    private String brand;
    private double size;
    private String color;
    private String origin;
    private String material;
    private double prize;

    public Shoe() {
    }

    public Shoe(String type, String brand, double size, String color, String origin, String material, double prize) {
        this.type = type;
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.origin = origin;
        this.material = material;
        this.prize = prize;
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

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    @Override
    public String toString() {
        return "Videogame{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", origin='" + origin + '\'' +
                ", material='" + material + '\'' +
                ", prize=" + prize +
                '}' + "\n";
    }
}
