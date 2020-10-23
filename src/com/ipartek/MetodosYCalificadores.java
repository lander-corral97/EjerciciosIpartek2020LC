package com.ipartek;

import java.util.Scanner;

/**
 * Los métodos o funciones son muy usadas en JAVA. <br>
 * Podemos tener, métodos de clase, métodos de objetos o instancia e incluso
 * métodos propios dentro de una clase.<br>
 * <br>
 * Los métodos se declaran de la siguiente manera: <br>
 * 
 * <pre>
 * <code>
 * CALIFICADORES DE ACCESO - RETORNO - NOMBRE (PARÁMETROS) EXCEPCIONES {
 * 
 * 		//Código Fuente
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
	 * Típico método main para ejecutar código en JAVA
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		saludar();
		saludarConNombre(dimeTuNombre());
	}

}
