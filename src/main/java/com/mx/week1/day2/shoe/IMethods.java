package com.mx.week1.day2.shoe;

// Interface is a template for class construction
public interface IMethods {

    // CRUD: Acronym for CREATE - READ - UPDATE - DELETE operations
    public void save(Shoe shoe);

    public void show();

    public void edit(int index, Shoe shoe);

    public void delete(int index);

    public Shoe find(int index);
}
