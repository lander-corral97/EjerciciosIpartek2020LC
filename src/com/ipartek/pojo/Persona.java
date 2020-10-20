package com.ipartek.pojo;

/**
 * 
 * Clase para representar una persona
 * 
 * @version 1.0
 * @author LANDER
 *
 */

public class Persona {

	private static final int EDAD_MIN = 0;
	private static final int EDAD_MAX = 120;

	private String nombre;
	private int edad;

	public Persona() {
		super();
		this.edad = EDAD_MIN;
		this.nombre = "";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws Exception {
		if (edad < EDAD_MIN || edad > EDAD_MAX) {
			throw new Exception(
					String.format("Has introducido una edad incorrecta (debe ser entre %s y %s)", EDAD_MIN, EDAD_MAX));
		} else {
			this.edad = edad;
		}
	}

	// Muestra los datos del objeto en forma de String
	// Se llama directamente
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
}
