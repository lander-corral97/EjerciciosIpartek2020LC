package com.ipartek.ejercicios.estructurasRepetitivas;

import java.util.Scanner;

/**
 * 
 * Realizar el siguiente menú:<br>
 * Introduzca una opción:<br>
 * A. Calcular el área de un cuadrado<br>
 * B. Calcular el área de un triángulo equilátero<br>
 * C. Calcular el perímetro de un circulo<br>
 * D. Calcular el área de un circulo<br>
 * Hacer que se repita este menú de manera indefinida
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
			System.out.println("Introduzca una opción:");
			System.out.println("A. Calcular el área de un cuadrado");
			System.out.println("B. Calcular el área de un triángulo equilátero");
			System.out.println("C. Calcular el perímetro de un círculo");
			System.out.println("D. Calcular el área de un círculo");
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
				System.out.println("Error: Opción incorrecta");
			}
		}
	}
}
