package com.ipartek.ejercicios.estructurasCondicionales;

import java.util.Scanner;

/**
 * 
 * 
 * Mostrar al usuario el siguiente men�:<br/>
 * Por favor escoja una opci�n:<br/>
 * <ul>
 * <li>A: calcular �rea de un triangulo</li>
 * <li>B: calcular el �rea de un cuadrado</li>
 * <li>C: calcular el �rea de un circulo</li>
 * <li>D: calcular el �rea de un pent�gono</li>
 * </ul>
 * Realizad las operaciones adecuadas indicadas en cada categor�a. En caso de
 * que no se escoja una opci�n adecuada, se mostrara un mensaje de error. <br/>
 * No deber� realizarse este men� en bucle
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
		System.out.println("Por favor escoja una opci�n: ");
		System.out.println("A: calcular �rea de un tri�ngulo");
		System.out.println("B: calcular el �rea de un cuadrado");
		System.out.println("C: calcular el �rea de un c�rculo");
		System.out.println("D: calcular el �rea de un pent�gono");
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
			System.out.println("Error: Opci�n incorrecta");
			break;
		}
		sc.close();
	}

}
