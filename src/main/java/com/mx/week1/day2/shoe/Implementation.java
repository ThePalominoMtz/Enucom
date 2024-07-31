package com.mx.week1.day2.shoe;

import java.util.ArrayList;
import java.util.List;

// Our class interface implementation, using "implements"
public class Implementation implements IMethods {

    // List creation for object storage
    List<Shoe> shoeList = new ArrayList<Shoe>();

    @Override
    public void save(Shoe shoe) {
        shoeList.add(shoe);
    }

    @Override
    public void show() {
        System.out.println(shoeList);
    }

    @Override
    public void edit(int index, Shoe shoe) {
        shoeList.set(index, shoe);
    }

    @Override
    public void delete(int index) {
        shoeList.remove(index);
    }

    @Override
    public Shoe find(int index) {
        return shoeList.get(index);
    }

    // Customized Method
    public void countRegisters() {
        System.out.println("La lista contiene " + shoeList.size() + " zapatos");
    }

}
