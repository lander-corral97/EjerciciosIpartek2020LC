package com.ipartek;

/**
 * Es un ejercicio para aprender a declarar variables en JAVA
 * 
 * @author Lander Corral Ruiz
 * @version 1.0
 *
 */
public class Prueba {

	// Comentario de l�nea
	
	/*
	 * Comentario de bloque
	 */
	
	/**
	 * Comentario de documentaci�n
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
		System.out.println("Mi edad es " + edad + " a�os");
		System.out.println("Mi sueldo es " + sueldo + "�");
		
		switch (sexo) {
			// �IMPORTANTE! Siempre hay que poner un break.
			case 'v':
				System.out.println("Eres Var�n");
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
			System.out.println("Est�s sano");
		}
	}
}
