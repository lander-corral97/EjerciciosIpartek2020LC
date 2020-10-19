package com.ipartek.ejercicios.estructurasRepetitivas;

/**
 * Realizar un ejercicio que nos muestre la tabla de multiplicar del 6
 * 
 * @version 1.0
 * @author LANDER
 *
 */

public class Ejercicio1 {

	static final int MULTIPLICADOR = 6;

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			System.out.printf("%sx%s=%s\n", MULTIPLICADOR, i, MULTIPLICADOR * i);
		}
	}

}
