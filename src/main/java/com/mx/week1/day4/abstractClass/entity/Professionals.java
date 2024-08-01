package com.mx.week1.day4.abstractClass.entity;

public abstract class Professionals {

    protected String name;
    protected String lastname;
    protected int age;
    protected int certificate;
    protected String university;
    protected int experience;


    public void charge(String work, double salary) {
        System.out.println("Trabajo como " + work + " y me pagan " + salary);
    }

    public abstract void work();

    public Professionals() {
    }

    public Professionals(String name, String lastname, int age, int certificate, String university, int experience) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.certificate = certificate;
        this.university = university;
        this.experience = experience;
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

    public int getCertificate() {
        return certificate;
    }

    public void setCertificate(int certificate) {
        this.certificate = certificate;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Professionals{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", certificate=" + certificate +
                ", university='" + university + '\'' +
                ", experience=" + experience +
                '}';
    }
}
