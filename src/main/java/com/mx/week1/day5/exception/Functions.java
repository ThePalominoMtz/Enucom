package com.mx.week1.day5.exception;

import java.io.*;

public class Functions {

    public void readFile(String url) throws FileNotFoundException, IOException {
        String line;
        File file = new File(url);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }

    public void divide(int a, int b) {
        System.out.println("Result: " + (a / b));
    }
}
