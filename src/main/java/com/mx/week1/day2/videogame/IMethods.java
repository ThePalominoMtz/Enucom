package com.mx.week1.day2.videogame;

// Interface is a template for class construction
public interface IMethods {

    // CRUD: Acronym for CREATE - READ - UPDATE - DELETE operations
    public void save(Videogame videogame);

    public void show();

    public void edit(int index, Videogame videogame);

    public void delete(int index);

    public Videogame find(int index);
}
