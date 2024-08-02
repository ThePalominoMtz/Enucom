package com.mx.week1.day4.products.principal;

import com.mx.week1.day4.products.entity.Appliance;
import com.mx.week1.day4.products.entity.Clothes;
import com.mx.week1.day4.products.entity.Inventory;
import com.mx.week1.day4.products.implementations.IProducts;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    static String brand;
    static String model;
    static double price;
    static int size;
    static String color;

    static Inventory inventory = new Inventory();
    static Scanner sc = null;

    public static void populateList() {
        inventory.addProduct(new Appliance("LG", "TWINWash", 999.99));
        inventory.addProduct(new Appliance("Samsung", "FlexWash", 29.99));
        inventory.addProduct(new Appliance("Whirlpool", "Smart All-In-One", 1099.99));
        inventory.addProduct(new Appliance("Bosch", "Serie 6", 749.99));
        inventory.addProduct(new Appliance("Electrolux", "PerfectCare", 849.99));
        inventory.addProduct(new Clothes(32, "Red", 29.99));
        inventory.addProduct(new Clothes(34, "Blue", 34.99));
        inventory.addProduct(new Clothes(36, "Black", 39.99));
        inventory.addProduct(new Clothes(38, "Green", 24.99));
        inventory.addProduct(new Clothes(40, "White", 19.99));
    }


    public static Object scannerInput(String type) {
        sc = new Scanner(System.in);
        return switch (type.toLowerCase()) {
            case "string" -> sc.nextLine();
            case "int" -> sc.nextInt();
            case "double" -> sc.nextDouble();
            default -> throw new IllegalArgumentException("Unsupported type: " + type);
        };
    }

    public static void create() {
        System.out.println("""
                Select object type:
                1. Appliance
                2. Clothes
                """);
        sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
                System.out.print("""
                        -> Brand: 
                        """);
                brand = (String) scannerInput("string");

                System.out.print("""
                        -> Model: 
                        """);
                model = (String) scannerInput("string");

                System.out.print("""
                        -> Price: 
                        """);
                price = (double) scannerInput("double");

                // Add Product
                inventory.addProduct(new Appliance(brand, model, price));
                System.out.println("Appliance Product Added");
                break;

            case 2:
                System.out.print("""
                        -> Size: 
                        """);
                size = (int) scannerInput("int");

                System.out.print("""
                        -> Color: 
                        """);
                color = (String) scannerInput("string");

                System.out.print("""
                        -> Price: 
                        """);
                price = (double) scannerInput("double");

                // Add Product
                inventory.addProduct(new Clothes(size, color, price));
                System.out.println("Clothes Product Added");
                break;
            default:
                System.out.println("""
                        Please, select 1 or 2
                        """);
                break;
        }
    }

    public static void read() {
        System.out.println("""
                Select attribute:
                1. Brand
                2. Model
                3. Price
                4. Size
                5. Color
                6. Exit
                """);
        sc = new Scanner(System.in);
        List<IProducts> results = new ArrayList<>();
        switch (sc.nextInt()) {
            case 1:
                System.out.print("Brand: ");
                brand = (String) scannerInput("string");
                results = inventory.objectList.stream()
                        .filter(iProduct -> iProduct instanceof Appliance &&
                                            brand.equalsIgnoreCase(((Appliance) iProduct).getBrand()))
                        .toList();

                // Guard Clause
                if (results.isEmpty()) {
                    System.out.println("No objects");
                    break;
                }

                // Results
                System.out.println(results.size() + " objects by " + brand + " brand:");
                System.out.println(results);
                break;

            case 2:
                System.out.print("Model: ");
                model = (String) scannerInput("string");
                results = inventory.objectList.stream()
                        .filter(iProduct -> iProduct instanceof Appliance &&
                                            model.equalsIgnoreCase(((Appliance) iProduct).getModel()))
                        .toList();

                // Guard Clause
                if (results.isEmpty()) {
                    System.out.println("No objects");
                    break;
                }

                // Results
                System.out.println(results.size() + " objects by " + model + " model:");
                System.out.println(results);
                break;

            case 3:
                System.out.print("Price: ");
                price = (double) scannerInput("double");
                results = inventory.objectList.stream()
                        .filter(iProduct -> price == iProduct.getPrice())
                        .toList();

                // Guard Clause
                if (results.isEmpty()) {
                    System.out.println("No objects");
                    break;
                }

                // Results
                System.out.println(results.size() + " objects by " + price + " price:");
                System.out.println(results);
                break;

            case 4:
                System.out.print("Size: ");
                size = (int) scannerInput("int");
                results = inventory.objectList.stream()
                        .filter(iProduct -> iProduct instanceof Clothes &&
                                            size == ((Clothes) iProduct).getSize())
                        .toList();

                // Guard Clause
                if (results.isEmpty()) {
                    System.out.println("No objects");
                    break;
                }

                // Results
                System.out.println(results.size() + " objects by " + size + "  size:");
                System.out.println(results);
                break;

            case 5:
                System.out.print("Color: ");
                color = (String) scannerInput("string");
                results = inventory.objectList.stream()
                        .filter(iProduct -> iProduct instanceof Clothes &&
                                            color.equalsIgnoreCase(((Clothes) iProduct).getColor()))
                        .toList();

                // Guard Clause
                if (results.isEmpty()) {
                    System.out.println("No objects");
                    break;
                }

                // Results
                System.out.println(results.size() + " objects by " + color + " color:");
                System.out.println(results);
                break;

            case 6:
                System.out.println("Back to main menu");
                break;
            default:
                System.out.println("""
                        Please, select in range 1-5
                        """);
                break;
        }
    }

    public static void update() {
        System.out.print("""
                Introduce object index to update: 
                """);
        int index = (int) scannerInput("int");

        IProducts product;
        try {
            product = inventory.findProduct(index);
        } catch (Exception e) {
            System.out.println("Index error");
            return;
        }

        // Guard Clause
        if (product == null) {
            System.out.println("Index error");
            return;
        }

        int control = (product instanceof Appliance) ? 1 : 2;

        switch (control) {
            case 1:
                System.out.print("""
                        -> Brand: 
                        """);
                brand = (String) scannerInput("string");

                System.out.print("""
                        -> Model: 
                        """);
                model = (String) scannerInput("string");

                System.out.print("""
                        -> Price: 
                        """);
                price = (double) scannerInput("double");

                // Update Product
                ((Appliance) product).setBrand(brand);
                ((Appliance) product).setModel(model);
                ((Appliance) product).setPrice(price);
                inventory.editProduct(index, product);
                System.out.println("Appliance Product Updated");
                break;

            case 2:
                System.out.print("""
                        -> Size: 
                        """);
                size = (int) scannerInput("int");

                System.out.print("""
                        -> Color: 
                        """);
                color = (String) scannerInput("string");

                System.out.print("""
                        -> Price: 
                        """);
                price = (double) scannerInput("double");

                // Update Product
                ((Clothes) product).setSize(size);
                ((Clothes) product).setColor(color);
                ((Clothes) product).setPrice(price);
                inventory.editProduct(index, product);
                System.out.println("Clothes Product Updated");
                break;
            default:
                System.out.println("""
                        ERROR.
                        """);
                break;
        }


    }

    public static void delete() {
        System.out.print("""
                Introduce object index to delete: 
                """);
        int index = (int) scannerInput("int");

        try {
            inventory.removeProduct(index);
            System.out.println("Object eliminated");
        } catch (Exception e) {
            System.out.println("Index error");
        }

    }

    public static void sizeList() {
        inventory.showProducts();
    }

    public static void showDetails() {
        inventory.objectList.forEach(IProducts::showDetails);
    }

    public static void main(String[] args) {

        populateList();

        int menuController = 0;

        do {
            String menu = """
                    ╔═════════════════════════════════════════╗
                    ║                MAIN MENU                ║
                    ╠═════════════════════════════════════════╣
                    ║ 1. Create                               ║
                    ║ 2. Read                                 ║
                    ║ 3. Update                               ║
                    ║ 4. Delete                               ║
                    ║ 5. Size                                 ║
                    ║ 6. Details                              ║
                    ║ 7. Exit                                 ║
                    ╚═════════════════════════════════════════╝
                    """;
            System.out.println(menu);
            sc = new Scanner(System.in);
            menuController = sc.nextInt();
            switch (menuController) {
                case 1:
                    create();
                    break;
                case 2:
                    read();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    sizeList();
                    break;
                case 6:
                    showDetails();
                    break;
                default:
                    break;
            }
        } while (menuController != 7);
    }
}
