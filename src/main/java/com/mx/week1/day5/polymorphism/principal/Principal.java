package com.mx.week1.day5.polymorphism.principal;

import com.mx.week1.day5.polymorphism.entity.Sports;
import com.mx.week1.day5.polymorphism.entity.Vehicle;

public class Principal {

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[4];

        vehicles[0] = new Vehicle("Honda", "Civic", "2002");
        vehicles[1] = new Sports("Ford", "GT", "2024", 5);

    }
}
