package com.ipartek;

import java.util.Scanner;

/**
 * Prueba de excepciones
 * 
 * @version 1.0
 * @author LANDER
 *
 */
public class PruebaExcepciones {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un n�mero");
		try {
			int num = Integer.parseInt(sc.nextLine());
			// Si el parseo falla, esta l�nea no se ejecuta
			System.out.printf("Tu n�mero es %s", num);
		} catch (Exception e) {
			// Si se quiere ver la traza de la excepci�n
			e.printStackTrace();
			System.out.println("No es un n�mero v�lido");
		} finally { // No es obligatorio
			sc.close();
		}
	}

}
