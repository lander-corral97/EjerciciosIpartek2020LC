package com.ipartek.ejercicios.colecciones;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Ejercicio para aprender los métodos básicos de java.util.ArrayList
 * 
 * @version 1.0
 * @author LANDER
 *
 */
public class EjercicioPaises {

	public static void main(String[] args) {

		// Son dinámicos y pueden crecer, a diferencia de String[] que es estático.
		ArrayList<String> paises = new ArrayList<String>();

		// Añadir [Permite duplicados]
		paises.add("Brasil");
		paises.add("España");
		paises.add("Andorra");
		paises.add("Barakaldo");
		paises.add("Repelega");
		paises.add("Guinea Bissau");
		paises.add("Barakaldo");
		paises.add("Barakaldo");
		paises.add("Barakaldo");

		// Insertar en una posición
		paises.add(1, "Francia");

		// Reemplazar
		paises.set(1, "EH");

		// Eliminar
		// por índice
		paises.remove(1);

		// por objeto, en caso de duplicados borra el primero
		paises.remove("Guinea Bissau");

		// Recuperar un objeto
		String s = paises.get(0);
		System.out.printf("Pais en posición 0: %s", s);

		// Tamaño del array
		System.out.println("Tamaño del array: " + paises.size());

		// Obtener la posición de un objeto dentro del array
		int pos = paises.indexOf("Repelega");
		System.out.printf("Posición de Repelega: %s", pos);

		// Recorrer para mostrar
		for (Iterator<String> iterator = paises.iterator(); iterator.hasNext();) {
			String pais = (String) iterator.next();
			System.out.println(pais);
		}
	}

}
