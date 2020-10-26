package com.ipartek.pojo;

/**
 * Clase para representar un electrodoméstico<br>
 * Tendrá como atributos:
 * <ul>
 * <li>nombre: <code>String</code></li>
 * <li>precio: <code>float</code></li>
 * </ul>
 * 
 * @version 1.0
 * @author LANDER
 *
 */
public class Electrodomestico {

	private String nombre;
	private float precio;

	public Electrodomestico() {
		super();
		this.nombre = "";
		this.precio = 0f;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Electrodomestico [nombre=" + nombre + ", precio=" + precio + "]";
	}

}
