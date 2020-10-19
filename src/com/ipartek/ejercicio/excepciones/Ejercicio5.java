package com.ipartek.ejercicio.excepciones;

import java.io.IOException;

/**
 * 
 * Realizar un programa que lance un número aleatorio del 1 al 6. Según el
 * número sacado, se lanzara una excepción u otra de la siguiente lista:</br>
 * <ul>
 * <li>1: ArithmeticException</li>
 * <li>2: NullpointerException</li>
 * <li>3: NumberFormatException</li>
 * <li>4: SecurityException</li>
 * <li>5: NegativeArrayException</li>
 * <li>6: IOException</li>
 * </ul>
 * Haciendo uso del try y del catch, mostrar un mensaje por pantalla y explicar
 * cuál es la excepción ocurrida. Repetir este proceso de manera indefinida,
 * controlando dichas excepciones y sin dar pie a que el programa se cuelgue
 * 
 * 
 * @version 1.0
 * @author LANDER
 *
 */

public class Ejercicio5 {

	public static void randomExc() throws ArithmeticException, NullPointerException, NumberFormatException,
			SecurityException, NegativeArraySizeException, IOException {
		int random = (int) Math.floor(Math.random() * 6 + 1);
		switch (random) {
		case 1:
			throw new ArithmeticException("Ha salido 1, se ha creado un ArithmeticException");
		case 2:
			throw new NullPointerException("Ha salido 2, se ha creado un NullPointerException");
		case 3:
			throw new NumberFormatException("Ha salido 3, se ha creado un NumberFormatException");
		case 4:
			throw new SecurityException("Ha salido 4, se ha creado un SecurityException");
		case 5:
			throw new NegativeArraySizeException("Ha salido 5, se ha creado un NegativeArraySizeException");
		case 6:
			throw new IOException("Ha salido 6, se ha creado un IOException");
		}
	}

	public static void main(String[] args) {
		try {
			randomExc();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
