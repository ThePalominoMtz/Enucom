package com.mx.week1.day3.clothes;

public class Principal {

    public static void main(String[] args) {
        Clothes clothes1 = new Clothes(1, "T-shirt", "Nike", 42, "USA", 25.99);
        Clothes clothes2 = new Clothes(2, "Jeans", "Levi's", 32, "Mexico", 49.99);
        Clothes clothes3 = new Clothes(3, "Jacket", "Adidas", 38, "Germany", 89.99);
        Clothes clothes4 = new Clothes(4, "Sweater", "H&M", 40, "China", 29.99);
        Clothes clothes5 = new Clothes(5, "Shorts", "Puma", 34, "India", 19.99);

        // Aux
        Clothes clothesAux = null;

        // Implementation
        Implementation imp = new Implementation();

        // Add
        imp.add(clothes1);
        imp.add(clothes2);
        imp.add(clothes3);
        imp.add(clothes4);
        imp.add(clothes5);


        // Find

        clothesAux = new Clothes(0);
        clothesAux = imp.find(clothesAux);
        System.out.println(clothesAux);

    }
}
