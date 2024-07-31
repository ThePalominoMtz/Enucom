package com.mx.week1.day2.videogame;

import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        String name;
        String type;
        double price;
        String developer;
        String origin;


        // Videogame Objects
        Videogame game1 = new Videogame("The Legend of Zelda", "Adventure", 59.99, "Nintendo", "Japan");
        Videogame game2 = new Videogame("Call of Duty", "Shooter", 69.99, "Activision", "USA");
        Videogame game4 = new Videogame("Animal Crossing: New Horizons", "Simulation", 59.99, "Nintendo", "Japan");
        Videogame game3 = new Videogame("Minecraft", "Sandbox", 26.95, "Mojang", "Sweden");
        Videogame game5 = new Videogame("The Witcher 3", "RPG", 39.99, "CD Projekt Red", "Poland");
        Videogame game6 = new Videogame("Fortnite", "Battle Royale", 0.0, "Epic Games", "USA");
        Videogame game7 = new Videogame("Assassin's Creed Valhalla", "Action-Adventure", 59.99, "Ubisoft", "France");
        Videogame game8 = new Videogame("Overwatch", "First-Person Shooter", 39.99, "Blizzard Entertainment", "USA");
        Videogame game9 = new Videogame("Cyberpunk 2077", "RPG", 59.99, "CD Projekt Red", "Poland");

        // Auxiliar
        Videogame videogameAux = null;
        Implementation imp = new Implementation();

        // Add data into videogameList
        imp.save(game1);
        imp.save(game2);
        imp.save(game3);
        imp.save(game4);
        imp.save(game5);
        imp.save(game6);
        imp.save(game7);
        imp.save(game8);
        imp.save(game9);

        // Show
        imp.show();
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

            outerSwitch:
            switch (mainMenu) {
                case 1:
                    System.out.print("-> Introduce el nombre del videojuego: ");
                    sc = new Scanner(System.in);
                    name = sc.nextLine();

                    // Guard Clause
                    for (Videogame videogame : imp.videogameList) {
                        if (videogame.getName().equalsIgnoreCase(name)) {
                            System.out.println("Ese videojuego ya existe");
                            break outerSwitch;
                        }
                    }

                    System.out.print("-> Tipo:");
                    sc = new Scanner(System.in);
                    type = sc.nextLine();

                    System.out.print("-> Precio:");
                    sc = new Scanner(System.in);
                    price = sc.nextInt();

                    System.out.print("-> Desarrollador:");
                    sc = new Scanner(System.in);
                    developer = sc.nextLine();

                    System.out.print("-> Origin:");
                    sc = new Scanner(System.in);
                    origin = sc.nextLine();

                    videogameAux = new Videogame(name, type, price, developer, origin);
                    imp.save(videogameAux);
                    System.out.print("-> Videojuego agregado exitosamente");
                    break;

                case 2:
                    imp.show();
                    break;

                case 3:
                    System.out.println("Ingresa un indice para editar");
                    sc = new Scanner(System.in);
                    index = sc.nextInt();
                    videogameAux = imp.videogameList.get(index);
                    do {
                        System.out.println("======================= -=- MENÚ =======================");
                        System.out.println("===   1.- Modificar nombre");
                        System.out.println("===   2.- Modificar desarrollador");
                        System.out.println("===   3.- Modificar origen");
                        System.out.println("===   4.- Modificar tipo");
                        System.out.println("===   5.- Modificar precio");
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
                                videogameAux.setName(name);
                                System.out.println("Nombre modificado exitosamente");
                                break;
                            case 2:
                                System.out.println("Modificar desarrollador");
                                sc = new Scanner(System.in);
                                developer = sc.nextLine();
                                videogameAux.setDeveloper(developer);
                                System.out.println("Desarrollador modificado exitosamente");
                                break;
                            case 3:
                                System.out.println("Modificar origen");
                                sc = new Scanner(System.in);
                                origin = sc.nextLine();
                                videogameAux.setOrigin(origin);
                                System.out.println("Origen modificado exitosamente");
                                break;
                            case 4:
                                System.out.println("Modificar tipo");
                                sc = new Scanner(System.in);
                                type = sc.nextLine();
                                videogameAux.setType(type);
                                System.out.println("Tipo modificado exitosamente");
                                break;

                            case 5:
                                System.out.println("Modificar precio");
                                sc = new Scanner(System.in);
                                price = sc.nextInt();
                                videogameAux.setPrice(price);
                                System.out.println("Precio modificado exitosamente");
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
                case 4:
                    do {
                        System.out.println("======================= -=- MENÚ =======================");
                        System.out.println("===   1.- Buscar por indice");
                        System.out.println("===   2.- Buscar por nombre");
                        System.out.println("===   3.- Buscar por tipo");
                        System.out.println("===   4.- Buscar por fecha de estreno");
                        System.out.println("===   5.- Buscar por recaudación");
                        System.out.println("===   6 .- Salir del menú ");
                        System.out.println("========================================================");
                        System.out.println("-> Elige una opción ...");
                        sc = new Scanner(System.in);
                        secondaryMenu = sc.nextInt();

                        String data;
                        List<Videogame> foundVideogames;

                        switch (secondaryMenu) {

                            case 1:
                                System.out.println("Introduce el indice a buscar");
                                sc = new Scanner(System.in);
                                try {
                                    System.out.println(imp.videogameList.get(sc.nextInt()));
                                    System.out.println("Se encontró el siguiente videojuego:");
                                } catch (Exception e) {
                                    System.out.println("Introduce un número valido o dentro del rango.");
                                    System.out.println("Rango: " + (imp.videogameList.size() - 1));
                                }
                                break;

                            case 2:
                                System.out.println("Introduce el nombre a buscar");
                                sc = new Scanner(System.in);
                                data = sc.nextLine();
                                foundVideogames = imp.videogameList.stream()
                                        .filter(movies -> data.equals(movies.getName()))
                                        .toList();
                                if (!foundVideogames.isEmpty()) {
                                    System.out.println("Videojuegos encontrados:");
                                    foundVideogames.forEach(System.out::println);
                                } else {
                                    System.out.println("No se encontró ningun videojuego");
                                }
                                break;

                            case 3:
                                System.out.println("Introduce el nombre del desarrollador");
                                sc = new Scanner(System.in);
                                data = sc.nextLine();
                                foundVideogames = imp.videogameList.stream()
                                        .filter(movies -> data.equals(movies.getDeveloper()))
                                        .toList();
                                if (!foundVideogames.isEmpty()) {
                                    System.out.println("Videojuegos encontrados:");
                                    foundVideogames.forEach(System.out::println);
                                } else {
                                    System.out.println("No se encontró ningun videojuego");
                                }
                                break;

                            case 4:
                                System.out.println("Introduce el tipo");
                                sc = new Scanner(System.in);
                                data = sc.nextLine();
                                foundVideogames = imp.videogameList.stream()
                                        .filter(movies -> data.equals(movies.getType()))
                                        .toList();
                                if (!foundVideogames.isEmpty()) {
                                    System.out.println("Videojuegos encontrados:");
                                    foundVideogames.forEach(System.out::println);
                                } else {
                                    System.out.println("No se encontró ningun videojuego");
                                }
                                break;

                            case 5:
                                System.out.println("Introduce el origen");
                                sc = new Scanner(System.in);
                                data = sc.nextLine();
                                foundVideogames = imp.videogameList.stream()
                                        .filter(movies -> data.equals(movies.getOrigin()))
                                        .toList();

                                if (!foundVideogames.isEmpty()) {
                                    System.out.println("Videojuegos encontrados:");
                                    foundVideogames.forEach(System.out::println);
                                } else {
                                    System.out.println("No se encontró ningun videojuego");
                                }
                                break;

                            default:
                                System.out.println("Lalaaa");
                                break;
                        }
                    } while (secondaryMenu != 6);
                    break;

                case 5:
                    do {
                        System.out.println("======================= -=- MENÚ =======================");
                        System.out.println("===   1.- Remover por nombre");
                        System.out.println("===   2.- Remover por desarrollador");
                        System.out.println("===   3.- Remover por tipo");
                        System.out.println("===   4.- Remover por precio");
                        System.out.println("===   5.- Remover todos los videojuegos");
                        System.out.println("===   6.- Salir del menú ");
                        System.out.println("========================================================");
                        System.out.println("-> Elige una opción ...");
                        sc = new Scanner(System.in);
                        secondaryMenu = sc.nextInt();

                        String data;
                        int initialSize;

                        switch (secondaryMenu) {
                            case 1:
                                System.out.println("Introduce el nombre del videojuego");
                                sc = new Scanner(System.in);
                                data = sc.nextLine();

                                initialSize = imp.videogameList.size();
                                imp.videogameList.removeIf(a -> data.equals(a.getName()));

                                if (initialSize == imp.videogameList.size()) {
                                    System.out.println("No se encontró ningun videojuego con el nombre proporcionado.");
                                } else {
                                    System.out.println("Videojuego eliminado correctamente.");
                                }
                                break;

                            case 2:
                                System.out.println("Introduce el desarrollador:");
                                sc = new Scanner(System.in);
                                data = sc.nextLine();

                                initialSize = imp.videogameList.size();
                                imp.videogameList.removeIf(a -> data.equals(a.getDeveloper()));

                                if (initialSize == imp.videogameList.size()) {
                                    System.out.println("No se encontró ningun videojuego con el nombre proporcionado.");
                                } else {
                                    System.out.println("Videojuego eliminado correctamente.");
                                }
                                break;

                            case 5:
                                imp.videogameList.clear();
                                System.out.println("Todas las peliculas eliminadas correctamente");
                                break;
                            default:
                                System.out.println("Introduce un valor valido");
                                break;
                        }
                    } while (secondaryMenu != 6);
                    break;

                case 6:
                    imp.countRegisters();
                    break;
                default:
                    System.out.println("Introduce un numero valido dentro de las opciones del menu");
                    break;
            }

        } while (mainMenu != 7);

    }
}
