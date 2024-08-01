package com.mx.week1.day4.Inheritance;

public class Father {

    // Accessible attributes for all subclasses
    protected String name;
    protected String lastname;
    protected int age;
    protected double height;
    protected String nationality;

    public Father() {
    }

    public Father(String name, String lastname, int age, double height, String nationality) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.height = height;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }


    public void work() {
        System.out.println("Trabajo: 8:00am a 4:00pm \n");
    }
}
