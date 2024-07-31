package com.mx.week1.day2.shoe;

public class Principal {

    public static void main(String[] args) {

        // Videogame Objects
        Shoe shoe1 = new Shoe("Running", "Nike", 9.5, "Black", "USA", "Mesh", 120.0);
        Shoe shoe2 = new Shoe("Casual", "Adidas", 10.0, "White", "Germany", "Leather", 85.0);
        Shoe shoe3 = new Shoe("Formal", "Clarks", 8.5, "Brown", "UK", "Leather", 150.0);
        Shoe shoe4 = new Shoe("Hiking", "Merrell", 11.0, "Green", "USA", "Synthetic", 140.0);
        Shoe shoe5 = new Shoe("Basketball", "Jordan", 12.0, "Red", "China", "Synthetic", 200.0);

        // Auxiliar
        Shoe shoeAux = null;
        Implementation imp = new Implementation();

        // Add data into shoeList
        imp.save(shoe1);
        imp.save(shoe2);
        imp.save(shoe3);
        imp.save(shoe4);
        imp.save(shoe5);

        // Show
        imp.show();

        // Find
        shoeAux = imp.find(1);
        System.out.println("El zapato encontrado es:\n" + shoeAux);

        // Edit
        System.out.println(shoe1.getColor());
        shoeAux = imp.find(0);
        shoeAux.setColor("Purple");
        shoeAux.setMaterial("Leather");
        System.out.println(shoe1.getColor());
        imp.edit(0, shoe5);
        imp.show();

        // Remove
        imp.delete(1);
        imp.show();

        // Count
        imp.countRegisters();
    }
}
