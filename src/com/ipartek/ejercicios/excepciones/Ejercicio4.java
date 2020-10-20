package com.ipartek.ejercicios.excepciones;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Persona;

/**
 * Crea una clase Persona con los atributos nombre y edad. En el m�todo setEdad
 * lanzar una excepci�n si la edad introducida es menor que 0 o mayor que
 * 120.</br>
 * Realiza un programa que al comienzo cree una lista de personas haciendo uso
 * del constructor vac�o, y lea los datos por teclado y los asigne a los objetos
 * creados. Solo introducir� las personas en la lista si est�n en el rango de
 * edad indicado, comprob�ndolo mediante el uso de excepciones
 * 
 * @version 1.0
 * @author LANDER
 *
 */

public class Ejercicio4 {

	public static void main(String[] args) {

		ArrayList<Persona> personas = new ArrayList<Persona>();
		Persona p;
		Scanner sc = new Scanner(System.in);
		boolean isAnadir = true;
		while (isAnadir) {
			p = new Persona();
			System.out.println("Introduce el nombre");
			p.setNombre(sc.nextLine());
			System.out.println("Introduce la edad");
			try {
				p.setEdad(Integer.parseInt(sc.nextLine()));
				personas.add(p);
			} catch (NumberFormatException e) {
				System.err.println("Error: No has introducido un n�mero");
			} catch (Exception e) {
				System.err.println("Error: " + e.getMessage());
			}
			System.out.println("�Desea continuar a�adiendo personas? (S�: S/ No: N)");
			if (sc.nextLine().equalsIgnoreCase("n")) {
				isAnadir = false;
			}
		}
		for (Persona pers : personas) {
			System.out.printf("Datos guardados\nNombre: %s\nEdad: %s A�os\n", pers.getNombre(), pers.getEdad());
		}
		sc.close();
	}

}
