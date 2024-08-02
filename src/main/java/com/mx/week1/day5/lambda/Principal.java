package com.mx.week1.day5.lambda;

import java.util.ArrayList;
import java.util.List;

public class Principal {


    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(19639213, "Palomino", "Martinez", "Sanchez", 23, "Ing.Sistemas", "ITSPR"));
        studentList.add(new Student(19639214, "Gonzalez", "Lopez", "Ramirez", 22, "Ing.Civil", "UNAM"));
        studentList.add(new Student(19639215, "Fernandez", "Garcia", "Hernandez", 24, "Ing.Mecanica", "BUAP"));
        studentList.add(new Student(19639216, "Rodriguez", "Martinez", "Perez", 21, "Ing.Quimica", "UNAM"));
        studentList.add(new Student(19639217, "Sanchez", "Diaz", "Torres", 23, "Ing.Electronica", "UV"));

        studentList.forEach(student -> System.out.println("Student name: " + student.getName()));

        System.out.println("Student Details");
        studentList.stream().filter(
                        student -> student.getUniversity().equalsIgnoreCase("UNAM"))
                .forEach(System.out::println);


        // Implementation
        IMessage iMessage = (s) -> "Hi " + s;

        // Message
        System.out.printf("""
                Lambda Expressions with one parameter:
                %s
                """, iMessage.message("sasas"));
    }
}
