package com.ipartek.ejercicios.excepciones;

import java.util.Scanner;

import com.ipartek.Utilidades;

/**
 * 
 * Realize un programa que nos solicite los n�meros del dni y nos calcule la
 * letra <br>
 * Usar el m�todo de la clase Utilidades<br>
 * Tenemos que capturar la excepci�n que nos lanza la funci�n
 * <b>calcularLetraDni</b>
 * 
 * @version 1.0
 * @author LANDER
 *
 */

public class EjercicioThrows {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime los 8 n�meros de tu dni: ");
		String dniNumeros = sc.nextLine();

		try {
			String dniCompleto = Utilidades.calcularLetraDni(dniNumeros);
			System.out.println("Tu DNI completo es: " + dniCompleto);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}

}
