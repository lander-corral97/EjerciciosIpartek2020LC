package com.ipartek.ejercicio.estructurasRepetitivas;

import java.util.Scanner;

/**
 * 
 * Realizar la modificación pertinente al ejercicio 4 para que una vez que el
 * usuario haya escogido una de las opciones y muestre la operación, desea
 * continuar? Si escoje la opción si volverá a mostrar el menú, si escoge no,
 * saldrá de la ejecución del programa
 * 
 * @version 1.0
 * @author LANDER
 *
 */

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String opt = "";
		Boolean isContinue = true;
		while (isContinue) {
			System.out.println("Introduzca una opción:");
			System.out.println("A. Calcular el área de un cuadrado");
			System.out.println("B. Calcular el área de un triángulo equilátero");
			System.out.println("C. Calcular el perímetro de un círculo");
			System.out.println("D. Calcular el área de un círculo");
			opt = sc.next();
			switch (opt.toUpperCase()) {
			case "A":
				System.out.println("Para el siguiente caso: Lados 5: " + Math.pow(5.0, 2.0));
				break;
			case "B":
				System.out.println("Para el siguiente caso: Base 5 y Altura 2: " + 5 * 2 / 2);
				break;
			case "C":
				System.out.println("Para el siguiente caso: Radio 2: " + Math.PI * Math.pow(2.0, 2.0));
				break;
			case "D":
				System.out.println("Para el siguiente caso: Radio 2: " + 2 * Math.PI * 2.0);
				break;
			}
			System.out.println("¿Quieres continuar? (S/N)");
			if (sc.next().equalsIgnoreCase("N")) {
				isContinue = false;
			}
		}
		sc.close();
	}

}
