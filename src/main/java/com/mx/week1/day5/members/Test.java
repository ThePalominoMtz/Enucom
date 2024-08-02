package com.mx.week1.day5.members;

import static com.mx.week1.day5.members.Principal.circle;
import static com.mx.week1.day5.members.Principal.phrase3;

public class Test {

    public static void main(String[] args) {

        Principal obj1 = new Principal();
        Principal obj2 = new Principal();

        System.out.println(obj1.phrase2);

        // Incorrect way
        System.out.println(obj2.phrase3);

        // Correct way
        System.out.println(phrase3);

        // Incorrect way
        double circle = obj1.circle(5);

        // Correct way
        double circle2 = circle(5);
    }
}
