package com.ipartek.ejercicios.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EjemploList {

	public static void main(String[] args) {

		// LinkedList
		List<String> lista1 = new LinkedList<String>();

		// Añadimos nodos y creamos un Iterator
		lista1.add("Valencia");
		lista1.add("Madrid");
		lista1.add("Sevilla");
		Iterator<String> iterador = lista1.iterator();

		// La api de Collections tiene metodos para ordenar
		Collections.sort(lista1);

		// Recorremos y mostramos la lista
		while (iterador.hasNext()) {
			String elemento = (String) iterador.next();
			System.out.print(elemento + " ");
		}
		System.out.println("--LinkedList--");

		// ArrayList
		List<String> lista2 = new ArrayList<String>();

		// Añadimos nodos y creamos un Iterator
		lista2.add("Madrid");
		lista2.add("Sevilla");
		lista2.add("Valencia");

		// La api de Collections tiene metodos para ordenar
		// Collections.sort(lista2);
		Collections.reverse(lista2);

		Iterator<String> iterador2 = lista2.iterator();

		// Recorremos y mostramos la lista
		while (iterador2.hasNext()) {
			String elemento = (String) iterador2.next();
			System.out.print(elemento + " ");
		}
		System.out.println("--ArrayList--");
	}

}
