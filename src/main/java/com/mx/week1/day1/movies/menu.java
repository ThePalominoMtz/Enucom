package com.mx.week1.day1.movies;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class menu {

    static List<Movies> moviesList = new ArrayList<Movies>();

    public static void populateList() {
        Movies movie1 = new Movies("Avengers EndGame", "RussoBrothers", LocalDate.of(2019, 5, 21), 10000);
        Movies movie2 = new Movies("Avengers", "Jhon Whats", LocalDate.of(2010, 7, 16), 50000);
        Movies movie3 = new Movies("Deadpool and Wolverine", "The Real Heroes", LocalDate.of(2024, 8, 24), 80000);
        Movies movie4 = new Movies("Guardians of the Galaxy", "James Gunn", LocalDate.of(2014, 2, 14), 60000);
        Movies movie5 = new Movies("Eternals", "Director Example", LocalDate.of(2022, 6, 29), 20000);
        Movies movie6 = new Movies("Spiderman No Way Home", "Jhonn Whats", LocalDate.of(2023, 6, 21), 50000);
        moviesList.add(movie1);
        moviesList.add(movie2);
        moviesList.add(movie3);
        moviesList.add(movie4);
        moviesList.add(movie5);
        moviesList.add(movie6);
    }

    public static void main(String[] args) {

        populateList();

        // Principal Objects
        Movies movie;
        Scanner sc = null;

        // Local Variables
        String name;
        String director;
        LocalDate date;
        int boxOffice;


        // Control Menu Variables
        int mainMenu = 0, secundaryMenu = 0, index = 0;

        // Start menu
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
                    System.out.println("========================================================");
                    System.out.println("===   OPCIÓN 1 - AGREGAR UN NUEVO ELEMENTO:");

                    System.out.println("-> Escribe el nombre de la pelicula:");
                    sc = new Scanner(System.in);
                    name = sc.nextLine();

                    System.out.println("-> Escribe el nombre del director:");
                    sc = new Scanner(System.in);
                    director = sc.nextLine();

                    System.out.println("-> Escribe la fecha de estreno:");
                    sc = new Scanner(System.in);
                    date = LocalDate.parse(sc.nextLine());

                    System.out.println("-> Escribe la recaudación:");
                    sc = new Scanner(System.in);
                    boxOffice = sc.nextInt();

                    movie = new Movies(name, director, date, boxOffice);

                    // Guard Clause
                    if (moviesList.contains(movie)) {
                        System.out.println("Ya existe la pelicula " + movie.getName() + " en la lista.");
                        System.out.println("Pelicula no agregada.");
                        break;
                    }

                    moviesList.add(movie);
                    System.out.println("Pelicula agregada exitosamente");
                    break;

                case 2:
                    System.out.println("Mostrar todos los elementos de la lista");
                    System.out.println("La información almacenada es:\n" + moviesList);
                    break;

                case 3:
                    System.out.println("Ingresa un indice para editar");
                    sc = new Scanner(System.in);
                    index = sc.nextInt();
                    movie = moviesList.get(index);
                    do {
                        System.out.println("======================= -=- MENÚ =======================");
                        System.out.println("===   1.- Modificar nombre");
                        System.out.println("===   2.- Modificar director");
                        System.out.println("===   3.- Modificar fecha de estreno");
                        System.out.println("===   4.- Modificar recaudación ");
                        System.out.println("===   5.- Salir del menú ");
                        System.out.println("========================================================");
                        System.out.println("-> Elige una opción ...");
                        sc = new Scanner(System.in);
                        secundaryMenu = sc.nextInt();
                        switch (secundaryMenu) {
                            case 1:
                                System.out.println("-> Modificar nombre");
                                sc = new Scanner(System.in);
                                name = sc.nextLine();
                                movie.setName(name);
                                System.out.println("Nombre modificado exitosamente");
                                break;
                            case 2:
                                System.out.println("Modificar director");
                                sc = new Scanner(System.in);
                                director = sc.nextLine();
                                movie.setDirector(director);
                                System.out.println("Director modificado exitosamente");
                                break;
                            case 3:
                                System.out.println("Modificar fecha de estreno");
                                sc = new Scanner(System.in);
                                date = LocalDate.parse(sc.nextLine());
                                movie.setDate(date);
                                System.out.println("Fecha de estreno modificada exitosamente");
                                break;
                            case 4:
                                System.out.println("Modificar recaudación");
                                sc = new Scanner(System.in);
                                boxOffice = sc.nextInt();
                                movie.setBoxOffice(boxOffice);
                                System.out.println("Recaudación modificada exitosamente");
                                break;
                            case 5:
                                System.out.println("Saliendo...");
                                break;
                            default:
                                System.out.println("Introuduce una opción valida.");
                                break;
                        }
                    } while (secundaryMenu != 5);
                    break;

                case 4:
                    do {
                        System.out.println("======================= -=- MENÚ =======================");
                        System.out.println("===   1.- Buscar por indice");
                        System.out.println("===   2.- Buscar por nombre");
                        System.out.println("===   3.- Buscar por director");
                        System.out.println("===   4.- Buscar por fecha de estreno");
                        System.out.println("===   5.- Buscar por recaudación");
                        System.out.println("===   6 .- Salir del menú ");
                        System.out.println("========================================================");
                        System.out.println("-> Elige una opción ...");
                        sc = new Scanner(System.in);
                        secundaryMenu = sc.nextInt();

                        String data;
                        LocalDate dataDate;
                        List<Movies> foundMovies;

                        switch (secundaryMenu) {

                            case 1:
                                System.out.println("Introduce el indice a buscar");
                                sc = new Scanner(System.in);
                                try {
                                    System.out.println(moviesList.get(sc.nextInt()));
                                    System.out.println("Se encontró la siguiente pelicula:");
                                } catch (Exception e) {
                                    System.out.println("Introduce un número valido o dentro del rango.");
                                    System.out.println("Rango: " + (moviesList.size() - 1));
                                }
                                break;

                            case 2:
                                System.out.println("Introduce el nombre a buscar");
                                sc = new Scanner(System.in);
                                data = sc.nextLine();
                                foundMovies = moviesList.stream()
                                        .filter(movies -> data.equals(movies.getName()))
                                        .toList();
                                if (!foundMovies.isEmpty()) {
                                    System.out.println("Peliculas encontradas");
                                    foundMovies.forEach(System.out::println);
                                } else {
                                    System.out.println("No se encontró ninguna pelicula");
                                }
                                break;

                            case 3:
                                System.out.println("Introduce el nombre del director");
                                sc = new Scanner(System.in);
                                data = sc.nextLine();
                                foundMovies = moviesList.stream()
                                        .filter(movies -> data.equals(movies.getDirector()))
                                        .toList();
                                if (!foundMovies.isEmpty()) {
                                    System.out.println("Peliculas encontradas");
                                    foundMovies.forEach(System.out::println);
                                } else {
                                    System.out.println("No se encontró ninguna pelicula");
                                }
                                break;

                            case 4:
                                System.out.println("Introduce la fecha de estreno");
                                sc = new Scanner(System.in);
                                dataDate = LocalDate.parse(sc.nextLine());
                                foundMovies = moviesList.stream()
                                        .filter(movies -> dataDate.equals(movies.getDate()))
                                        .toList();
                                if (!foundMovies.isEmpty()) {
                                    System.out.println("Peliculas encontradas");
                                    foundMovies.forEach(System.out::println);
                                } else {
                                    System.out.println("No se encontró ninguna pelicula");
                                }
                                break;

                            case 5:
                                System.out.println("Introduce la recaudacion");
                                sc = new Scanner(System.in);
                                dataDate = LocalDate.parse(sc.nextLine());
                                foundMovies = moviesList.stream()
                                        .filter(movies -> dataDate.equals(movies.getDate()))
                                        .toList();

                                if (!foundMovies.isEmpty()) {
                                    System.out.println("Peliculas encontradas");
                                    foundMovies.forEach(System.out::println);
                                } else {
                                    System.out.println("No se encontró ninguna pelicula");
                                }
                                break;

                            default:
                                System.out.println("Lalaaa");
                                break;
                        }
                    } while (secundaryMenu != 6);
                    break;

                case 5:
                    do {
                        System.out.println("======================= -=- MENÚ =======================");
                        System.out.println("===   1.- Remover por nombre");
                        System.out.println("===   2.- Remover por director");
                        System.out.println("===   3.- Remover por fecha de estreno");
                        System.out.println("===   4.- Remover por recaudación");
                        System.out.println("===   5.- Remover todas las peliculas");
                        System.out.println("===   6.- Salir del menú ");
                        System.out.println("========================================================");
                        System.out.println("-> Elige una opción ...");
                        sc = new Scanner(System.in);
                        secundaryMenu = sc.nextInt();

                        String data;
                        int initialSize;


                        switch (secundaryMenu) {
                            case 1:
                                System.out.println("Introduce el nombre");
                                sc = new Scanner(System.in);
                                data = sc.nextLine();

                                initialSize = moviesList.size();
                                moviesList.removeIf(a -> data.equals(a.getName()));

                                if (initialSize == moviesList.size()) {
                                    System.out.println("No se encontró ninguna película con el nombre proporcionado.");
                                } else {
                                    System.out.println("Película eliminada correctamente.");
                                }
                                break;

                            case 2:
                                System.out.println("Introduce el director");
                                sc = new Scanner(System.in);
                                data = sc.nextLine();
                                initialSize = moviesList.size();
                                moviesList.removeIf(a -> data.equals(a.getDirector()));
                                if (initialSize == moviesList.size()) {
                                    System.out.println("No se encontró ninguna película con el nombre proporcionado.");
                                } else {
                                    System.out.println("Película eliminada correctamente.");
                                }
                                break;

                            case 5:
                                moviesList.clear();
                                System.out.println("Todas las peliculas eliminadas correctamente");
                                break;
                            default:
                                System.out.println("Introduce un valor valido");
                                break;
                        }
                    } while (secundaryMenu != 6);
                    break;

                case 6:
                    System.out.println("La cantidad total de elementos actuales en la lista es de: " + moviesList.size());
            }
        } while (mainMenu != 7);
    }
}
