package com.ipartek.ejercicios.estructurasRepetitivas;

import java.util.Scanner;

/**
 * 
 * Realizar el siguiente men�:<br>
 * Introduzca una opci�n:<br>
 * A. Calcular el �rea de un cuadrado<br>
 * B. Calcular el �rea de un tri�ngulo equil�tero<br>
 * C. Calcular el per�metro de un circulo<br>
 * D. Calcular el �rea de un circulo<br>
 * Hacer que se repita este men� de manera indefinida
 * 
 * 
 * @version 1.0
 * @author LANDER
 *
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String opt = "";
		while (true) {
			System.out.println("Introduzca una opci�n:");
			System.out.println("A. Calcular el �rea de un cuadrado");
			System.out.println("B. Calcular el �rea de un tri�ngulo equil�tero");
			System.out.println("C. Calcular el per�metro de un c�rculo");
			System.out.println("D. Calcular el �rea de un c�rculo");
			opt = sc.next();
			switch (opt.toUpperCase()) {
			case "A":
				System.out.printf("Para el siguiente caso: Lados 5: %s", Math.pow(5.0, 2.0));
				break;
			case "B":
				System.out.printf("Para el siguiente caso: Base 5 y Altura 2: %s", 5 * 2 / 2);
				break;
			case "C":
				System.out.printf("Para el siguiente caso: Radio 2: %s", Math.PI * Math.pow(2.0, 2.0));
				break;
			case "D":
				System.out.printf("Para el siguiente caso: Radio 2: %s", 2 * Math.PI * 2.0);
				break;
			default:
				System.out.println("Error: Opci�n incorrecta");
			}
		}
	}
}
