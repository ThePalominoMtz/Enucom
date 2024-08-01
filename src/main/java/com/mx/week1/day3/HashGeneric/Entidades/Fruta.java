package com.mx.week1.day3.HashGeneric.Entidades;

public class Fruta {

	private String nombre; // key
	private String color;
	private double precio;
	private double peso;
	private String temporada;

	/**
	 * @param nombre
	 * @param color
	 * @param precio
	 * @param peso
	 * @param temporada
	 */
	public Fruta(String nombre, String color, double precio, double peso, String temporada) {
		this.nombre = nombre;
		this.color = color;
		this.precio = precio;
		this.peso = peso;
		this.temporada = temporada;
	}

	/**
	 * 
	 */
	public Fruta() {
	}

	/**
	 * @param nombre
	 */
	public Fruta(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * @return the temporada
	 */
	public String getTemporada() {
		return temporada;
	}

	/**
	 * @param temporada the temporada to set
	 */
	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	@Override
	public String toString() {
		return "Fruta [nombre=" + nombre + ", color=" + color + ", precio=" + precio + ", peso=" + peso + ", temporada="
				+ temporada + "]\n";
	}

}
