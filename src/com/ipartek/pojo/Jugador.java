package com.ipartek.pojo;

/**
 * 
 * Jugadores de fútbol para el ejercicio 2 de listas.
 * 
 * Tienen como campos:
 * <ul>
 * <li>Nombre: <code>String</code></li>
 * <li>Dorsal: <code>int</code></li>
 * </ul>
 * 
 * @version 1.0
 * @author LANDER
 *
 */

public class Jugador {

	private String nombre;
	private int dorsal;

	public Jugador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", dorsal=" + dorsal + "]";
	}

}
