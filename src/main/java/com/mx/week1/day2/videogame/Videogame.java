package com.mx.week1.day2.videogame;

public class Videogame {

    private String name;
    private String type;
    private double price;
    private String developer;
    private String origin;

    public Videogame() {
    }

    public Videogame(String name, String type, double price, String developer, String origin) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.developer = developer;
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Videogame{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", developer='" + developer + '\'' +
                ", origin='" + origin + '\'' +
                '}'+"\n";
    }
}
