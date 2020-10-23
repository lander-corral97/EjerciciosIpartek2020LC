package com.ipartek;

import java.util.Scanner;

/**
 * Los m�todos o funciones son muy usadas en JAVA. <br>
 * Podemos tener, m�todos de clase, m�todos de objetos o instancia e incluso
 * m�todos propios dentro de una clase.<br>
 * <br>
 * Los m�todos se declaran de la siguiente manera: <br>
 * 
 * <pre>
 * <code>
 * CALIFICADORES DE ACCESO - RETORNO - NOMBRE (PAR�METROS) EXCEPCIONES {
 * 
 * 		//C�digo Fuente
 * 		//return es lo que retorna y es obligatorio, a menos que no retorne nada <b>void</b>
 * 
 * }
 * </code>
 * </pre>
 * 
 * @version 1.0
 * @author LANDER
 *
 */
public class MetodosYCalificadores {

	static void saludar() {
		System.out.println("Hola");
	}

	static void saludarConNombre(String nombre) {
		System.out.println("Hola " + nombre);
	}

	static String dimeTuNombre() {
		String res = ""; // Definir el resultado a retornar en una variable
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime tu nombre: ");
		res = sc.nextLine();

		sc.close();

		return res;
	}

	/**
	 * T�pico m�todo main para ejecutar c�digo en JAVA
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		saludar();
		saludarConNombre(dimeTuNombre());
	}

}
