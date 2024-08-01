package com.mx.week1.day3.HashGeneric2.implementations;

import com.mx.week1.day3.HashGeneric2.principal.IMethods;

import java.util.ArrayList;
import java.util.List;

public class ImpGeneric implements IMethods {


    // Object List Creation
    protected List<Object> objectList = new ArrayList<>();

    @Override
    public void add(Object object) {
        objectList.add(object);
    }

    @Override
    public void show() {
        System.out.println(objectList);
    }

    @Override
    public void edit(int index, Object object) {
        objectList.set(index, object);
    }

    @Override
    public void delete(Object object) {
        objectList.remove(object);
    }

    @Override
    public Object find(int index) {
        return objectList.get(index);
    }

}
