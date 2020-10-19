package com.ipartek.ejercicios.excepciones;

import java.util.Scanner;

import com.ipartek.pojo.Persona;

/**
 * 
 * Crea una clase Persona con los atributos nombre y edad. En el método setEdad
 * lanzar una excepción si la edad introducida es menor que 0 o mayor que
 * 120.</br>
 * Realiza un programa que al comienzo cree una lista de personas haciendo uso
 * del constructor vacío, y lea los datos por teclado y los asigne a los objetos
 * creados. Solo introducirá las personas en la lista si están en el rango de
 * edad indicado, comprobándolo mediante el uso de excepciones
 * 
 * @version 1.0
 * @author LANDER
 *
 */

public class Ejercicio4 {

	public static void main(String[] args) {
		Persona p = new Persona();
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre");
		p.setNombre(sc.nextLine());
		System.out.println("Introduce la edad");
		try {
			p.setEdad(Integer.parseInt(sc.nextLine()));
			System.out.printf("Datos guardados\nNombre: %s\nEdad: %s Años", p.getNombre(), p.getEdad());
		} catch (NumberFormatException e) {
			System.err.println("Error: No has introducido un número");
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
		sc.close();
	}

}
