package com.ipartek.cartas;

import java.util.ArrayList;
import java.util.Random;

import com.ipartek.pojo.Carta;

public abstract class Baraja {

	ArrayList<Carta> baraja = new ArrayList<Carta>();

	/**
	 * Crea la baraja (Depende de que tipo de baraja sea)
	 */
	abstract void crear();

	/**
	 * Muestra la baraja (Depende de que tipo de baraja sea)
	 */
	abstract void mostrar();

	/**
	 * Ordena la baraja por palo
	 */
	void ordenarPorPalo() {
		Carta temp = new Carta();
		for (int i = 0; i < baraja.size() - 1; i++) {
			for (int j = i + 1; j < baraja.size(); j++) {
				if (baraja.get(i).getPalo().compareTo(baraja.get(j).getPalo()) > 0) {
					temp = baraja.get(i);
					baraja.set(i, baraja.get(j));
					baraja.set(j, temp);
				}
			}
		}
	}

	/**
	 * Ordena la baraja por número
	 */
	void ordenarPorNumero() {
		Carta temp = new Carta();
		for (int i = 0; i < baraja.size() - 1; i++) {
			for (int j = i + 1; j < baraja.size(); j++) {
				if (baraja.get(i).getValor() > baraja.get(j).getValor()) {
					temp = baraja.get(i);
					baraja.set(i, baraja.get(j));
					baraja.set(j, temp);
				}
			}
		}
	}

	/**
	 * Desordena la baraja de forma aleatoria
	 */
	void barajar() {
		// Collections.shuffle(baraja); // Forma fácil usando Collections

		Random r = new Random();

		for (int i = baraja.size() - 1; i > 0; i--) {
			int j = r.nextInt(i);

			Carta temp = baraja.get(i);
			baraja.set(i, baraja.get(j));
			baraja.set(j, temp);
		}
	}
}
