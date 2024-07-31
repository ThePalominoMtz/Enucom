package com.mx.week1.day3.books;

public class Books {

    private int key;
    private String name;
    private String author;
    private String editorial;
    private double price;
    private String genre;

    public Books() {
    }

    public Books(int key) {
        this.key = key;
    }

    public Books(int key, String name, String author, String editorial, double price, String genre) {
        this.key = key;
        this.name = name;
        this.author = author;
        this.editorial = editorial;
        this.price = price;
        this.genre = genre;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", editorial='" + editorial + '\'' +
                ", price=" + price +
                ", genre='" + genre + '\'' +
                '}' + "\n";
    }
}
