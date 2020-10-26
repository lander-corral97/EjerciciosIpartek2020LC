package com.ipartek.ejercicios.listas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * Crear una lista de nombres de alumnos, donde se guardaran con strings.<br>
 * Insertar diez nombres de alumnos en la lista <br>
 * Mostrar los diez nombres recorriendo la lista con un foreach
 * 
 * 
 * @author LANDER
 * @version 1.0
 */

public class Ejercicio1 {

	public static void main(String[] args) {

		ArrayList<String> nombres = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Inserte un nombre");
			nombres.add(sc.nextLine());
		}

		for (String nombre : nombres) {
			System.out.println("Nombre: " + nombre);
		}

		sc.close();
	}

}
