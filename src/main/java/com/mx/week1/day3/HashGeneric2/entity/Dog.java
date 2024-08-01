package com.mx.week1.day3.HashGeneric2.entity;

public class Dog {

    private String name;
    private String race;
    private int age;
    private double size;
    private boolean isVaccinated;

    public Dog(String name, String race, int age, double size, boolean isVaccinated) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.size = size;
        this.isVaccinated = isVaccinated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", age=" + age +
                ", size=" + size +
                ", isVaccinated=" + isVaccinated +
                '}' + "\n";
    }
}
