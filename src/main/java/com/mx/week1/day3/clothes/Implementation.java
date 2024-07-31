package com.mx.week1.day3.clothes;

import java.util.HashMap;

public class Implementation implements IMethods {

    /*  HASHMAP SYNTAX:

     *  Lib -> java.util
     *  KeyDataValue -> Key primitive data container class
     *  ValueDataType -> Value primitive data container class
     *  name HashMap -> Programmer decision
     *  new -> Reserved word

     * */

    HashMap<Integer, Clothes> clothesHashMap = new HashMap<Integer, Clothes>();


    @Override
    public void add(Clothes clothes) {
        clothesHashMap.put(clothes.getKey(), clothes);
    }

    @Override
    public Clothes find(Clothes clothes) {
        return clothesHashMap.get(clothes.getKey());
    }

    @Override
    public void edit(Clothes clothes) {
        clothesHashMap.replace(clothes.getKey(), clothes);
    }

    @Override
    public void delete(Clothes clothes) {
        clothesHashMap.remove(clothes);
    }

    @Override
    public void show(Clothes clothes) {
        System.out.println(clothesHashMap);
    }

    // Customize Method
    public void count(){
        System.out.println("El HashMap contiene: "+clothesHashMap.size()+" elementos");
    }
}
