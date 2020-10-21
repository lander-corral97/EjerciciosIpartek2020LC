package com.ipartek.ejercicios.excepciones;

import java.util.Scanner;

/**
 * 
 * Implemente un programa que lea un n�mero �a� y otro n�mero �b� y luego
 * calcule �a/b�. Pruebe a introducir b=0 y ver que hace el programa con la
 * divisi�n por cero.<br>
 * Pruebe a introducir b=�Carlos� para ver c�mo se comporta el programa. A�ada
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
			System.out.println("Introduce un n�mero");
			a = Float.parseFloat(sc.nextLine());
			System.out.println("Introduce otro n�mero");
			b = Float.parseFloat(sc.nextLine());
			System.out.printf("Sus n�meros elegidos son: %s y %s, ahora los dividimos...\n", a, b);
			System.out.printf("El resultado es %.2f", a / b);
		} catch (NumberFormatException e) {
			System.out.println("Error: No se ha metido un n�mero");
		} catch (ArithmeticException e) {
			System.out.println("Error: Se ha dividido entre cero");
		} catch (Exception e) { // La gen�rica es siempre la �ltima
			e.printStackTrace();
		}
		sc.close();
	}

}
