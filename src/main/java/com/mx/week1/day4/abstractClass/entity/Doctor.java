package com.mx.week1.day4.abstractClass.entity;

public class Doctor extends Professionals{

    private String specialty;
    private String office;
    private int consultationFee;

    public Doctor(String name, String lastname, int age, int certificate, String university, int experience, String specialty, String office, int consultationFee) {
        super(name, lastname, age, certificate, university, experience);
        this.specialty = specialty;
        this.office = office;
        this.consultationFee = consultationFee;
    }

    @Override
    public void work() {
        System.out.println("Trabajo en turnos nocturnos");
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public int getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(int consultationFee) {
        this.consultationFee = consultationFee;
    }
}
