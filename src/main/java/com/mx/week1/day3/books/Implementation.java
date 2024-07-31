package com.mx.week1.day3.books;


import java.util.HashMap;

public class Implementation implements IMethods {


    /*  HASHMAP SYNTAX:

     *  Lib -> java.util
     *  KeyDataValue -> Key primitive data container class
     *  ValueDataType -> Value primitive data container class
     *  name HashMap -> Programmer decision
     *  new -> Reserved word

     * */

    HashMap<Integer, Books> booksHashMap = new HashMap<Integer, Books>();


    @Override
    public void add(Books books) {
        booksHashMap.put(books.getKey(), books);
    }

    @Override
    public Books find(Books books) {
        return booksHashMap.get(books.getKey());
    }

    @Override
    public void edit(Books books) {
        booksHashMap.replace(books.getKey(), books);
    }

    @Override
    public void delete(Books books) {
        booksHashMap.remove(books.getKey());
    }

    @Override
    public void show() {
        System.out.println(booksHashMap);
    }

    // Customize Method
    public void count() {
        System.out.println("El HashMap contiene: " + booksHashMap.size() + " elementos");
    }
}
