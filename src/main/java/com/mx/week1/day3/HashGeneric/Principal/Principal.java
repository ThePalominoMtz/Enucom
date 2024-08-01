package com.mx.week1.day3.HashGeneric.Principal;

import com.mx.week1.day3.HashGeneric.Entidades.Fruta;
import com.mx.week1.day3.HashGeneric.Implements.ImpFruta;
import com.mx.week1.day3.HashGeneric.Implements.ImpFruta2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		Fruta fruta1 = new Fruta("1", "Amarillo", 40, 3, "Verano");
		Fruta fruta2 = new Fruta("2", "Amarillo", 20, 4, "Primavera");
		Fruta fruta3 = new Fruta("3", "Verde", 60, 2, "Primavera");
		Fruta fruta4 = new Fruta("4", "Naranja", 30, 2, "Verano");
		Fruta fruta5 = new Fruta("Pera", "Verde", 30, 2, "verano");
		Fruta fruta6 = new Fruta("Manzana", "Roja", 12, 3, "Verano");
		Fruta fruta7 = new Fruta("Ciruela", "Roja", 10, 2, "Primavera");
		Fruta fruta8 = new Fruta("Manzana", "Roja", 12, 3, "Verano");
		Fruta fruta9 = new Fruta("Ciruela", "Roja", 10, 2, "Primavera");

		// Implementacion
		// HashMap
		Fruta fruta = null;
		ImpFruta impF = new ImpFruta();

		// Listas
		Fruta frut = null;
		ImpFruta2 impF2 = new ImpFruta2();

		// Guardar
		// Con HashMap
		impF.guardar(fruta1.getNombre(), fruta1);
		impF.guardar(fruta2.getNombre(), fruta2);
		impF.guardar(fruta3.getNombre(), fruta3);
		impF.guardar(fruta4.getNombre(), fruta4);
		impF.guardar(fruta5.getNombre(), fruta5);
		impF.guardar(fruta6.getNombre(), fruta6);
		impF.guardar(fruta7.getNombre(), fruta7);
		impF.guardar(fruta8.getNombre(), fruta8);
		impF.guardar(fruta9.getNombre(), fruta9);

		// Con listas
		impF2.guardar(fruta1);
		impF2.guardar(fruta2);
		impF2.guardar(fruta3);

		// Mostrar
		System.out.println("Mostrando con HashMap");
		impF.mostrar();
		System.out.println();
		System.out.println("Mostrando con Lista");
		impF2.mostrar();

		// Buscar
		// Con HashMap
		fruta = (Fruta) impF.buscar(fruta6.getNombre());
		System.out.println("Encontrada:  " + fruta);

		// Con Listas
		frut = (Fruta) impF2.buscar(fruta2.getNombre());
		System.out.println("Encontrada:  " + frut);

		// Editar
		// Con HashMap
		fruta = (Fruta) impF.buscar(fruta3.getNombre());
		fruta.setColor("cafe");
		impF.editar(fruta3.getNombre(), fruta);
		System.out.println("Fruta Actualizada con HashMap!");
		impF.mostrar();

		// Con listas
		frut = (Fruta) impF2.buscar(fruta2.getNombre());
		frut.setColor("cafe");
		impF.editar(fruta2.getNombre(), frut);
		System.out.println("Fruta Actualizada con listas!");
		impF.mostrar();

		// Eliminar
		// ConHashMap
		fruta = (Fruta) impF.buscar(fruta7.getNombre());
		impF.eliminar(fruta.getNombre());

		System.out.println("La fruta: " + fruta.getNombre() + " fue eliminada");
		impF.mostrar();

		// Con listas
		frut = (Fruta) impF.buscar(fruta1.getNombre());
		impF2.eliminar(frut.getNombre());

		System.out.println("La fruta: " + frut.getNombre() + " fue eliminada");
		impF2.mostrar();

		// Contar
		System.out.println("HashMap");
		impF.contar();
		System.out.println();
		System.out.println("Listas");
		impF2.contar();
		
	}

}
