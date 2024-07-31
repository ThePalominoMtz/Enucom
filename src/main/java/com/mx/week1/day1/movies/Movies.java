package com.mx.week1.day1.movies;

import java.time.LocalDate;
import java.util.Objects;

public class Movies {

    private String name;
    private String director;
    private LocalDate date;
    private int boxOffice;

    public Movies() {
    }

    public Movies(String name, String director, LocalDate date, int boxOffice) {
        this.name = name;
        this.director = director;
        this.date = date;
        this.boxOffice = boxOffice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getBoxOffice() {
        return boxOffice;
    }

    public void setBoxOffice(int boxOffice) {
        this.boxOffice = boxOffice;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", date=" + date +
                ", boxOffice=" + boxOffice +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movies movies = (Movies) o;
        return boxOffice == movies.boxOffice && Objects.equals(name, movies.name) && Objects.equals(director, movies.director) && Objects.equals(date, movies.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, director, date, boxOffice);
    }
}
