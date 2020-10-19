package com.ipartek.ejercicios.excepciones;

import java.util.Scanner;

import com.ipartek.pojo.Persona;

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
