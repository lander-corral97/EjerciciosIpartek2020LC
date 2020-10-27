package com.ipartek.cartas;

import java.util.ArrayList;
import java.util.Collections;

import com.ipartek.pojo.Carta;

public abstract class Baraja {

	ArrayList<Carta> baraja = new ArrayList<Carta>();

	abstract void crear();

	abstract void mostrar();

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

	void barajar() {
		Collections.shuffle(baraja);
	}
}
