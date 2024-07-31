package com.mx.week1.day2.videogame;

import java.util.ArrayList;
import java.util.List;

// Our class interface implementation, using "implements"
public class Implementation implements IMethods {

    // List creation for object storage
    List<Videogame> videogameList = new ArrayList<Videogame>();

    @Override
    public void save(Videogame videogame) {
        videogameList.add(videogame);
    }

    @Override
    public void show() {
        System.out.println(videogameList);
    }

    @Override
    public void edit(int index, Videogame videogame) {
        videogameList.set(index, videogame);
    }

    @Override
    public void delete(int index) {
        videogameList.remove(index);
    }

    @Override
    public Videogame find(int index) {
        return videogameList.get(index);
    }

    // Customized Method
    public void countRegisters() {
        System.out.println("La lista contiene " + videogameList.size() + " videojuegos");
    }

}
