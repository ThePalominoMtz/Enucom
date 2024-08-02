package com.mx.week1.day5.lambda;

public class Student {

    // Attributes
    private int id;
    private String name;
    private String lastname1;
    private String lastname2;
    private int age;
    private String degree;
    private String university;

    public Student() {
    }

    public Student(int id, String name, String lastname1, String lastname2, int age, String degree, String university) {
        this.id = id;
        this.name = name;
        this.lastname1 = lastname1;
        this.lastname2 = lastname2;
        this.age = age;
        this.degree = degree;
        this.university = university;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname1() {
        return lastname1;
    }

    public void setLastname1(String lastname1) {
        this.lastname1 = lastname1;
    }

    public String getLastname2() {
        return lastname2;
    }

    public void setLastname2(String lastname2) {
        this.lastname2 = lastname2;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "Student{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", lastname1='" + lastname1 + '\'' +
               ", lastname2='" + lastname2 + '\'' +
               ", age=" + age +
               ", degree='" + degree + '\'' +
               ", university='" + university + '\'' +
               '}';
    }
}
