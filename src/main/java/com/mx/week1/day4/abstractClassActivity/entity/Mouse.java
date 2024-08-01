package com.mx.week1.day4.abstractClassActivity.entity;

public class Mouse extends Devices {

    private int dpi;
    private boolean isRGB;

    public Mouse() {
    }

    public Mouse(String name, String color, String brand, int size, boolean isWireless, int dpi, boolean isRgb) {
        super(name, color, brand, size, isWireless);
        this.dpi = dpi;
        this.isRGB = isRgb;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "dpi=" + dpi +
                ", isRGB=" + isRGB +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", size=" + size +
                ", isWireless=" + isWireless +
                '}';
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public boolean isRGB() {
        return isRGB;
    }

    public void setRGB(boolean RGB) {
        isRGB = RGB;
    }

    @Override
    public void purpose() {
        System.out.println("Hi I am a " + Mouse.class.getSimpleName() + " device and my purpose is to click left button like crazy");
    }
}
