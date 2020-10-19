package com.ipartek;

/**
 * Es un ejercicio para aprender a declarar variables en JAVA
 * 
 * @author Lander Corral Ruiz
 * @version 1.0
 *
 */
public class Prueba {

	// Comentario de línea
	
	/*
	 * Comentario de bloque
	 */
	
	/**
	 * Comentario de documentación
	 * @param args
	 */
	
	public static void main(String[] args) {
		String nombre = "Lander";
		int edad = 23;
		float sueldo = 6521.99f;
		float sueldo2 = (float)6521.99;
		char sexo = 'v';
		boolean isCovidAffected = false;
		
		System.out.println("Hola " + nombre);
		System.out.println("Mi edad es " + edad + " años");
		System.out.println("Mi sueldo es " + sueldo + "€");
		
		switch (sexo) {
			// ¡IMPORTANTE! Siempre hay que poner un break.
			case 'v':
				System.out.println("Eres Varón");
				break;
			case 'm':
				System.out.println("Eres Mujer");
				break;
			default: // Si no entra por ninguno de los casos, va a default
				System.out.println("** No sabemos lo que eres");
				break;
		}
		
		if (isCovidAffected) {
			System.out.println("** Tienes que hacerte un PCR.");
		} else {
			System.out.println("Estás sano");
		}
	}
}
