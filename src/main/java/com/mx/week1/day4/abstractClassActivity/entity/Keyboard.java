package com.mx.week1.day4.abstractClassActivity.entity;

public class Keyboard extends Devices {

    private String distribution;
    private boolean isMechanic;

    public Keyboard() {
    }

    public Keyboard(String name, String color, String brand, int size, boolean isWireless, String distribution, boolean isMechanic) {
        super(name, color, brand, size, isWireless);
        this.distribution = distribution;
        this.isMechanic = isMechanic;
    }

    public String getDistribution() {
        return distribution;
    }

    public void setDistribution(String distribution) {
        this.distribution = distribution;
    }

    public boolean isMechanic() {
        return isMechanic;
    }

    public void setMechanic(boolean mechanic) {
        isMechanic = mechanic;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "distribution='" + distribution + '\'' +
                ", isMechanic=" + isMechanic +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", size=" + size +
                ", isWireless=" + isWireless +
                '}';
    }

    @Override
    public void purpose() {
        System.out.println("Hi I am a " + Keyboard.class.getSimpleName() + " device and my purpose is to use CTRL+C / CTRL+V like crazy");
    }
}
