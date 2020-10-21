package com.ipartek.ejercicios.estructurasCondicionales;

/**
 * Realizar un programa que realice la siguiente funcionalidad<br>
 * Se crearan 5 variables enteras con los nombres a, b, c, d y e con los valores
 * 6, 8, 0, 8 y 9
 * <ul>
 * <li>Comparar las variables a y c, indicar por consola cual es mayor</li>
 * <li>Indicar cual de las variables es la que tiene menor valor y la de mayor
 * valor</li>
 * <li>Compara las variables b y d y comprueba si son iguales</li>
 * <li>Comprobar si se puede realizar la división de a/c si no se puede realizar
 * indicarlo, en caso contrario realizar la división</li>
 * </ul>
 * 
 * @version 1.0
 * @author LANDER
 *
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		int a = 6;
		int b = 8;
		int c = 0;
		int d = 8;
		int e = 9;

		if (a > c) {
			System.out.println("A es mayor que C");
		}

		int mayorV = 0;
		char mayor = ' ';
		if (mayorV < a) {
			mayorV = a;
			mayor = 'a';
		}
		if (mayorV < b) {
			mayorV = b;
			mayor = 'b';
		}
		if (mayorV < c) {
			mayorV = c;
			mayor = 'c';
		}
		if (mayorV < d) {
			mayorV = d;
			mayor = 'd';
		}
		if (mayorV < e) {
			mayorV = e;
			mayor = 'e';
		}
		System.out.println("El mayor número es el " + (mayor + "").toUpperCase());

		if (b == d) {
			System.out.println("B y D son iguales");
		}

		int division;
		try {
			division = a / c;
			System.out.println("A entre C es " + division);
		} catch (Exception ex) {
			System.out.println("No se puede dividir entre 0");
		}
	}

}
