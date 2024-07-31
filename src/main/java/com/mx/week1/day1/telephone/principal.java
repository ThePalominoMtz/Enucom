package com.mx.week1.day1.telephone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {

        // Local Variables
        String brand;
        String model;
        int price;
        int memory;
        int ram;

        // Object Instance
        telephone obj1 = new telephone("Xiaomi", "POCOPhoneF6", 5000, 512, 16);
        telephone obj2 = new telephone("Motorola", "Moto G60s", 2000, 128, 6);
        telephone obj3 = new telephone("Xiaomi", "Redmi 13", 13000, 256, 12);
        telephone obj4 = new telephone("Samsung", "Grand Prime", 5000, 64, 8);

        telephone telephone;

        List<telephone> telephoneList = new ArrayList<telephone>();

        telephoneList.add(obj1);
        telephoneList.add(obj2);
        telephoneList.add(obj3);
        telephoneList.add(obj4);

        //System.out.println("List data list: \n" + telephoneList);

        Scanner sc = null;
        int menuP = 0, menuS = 0, index = 0;
        do {
            System.out.println("======================= -=- MENÚ =======================");
            System.out.println("===   1.- Agregar nuevo registro");
            System.out.println("===   2.- Mostrar la lista");
            System.out.println("===   3.- Editar ");
            System.out.println("===   4.- Buscar un elemento");
            System.out.println("===   5.- Eliminar un elemento");
            System.out.println("===   6.- Contar todos los elementos de la lista ");
            System.out.println("===   7.- Salir del menú ");
            System.out.println("========================================================");
            System.out.println("-> Elige una opción ...");
            sc = new Scanner(System.in);
            menuP = sc.nextInt();
            switch (menuP) {
                case 1:
                    System.out.println("========================================================");
                    System.out.println("===   OPCIÓN 1 - AGREGAR UN NUEVO ELEMENTO:");

                    System.out.println("-> Escribe la marca del telefono:");
                    sc = new Scanner(System.in);
                    brand = sc.nextLine();

                    System.out.println("-> Escribe el modelo del nuevo telefono:");
                    sc = new Scanner(System.in);
                    model = sc.nextLine();

                    System.out.println("-> Escribe el precio del nuevo telefono:");
                    sc = new Scanner(System.in);
                    price = sc.nextInt();

                    System.out.println("-> Escribe la memoria del nuevo telefono:");
                    sc = new Scanner(System.in);
                    memory = sc.nextInt();

                    System.out.println("-> Escribe la ram del nuevo telefono:");
                    sc = new Scanner(System.in);
                    ram = sc.nextInt();

                    telephone a = new telephone(brand, model, price, memory, ram);
                    telephoneList.add(a);
                    System.out.println("Listo");
                    break;

                case 2:
                    System.out.println("Mostrar todos los elementos de la lista");
                    System.out.println("La información almacenadaa es:\n" + telephoneList);
                    break;

                case 3:
                    System.out.println("Ingresa un indice para editar");
                    sc = new Scanner(System.in);
                    index = sc.nextInt();
                    telephone = telephoneList.get(index);
                    do {
                        System.out.println("======================= -=- MENÚ =======================");
                        System.out.println("===   1.- Modificar marca");
                        System.out.println("===   2.- Modificar modelo");
                        System.out.println("===   3.- Modificar precio ");
                        System.out.println("===   4.- Modificar memoria");
                        System.out.println("===   5.- Modificar ram");
                        System.out.println("===   6.- Salir del menú ");
                        System.out.println("========================================================");
                        System.out.println("-> Elige una opción ...");
                        sc = new Scanner(System.in);
                        menuS = sc.nextInt();
                        switch (menuS) {
                            case 1:
                                System.out.println("Modificar marca");
                                sc = new Scanner(System.in);
                                brand = sc.nextLine();
                                telephone.setBrand(brand);
                                System.out.println("Marca modificada exitosamente");
                                break;
                            case 2:
                                System.out.println("Modificar modelo");
                                sc = new Scanner(System.in);
                                model = sc.nextLine();
                                telephone.setModel(model);
                                System.out.println("Modelo modificado exitosamente");
                                break;
                            case 3:
                                System.out.println("Modificar precio");
                                sc = new Scanner(System.in);
                                price = sc.nextInt();
                                telephone.setPrice(price);
                                System.out.println("Precio modificado exitosamente");
                                break;
                            case 4:
                                System.out.println("Modificar memoria");
                                sc = new Scanner(System.in);
                                memory = sc.nextInt();
                                telephone.setMemory(memory);
                                System.out.println("Memoria modificada exitosamente");
                                break;
                            case 5:
                                System.out.println("Modificar ram");
                                sc = new Scanner(System.in);
                                ram = sc.nextInt();
                                telephone.setRam(ram);
                                System.out.println("Ram modificada exitosamente");
                                break;
                        }
                    } while (menuS != 6);
                    System.out.println("Editar informacion del telefono");
                    break;

                case 4:
            }
        } while (menuP != 7);


    }
}
