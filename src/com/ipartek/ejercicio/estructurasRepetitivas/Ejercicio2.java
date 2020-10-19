package com.ipartek.ejercicio.estructurasRepetitivas;

/**
 * Mostrar con bucles for anidados las tablas de multiplicar del 0 al 10
 * 
 * @version 1.0
 * @author LANDER
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			System.out.printf("--TABLA DEL %s--\n", i);
			for (int j = 0; j <= 10; j++) {
				System.out.printf("%sx%s=%s\n", i, j, i * j);
				;
			}
		}
	}
}
