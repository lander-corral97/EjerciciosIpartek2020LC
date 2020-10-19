package com.ipartek.ejercicios.variablesYoperadores;

/**
 * Realizar un programa que cree una variable de cada uno de los tipos de datos
 * simples que podemos encontrar en el lenguaje de programaci�n Java,
 * asign�ndoles un valor Una vez creadas, se mostraran por pantalla los valores
 * de cada una de ellas De manera adicional, se buscara por internet o otras
 * fuentes, los valores m�ximos y m�nimos que pueden albergar
 * 
 * @author Lander Corral Ruiz
 * @version 1.0
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		byte b = 0; // N�mero de 8 bits [-128,128)
		short s = 0; // N�mero de 16 bits [-32.768,32.767)
		int i = 0; // N�mero de 32 bits [-2.147.483.648,2.147.483.648)
		long l = 0; // N�mero de 64 bits [-9.223.372.036.854.775.808,9.223.372.036.854.775.808)
		float f = 0.0f; // N�mero de 32 bits con coma flotante
		// Cast => float f = (float) 0.0;
		double d = 0.0; // N�mero de 64 bits con coma flotante
		boolean bool = false; // Variable de 1 bit (verdadero o falso)
		char ch = 'a'; // Representa diferentes caracteres

		System.out.println("Byte: " + b + "; Valor m�nimo: " + Byte.MIN_VALUE + ", Valor m�ximo: " + Byte.MAX_VALUE);
		System.out.println("Short: " + s + "; Valor m�nimo: " + Short.MIN_VALUE + ", Valor m�ximo: " + Short.MAX_VALUE);
		System.out
				.println("Int: " + i + "; Valor m�nimo: " + Integer.MIN_VALUE + ", Valor m�ximo: " + Integer.MAX_VALUE);
		System.out.println("Long: " + l + "; Valor m�nimo: " + Long.MIN_VALUE + ", Valor m�ximo: " + Long.MAX_VALUE);
		System.out.println("Float: " + f + "; Valor m�nimo: " + Float.MIN_VALUE + ", Valor m�ximo: " + Float.MAX_VALUE);
		System.out.println(
				"Double: " + d + "; Valor m�nimo: " + Double.MIN_VALUE + ", Valor m�ximo: " + Double.MAX_VALUE);
		System.out.println("Boolean: " + bool + "; Valores: " + Boolean.FALSE + ", " + Boolean.TRUE);
		System.out.println(
				"Char: " + ch + "; Valor m�nimo: " + Character.MIN_VALUE + ", Valor m�ximo: " + Character.MAX_VALUE);
	}

}
