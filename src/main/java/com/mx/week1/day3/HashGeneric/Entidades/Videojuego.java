package com.mx.week1.day3.HashGeneric.Entidades;

public class Videojuego {
	private String nombre; // key
	private String categoria;
	private String company;
	private int estreno;
	private double precio;
	private String clasificacion;

	/**
	 * 
	 */
	public Videojuego() {
	}

	/**
	 * @param nombre
	 */
	public Videojuego(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param nombre
	 * @param categoria
	 * @param company
	 * @param estreno
	 * @param precio
	 * @param clasificacion
	 */
	public Videojuego(String nombre, String categoria, String company, int estreno, double precio,
			String clasificacion) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.company = company;
		this.estreno = estreno;
		this.precio = precio;
		this.clasificacion = clasificacion;
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
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * @return the estreno
	 */
	public int getEstreno() {
		return estreno;
	}

	/**
	 * @param estreno the estreno to set
	 */
	public void setEstreno(int estreno) {
		this.estreno = estreno;
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
	 * @return the clasificacion
	 */
	public String getClasificacion() {
		return clasificacion;
	}

	/**
	 * @param clasificacion the clasificacion to set
	 */
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	@Override
	public String toString() {
		return "Videojuego [nombre=" + nombre + ", categoria=" + categoria + ", company=" + company + ", estreno="
				+ estreno + ", precio=" + precio + ", clasificacion=" + clasificacion + "]";
	}

}
