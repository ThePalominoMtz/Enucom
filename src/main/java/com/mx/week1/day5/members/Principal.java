package com.mx.week1.day5.members;

public class Principal {

    public static String phrase1 = "Static Member";
    public final String phrase2 = "Variable final constant";
    public static final String phrase3 = "Variable final static";

    public static double circle(float radio) {
        return Math.PI * (radio * radio);
    }

    public static void main(String[] args) {
        System.out.println(phrase1);
        System.out.println(phrase3);

        float radio = 5, area = 0;
        area = (float) circle(radio);
        System.out.println("Area:" + area);
    }
}
