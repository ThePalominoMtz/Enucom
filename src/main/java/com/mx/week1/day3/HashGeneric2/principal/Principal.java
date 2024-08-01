package com.mx.week1.day3.HashGeneric2.principal;

import com.mx.week1.day3.HashGeneric2.entity.Cat;
import com.mx.week1.day3.HashGeneric2.entity.Dog;
import com.mx.week1.day3.HashGeneric2.entity.Duck;
import com.mx.week1.day3.HashGeneric2.implementations.ImpCat;
import com.mx.week1.day3.HashGeneric2.implementations.ImpDog;
import com.mx.week1.day3.HashGeneric2.implementations.ImpDuck;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Dog dogAux = null;
        Cat catAux = null;
        Duck duckAux = null;

        Object objAux = null;

        ImpDog impDog = new ImpDog();
        ImpCat impCat = new ImpCat();
        ImpDuck impDuck = new ImpDuck();

        String name;
        String race;
        int age;
        double size;
        boolean isVaccinated;

        Dog dog1 = new Dog("dsds", "dsds", 21, 21, true);
        Duck duck1 = new Duck("dsds", "dsds", 21, 21, true);

        impDog.add(dog1);
        impDuck.add(duck1);

        Scanner sc = null;
        int mainMenu = 0, secondaryMenu = 0, index = 0;

        do {
            System.out.println("======================= -=- MENÚ =======================");
            System.out.println("===   1.- Agregar nuevo registro");
            System.out.println("===   2.- Mostrar la lista");
            System.out.println("===   3.- Editar");
            System.out.println("===   4.- Buscar un elemento");
            System.out.println("===   5.- Eliminar un elemento");
            System.out.println("===   6.- Contar todos los elementos de la lista ");
            System.out.println("===   7.- Salir del menú ");
            System.out.println("========================================================");
            System.out.println("-> Elige una opción ...");
            sc = new Scanner(System.in);
            mainMenu = sc.nextInt();

            switch (mainMenu) {
                case 1:
                    System.out.println("Selecciona el tipo de objeto que deseas");
                    System.out.println("1- Perro\n2- Gato\n3- Pato");
                    sc = new Scanner(System.in);
                    secondaryMenu = sc.nextInt();

                    System.out.print("-> Introduce el nombre del animal: ");
                    sc = new Scanner(System.in);
                    name = sc.nextLine();

                    System.out.print("-> Introduce  la raza del animal: ");
                    sc = new Scanner(System.in);
                    race = sc.nextLine();

                    System.out.print("-> Introduce  la edad del animal: ");
                    sc = new Scanner(System.in);
                    age = sc.nextInt();

                    System.out.print("-> Introduce el peso del animal: ");
                    sc = new Scanner(System.in);
                    size = sc.nextInt();

                    System.out.print("-> Esta vacunado del animal?: ");
                    sc = new Scanner(System.in);
                    isVaccinated = sc.nextBoolean();

                    if (secondaryMenu == 1) {
                        dogAux = new Dog(name, race, age, size, isVaccinated);
                        impDog.add(dogAux);
                    } else if (secondaryMenu == 2) {
                        catAux = new Cat(name, race, age, size, isVaccinated);
                        impCat.add(catAux);
                    } else if (secondaryMenu == 3) {
                        duckAux = new Duck(name, race, age, size, isVaccinated);
                        impDuck.add(duckAux);
                    } else {
                        System.out.println("Introduce un rango de 1 a 3");
                    }
                    break;

                case 2:
                    impDog.show();
                    impCat.show();
                    impDuck.show();
                    break;

                case 3:

                    System.out.println("Selecciona el tipo de objeto que deseas");
                    System.out.println("1- Perro\n2- Gato\n3- Pato");
                    sc = new Scanner(System.in);
                    secondaryMenu = sc.nextInt();

                    System.out.print("Ingresa un indice para editar: ");
                    sc = new Scanner(System.in);
                    index = sc.nextInt();

                    dogAux = null;
                    catAux = null;
                    duckAux = null;

                    if (secondaryMenu == 1) {
                        dogAux = (Dog) impDog.find(index);
                    } else if (secondaryMenu == 2) {
                        catAux = (Cat) impCat.find(index);
                    } else if (secondaryMenu == 3) {
                        objAux = impDuck.find(index);
                    } else {
                        System.out.println("Introduce un rango de 1 a 3");
                        break;
                    }

                    do {
                        System.out.println("======================= -=- MENÚ =======================");
                        System.out.println("===   1.- Modificar nombre");
                        System.out.println("===   2.- Modificar raza");
                        System.out.println("===   3.- Modificar edad");
                        System.out.println("===   4.- Modificar peso");
                        System.out.println("===   5.- Modificar si esta vacunado");
                        System.out.println("===   6.- Salir del menú ");
                        System.out.println("========================================================");
                        System.out.println("-> Elige una opción ...");
                        sc = new Scanner(System.in);
                        secondaryMenu = sc.nextInt();


                        switch (secondaryMenu) {
                            case 1:
                                System.out.println("-> Modificar nombre");
                                sc = new Scanner(System.in);
                                name = sc.nextLine();
                                if (dogAux != null) {
                                    dogAux.setName(name);
                                } else if (catAux != null) {
                                    catAux.setName(name);
                                } else {
                                    duckAux.setName(name);
                                }
                                System.out.println("Nombre modificado exitosamente");
                                break;
                            case 2:
                                System.out.println("Modificar raza");
                                sc = new Scanner(System.in);
                                race = sc.nextLine();
                                if (dogAux != null) {
                                    dogAux.setRace(race);
                                } else if (catAux != null) {
                                    catAux.setRace(race);
                                } else {
                                    duckAux.setRace(race);
                                }
                                System.out.println("Raza modificada exitosamente");
                                break;
                            case 3:
                                System.out.println("Modificar edad");
                                sc = new Scanner(System.in);
                                age = sc.nextInt();
                                if (dogAux != null) {
                                    dogAux.setAge(age);
                                } else if (catAux != null) {
                                    catAux.setAge(age);
                                } else {
                                    duckAux.setAge(age);
                                }
                                System.out.println("Edad modificada exitosamente");
                                break;
                            case 4:
                                System.out.println("Modificar si esta vacunado");
                                sc = new Scanner(System.in);
                                isVaccinated = sc.nextBoolean();
                                if (dogAux != null) {
                                    dogAux.setVaccinated(isVaccinated);
                                } else if (catAux != null) {
                                    catAux.setVaccinated(isVaccinated);
                                } else {
                                    duckAux.setVaccinated(isVaccinated);
                                }
                                System.out.println("Tipo modificado exitosamente");
                                break;

                            case 5:
                                System.out.println("Modificar tamaño");
                                sc = new Scanner(System.in);
                                size = sc.nextInt();
                                if (dogAux != null) {
                                    dogAux.setSize(size);
                                } else if (catAux != null) {
                                    catAux.setSize(size);
                                } else {
                                    duckAux.setSize(size);
                                }
                                System.out.println("Tamaño modificado exitosamente");
                                break;
                            case 6:
                                System.out.println("Saliendo...");
                                break;
                            default:
                                System.out.println("Introduce una opción valida.");
                                break;
                        }
                    } while (secondaryMenu != 5);
                    break;
            }


        } while (mainMenu != 7);

    }
}
