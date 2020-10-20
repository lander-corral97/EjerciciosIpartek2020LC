package com.ipartek.ejercicios.colecciones;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Ejercicio para aprender los m�todos b�sicos de java.util.ArrayList
 * 
 * @version 1.0
 * @author LANDER
 *
 */
public class EjercicioPaises {

	public static void main(String[] args) {

		// Son din�micos y pueden crecer, a diferencia de String[] que es est�tico.
		ArrayList<String> paises = new ArrayList<String>();

		// A�adir [Permite duplicados]
		paises.add("Brasil");
		paises.add("Espa�a");
		paises.add("Andorra");
		paises.add("Barakaldo");
		paises.add("Repelega");
		paises.add("Guinea Bissau");
		paises.add("Barakaldo");
		paises.add("Barakaldo");
		paises.add("Barakaldo");

		// Insertar en una posici�n
		paises.add(1, "Francia");

		// Reemplazar
		paises.set(1, "EH");

		// Eliminar
		// por �ndice
		paises.remove(1);

		// por objeto, en caso de duplicados borra el primero
		paises.remove("Guinea Bissau");

		// Recuperar un objeto
		String s = paises.get(0);
		System.out.printf("Pais en posici�n 0: %s", s);

		// Tama�o del array
		System.out.println("Tama�o del array: " + paises.size());

		// Obtener la posici�n de un objeto dentro del array
		int pos = paises.indexOf("Repelega");
		System.out.printf("Posici�n de Repelega: %s", pos);

		// Recorrer para mostrar
		for (Iterator<String> iterator = paises.iterator(); iterator.hasNext();) {
			String pais = (String) iterator.next();
			System.out.println(pais);
		}
	}

}
