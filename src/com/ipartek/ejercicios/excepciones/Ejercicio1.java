package com.ipartek.ejercicios.excepciones;

import java.util.Scanner;

/**
 * 
 * Implemente un programa que lea un número ‘a’ y otro número ‘b’ y luego
 * calcule “a/b”. Pruebe a introducir b=0 y ver que hace el programa con la
 * división por cero.<br>
 * Pruebe a introducir b=”Carlos” para ver cómo se comporta el programa. Añada
 * excepciones para recoger estas excepciones y avisar del problema al usuario
 * 
 * @version 1.0
 * @author LANDER
 *
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		float a, b;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Introduce un número");
			a = Float.parseFloat(sc.nextLine());
			System.out.println("Introduce otro número");
			b = Float.parseFloat(sc.nextLine());
			System.out.printf("Sus números elegidos son: %s y %s, ahora los dividimos...\n", a, b);
			System.out.printf("El resultado es %.2f", a / b);
		} catch (NumberFormatException e) {
			System.out.println("Error: No se ha metido un número");
		} catch (ArithmeticException e) {
			System.out.println("Error: Se ha dividido entre cero");
		} catch (Exception e) { // La genérica es siempre la última
			e.printStackTrace();
		}
		sc.close();
	}

}
