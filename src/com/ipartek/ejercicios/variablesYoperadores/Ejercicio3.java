package com.ipartek.ejercicios.variablesYoperadores;

/**
 * Realizar un programa que tenga 2 variables enteras, dividendo y divisor.
 * Meterle valores enteros y positivos. Realizar la operación división y mostrar
 * el resultado en pantalla<br>
 * Repetir el mismo código con estas variaciones: entero y real, real y entero,
 * real y real<br>
 * Por ultimo, intentar dividir en los cuatro casos anteriores entre 0 y mostrar
 * el resultado en pantalla
 * 
 * @version 1.0
 * @author LANDER
 *
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		int dividendo1 = 15;
		int divisor1 = 5;
		System.out.println(dividendo1 + "/" + divisor1 + "=" + dividendo1 / divisor1);

		int dividendo2 = 15;
		float divisor2 = 5.0f;
		System.out.println(dividendo2 + "/" + divisor2 + "=" + dividendo2 / divisor2);

		float dividendo3 = 15.0f;
		int divisor3 = 5;
		System.out.println(dividendo3 + "/" + divisor3 + "=" + dividendo3 / divisor3);

		float dividendo4 = 15.0f;
		float divisor4 = 5.0f;
		System.out.println(dividendo4 + "/" + divisor4 + "=" + dividendo4 / divisor4);

	}

}
