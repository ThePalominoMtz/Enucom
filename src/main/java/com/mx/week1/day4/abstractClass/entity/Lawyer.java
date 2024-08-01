package com.mx.week1.day4.abstractClass.entity;

public class Lawyer extends Professionals {
    private String type;
    private String office;
    private double fees;

    @Override
    public void work() {
        System.out.println("Trabajo todo el día");
    }

    public Lawyer() {
    }

    public Lawyer(String name, String lastname, int age, int certificate, String university, int experience, String type, String office, double fees) {
        super(name, lastname, age, certificate, university, experience);
        this.type = type;
        this.office = office;
        this.fees = fees;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }
}
