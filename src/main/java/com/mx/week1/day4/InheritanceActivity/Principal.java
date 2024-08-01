package com.mx.week1.day4.InheritanceActivity;

public class Principal {

    public static void main(String[] args) {

        normalUser normalUser1 = new normalUser(1, "Julio", "Rocha", 21, true, "Clean my bathroom", "Bathroom");

        System.out.println(normalUser1);
        normalUser1.saySomething();
        normalUser1.setNormalActivities("Clean my setup");
        System.out.println(normalUser1);
    }
}
