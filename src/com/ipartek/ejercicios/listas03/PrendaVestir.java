package com.ipartek.ejercicios.listas03;

/**
 * Clase para representar una prenda de vestir
 * 
 * @version 1.0
 * @author Lander Corral
 *
 */
public class PrendaVestir {

	private String nombre;
	private int talla;
	private double precio;

	public PrendaVestir() {
		super();
	}

	public PrendaVestir(String nombre, int talla, double precio) {
		super();
		this.nombre = nombre;
		this.talla = talla;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTalla() {
		return talla;
	}

	public void setTalla(int talla) {
		this.talla = talla;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return String.format("%s de la talla %s, %.2f€", this.nombre, this.talla, this.precio);
	}

}
