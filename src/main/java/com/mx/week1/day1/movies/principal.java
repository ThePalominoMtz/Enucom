package com.mx.week1.day1.movies;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class principal {


    public static void main(String[] args) {

        // Cre
        Movies movie1 = new Movies("Avengers EndGame", "RussoBrothers", LocalDate.of(2019, 5, 21), 10000);
        Movies movie2 = new Movies("Avengers", "", LocalDate.of(2010, 7, 16), 50000);
        Movies movie3 = new Movies("Deadpool and Wolverine", "The Real Heroes", LocalDate.of(2024, 8, 24), 80000);
        Movies movie4 = new Movies("Guardians of the Galaxy", "James Gunn", LocalDate.of(2014, 2, 14), 60000);
        Movies movie5 = new Movies("Eternals", "Director Example", LocalDate.of(2022, 6, 29), 20000);
        Movies movie6 = new Movies("Spiderman No Way Home", "Jhonn Whats", LocalDate.of(2023, 6, 21), 50000);

        List<Movies> moviesList = new ArrayList<Movies>();


        moviesList.add(movie1);
        moviesList.add(movie2);
        moviesList.add(movie3);
        moviesList.add(movie4);
        moviesList.add(movie5);

        // :D
        message(moviesList);

        moviesList.remove(movie1);
        System.out.println("Se ha removido la pelicula " + movie1.getName());

        message(moviesList);

        moviesList.add(movie6);
        System.out.println("Se ha agregado la pelicula " + movie6.getName());

        message(moviesList);

    }

    public static void message(List<Movies> moviesList) {
        System.out.println("\nActualmente la lista contiene " + moviesList.size() + " peliculas:\n" + moviesList + "\n");
    }
}
