package com.mx.week1.day3.books;


public class Principal {

    public static void main(String[] args) {

        Books book1 = new Books(1, "1984", "George Orwell", "Secker & Warburg", 9.99, "Dystopian");
        Books book2 = new Books(2, "To Kill a Mockingbird", "Harper Lee", "J.B. Lippincott & Co.", 7.99, "Fiction");
        Books book3 = new Books(3, "The Great Gatsby", "F. Scott Fitzgerald", "Charles Scribner's Sons", 10.99, "Novel");
        Books book4 = new Books(4, "Pride and Prejudice", "Jane Austen", "T. Egerton", 6.99, "Romance");
        Books book5 = new Books(5, "The Catcher in the Rye", "J.D. Salinger", "Little, Brown and Company", 8.99, "Fiction");

        // Aux
        Books booksAux = null;
        Implementation imp = new Implementation();

        // Add
        imp.add(book1);
        imp.add(book2);
        imp.add(book3);
        imp.add(book4);
        imp.add(book5);

        // Show
        System.out.println("Show Example:");
        imp.show();

        // Find
        System.out.println("Find Example:");
        booksAux = imp.find(book1);
        System.out.println(booksAux);

        // Edit
        System.out.println("Edit Example:");
        booksAux = new Books(1);
        booksAux = imp.find(booksAux);
        booksAux.setAuthor("AuthorTest");
        imp.edit(booksAux);
        imp.show();

        // Delete
        System.out.println("Remove example:");
        booksAux  = new Books(1);
        booksAux = imp.find(booksAux);
        imp.delete(booksAux);
        imp.show();

        // Count
        imp.count();

    }
}
