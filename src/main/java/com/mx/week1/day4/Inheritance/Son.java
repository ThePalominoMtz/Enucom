package com.mx.week1.day4.Inheritance;

public class Son extends Father {

    // Attributes
    private String eyesColor;
    private String complexion;

    public Son() {
    }

    public Son(String name, String lastname, int age, double height, String nationality, String eyesColor, String complexion) {
        super(name, lastname, age, height, nationality);
        this.eyesColor = eyesColor;
        this.complexion = complexion;
    }

    @Override
    public String toString() {
        return "Son{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", height='" + height + '\'' +
                ", nationality='" + nationality + '\'' +
                ", eyesColor='" + eyesColor + '\'' +
                ", complexion='" + complexion + '\'' +
                '}';
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public String getComplexion() {
        return complexion;
    }

    public void setComplexion(String complexion) {
        this.complexion = complexion;
    }

}
