package com.ipartek.ejercicios.variablesYoperadores;

/**
 * Realizar un programa que realice la siguiente operación: crear tres variables
 * de tipo Byte, llamadas num1, num2, resultado. Asignar los valores 255 y 223.
 * Sumarlas y guardarlo en resultado. Comprueba si el resultado da 478. Si no lo
 * da, buscar una solución al problema para solucionarlo
 *
 * @version 1.0
 * @author LANDER
 *
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		byte num1 = (byte) 255;
		byte num2 = (byte) 223;
		byte resultado = 0;

		resultado = (byte) (num1 + num2);
		System.out.println("El resultado es: " + resultado);
		System.out.println(resultado == 478 ? ""
				: "PROBLEMA: los dos números que se suman dan más de 128 (al igual que los propios números), que es el valor máximo para los bytes.");

		// SOLUCIÓN: Pasar los datos a, como mínimo, short

		short num1Sol = 255;
		short num2Sol = 223;
		short resultadoSol = 0;

		resultadoSol = (short) (num1Sol + num2Sol);
		System.out.println("El resultado es: " + resultadoSol);
	}

}
