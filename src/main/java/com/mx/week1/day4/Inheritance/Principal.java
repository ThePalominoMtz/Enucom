package com.mx.week1.day4.Inheritance;

public class Principal {

    public static void main(String[] args) {

        // Create a Son Instance
        Son son1 = new Son("Palomino","Martinez",23,1.75,"Mexicana","Negro","Delgada");
        System.out.println(son1);

        son1.work();
        son1.setAge(18);
        System.out.println(son1);

    }
}
