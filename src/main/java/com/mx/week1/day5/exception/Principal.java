package com.mx.week1.day5.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.SplittableRandom;

public class Principal {

    public static void main(String[] args) {
        Functions functions = new Functions();
        String url = "src/main/java/com/mx/week1/day5/exception/file.txt";
        try {
            functions.readFile(url);
        } catch (FileNotFoundException e) {
            System.out.println("This file not exists");
        } catch (IOException e) {
            System.out.println("Exception Error");
        }

        System.out.println();

        try {
            functions.divide(0, 0);
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException");
        }
    }
}
