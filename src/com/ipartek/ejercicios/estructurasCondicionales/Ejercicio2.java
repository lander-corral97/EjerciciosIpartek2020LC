package com.ipartek.ejercicios.estructurasCondicionales;

import java.util.Scanner;

/**
 * Realiza un programa que pida un numero por consola. En caso de que el numero
 * sea mayor que 50, o menor que 0, indicar que el numero introducido no es
 * valido<br/>
 * Después, cambiar para que, mientras no te den un número en dicho rango, se
 * repita hasta 3 veces
 * 
 * @version 1.0
 * @author LANDER
 *
 */
public class Ejercicio2 {

	static final int NUM_MIN = 0;
	static final int NUM_MAX = 50;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int i = 1;
		System.out.println("Introduzca un número entre 0 y 50");
		num = Integer.parseInt(sc.nextLine());

		while (num > NUM_MAX || num < NUM_MIN) {
			if (i == 3) {
				System.out.println("... 0... 50... En serio, matemáticas, ¿sabes qué es eso?");
				num = Integer.parseInt(sc.nextLine());
			} else {
				i++;
				System.out.println("Introduzca un número entre 0 y 50");
				num = Integer.parseInt(sc.nextLine());
			}
		}
		sc.close();
	}

}
