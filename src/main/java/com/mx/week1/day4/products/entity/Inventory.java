package com.mx.week1.day4.products.entity;

import com.mx.week1.day4.products.implementations.IProducts;

import java.util.ArrayList;
import java.util.List;

public class Inventory {


    public List<IProducts> objectList = new ArrayList<>();

    public void addProduct(IProducts object) {
        objectList.add(object);
    }

    public void showProducts() {
        System.out.println("List Size: " + objectList.size());
        System.out.println(objectList);
    }

    public IProducts findProduct(int index) {
        return objectList.get(index);
    }

    public void editProduct(int index, IProducts object) {
        objectList.set(index, object);
    }

    public void removeProduct(int index) {
        objectList.remove(index);
    }
}
