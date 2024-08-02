package com.mx.week1.day4.products.entity;

import com.mx.week1.day4.products.implementations.IProducts;

public class Clothes implements IProducts {

    private int size;
    private String color;
    private double price;

    public Clothes() {
    }

    public Clothes(int size, String color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void showDetails() {
        System.out.println("Object Clothes Details:{" +
                           "size=" + size +
                           ", color='" + color + '\'' +
                           ", price=" + price +
                           '}');
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
               "size=" + size +
               ", color='" + color + '\'' +
               ", price=" + price +
               '}' + "\n";
    }
}
