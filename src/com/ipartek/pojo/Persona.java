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

	private String nombre;
	private int edad;
	private static final int EDAD_MIN = 0;
	private static final int EDAD_MAX = 120;

	public Persona() {
		super();
		this.edad = 0;
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
			throw new Exception("Has introducido una edad incorrecta (debe ser entre 1 y 120)");
		} else {
			this.edad = edad;
		}
	}

}
