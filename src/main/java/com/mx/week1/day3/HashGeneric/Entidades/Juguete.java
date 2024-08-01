package com.mx.week1.day3.HashGeneric.Entidades;

public class Juguete {
	private String sku; // Key
	private String nombre; // 
	private String edades;
	private double precio;
	private String fabricante;
	private String tipo;
	private String colo;
	/**
	 * @param sku
	 * @param nombre
	 * @param edades
	 * @param precio
	 * @param fabricante
	 * @param tipo
	 * @param colo
	 */
	public Juguete(String sku, String nombre, String edades, double precio, String fabricante, String tipo,
			String colo) {
		this.sku = sku;
		this.nombre = nombre;
		this.edades = edades;
		this.precio = precio;
		this.fabricante = fabricante;
		this.tipo = tipo;
		this.colo = colo;
	}
	/**
	 * @param sku
	 */
	public Juguete(String sku) {
		this.sku = sku;
	}
	/**
	 * 
	 */
	public Juguete() {
	}
	/**
	 * @return the sku
	 */
	public String getSku() {
		return sku;
	}
	/**
	 * @param sku the sku to set
	 */
	public void setSku(String sku) {
		this.sku = sku;
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
	 * @return the edades
	 */
	public String getEdades() {
		return edades;
	}
	/**
	 * @param edades the edades to set
	 */
	public void setEdades(String edades) {
		this.edades = edades;
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
	 * @return the fabricante
	 */
	public String getFabricante() {
		return fabricante;
	}
	/**
	 * @param fabricante the fabricante to set
	 */
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the colo
	 */
	public String getColo() {
		return colo;
	}
	/**
	 * @param colo the colo to set
	 */
	public void setColo(String colo) {
		this.colo = colo;
	}
	@Override
	public String toString() {
		return "Juguete [sku=" + sku + ", nombre=" + nombre + ", edades=" + edades + ", precio=" + precio
				+ ", fabricante=" + fabricante + ", tipo=" + tipo + ", colo=" + colo + "]\n";
	}
	
	
	
	
}
