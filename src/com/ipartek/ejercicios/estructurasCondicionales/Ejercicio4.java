package com.ipartek.ejercicios.estructurasCondicionales;

import java.util.Scanner;

/**
 * 
 * 
 * Mostrar al usuario el siguiente menú:<br/>
 * Por favor escoja una opción:<br/>
 * <ul>
 * <li>A: calcular área de un triangulo</li>
 * <li>B: calcular el área de un cuadrado</li>
 * <li>C: calcular el área de un circulo</li>
 * <li>D: calcular el área de un pentágono</li>
 * </ul>
 * Realizad las operaciones adecuadas indicadas en cada categoría. En caso de
 * que no se escoja una opción adecuada, se mostrara un mensaje de error. <br/>
 * No deberá realizarse este menú en bucle
 * 
 * 
 * @version 1.0
 * @author LANDER
 *
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String opt = "";
		System.out.println("Por favor escoja una opción: ");
		System.out.println("A: calcular área de un triángulo");
		System.out.println("B: calcular el área de un cuadrado");
		System.out.println("C: calcular el área de un círculo");
		System.out.println("D: calcular el área de un pentágono");
		opt = sc.next();
		switch (opt.toUpperCase()) {
		case "A":
			System.out.printf("Para el siguiente caso: Base 5 y Altura 2: %s", 5 * 2 / 2);
			break;
		case "B":
			System.out.printf("Para el siguiente caso: Lados 5: %s", Math.pow(5.0, 2.0));
			break;
		case "C":
			System.out.printf("Para el siguiente caso: Radio 2: %s", Math.PI * Math.pow(2.0, 2.0));
			break;
		case "D":
			System.out.printf("Para el siguiente caso: Lados 5 y Apotema 2: %s", 5 * 5 * 2 / 2);
			break;
		default:
			System.out.println("Error: Opción incorrecta");
			break;
		}
		sc.close();
	}

}
