package com.ipartek.ejercicios.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.ipartek.pojo.Carta;

/**
 * Crear una lista que contenga las cuarenta cartas de una baraja. Para crear
 * dicha lista se creara una clase de tipo carta, que tendrá un número entero
 * para el valor de la carta, así como un string con el palo de la baraja
 * (copas, espadas, oros, bastos). <br>
 * Crear la baraja con las cartas ordenadas por palos, y luego por números.<br>
 * Barajar dicha baraja y mostrar las cartas.
 * 
 * @version 1.0
 * @author LANDER
 *
 */
public class Ejercicio4 {

	private static final int MAX_BARAJAR = 1000000;

	private static ArrayList<Carta> baraja = new ArrayList<Carta>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numeroBarajar = -1;

		inicializarBaraja();

		System.out.println("------------------------------");
		System.out.println("Baraja ordenada por palos");
		System.out.println("------------------------------");
		ordenarPorPalos();

		for (Carta carta : baraja) {
			System.out.println(carta);
		}

		System.out.println("------------------------------");
		System.out.println("Baraja ordenada por valor");
		System.out.println("------------------------------");
		ordenarPorValor();

		for (Carta carta : baraja) {
			System.out.println(carta);
		}

		do {
			try {
				System.out.println("------------------------------");
				System.out.printf("Introduce el número de veces que quieres barajar (Máx. %s)\n", MAX_BARAJAR);
				System.out.println("------------------------------");
				numeroBarajar = Integer.parseInt(sc.nextLine());
				if (numeroBarajar > MAX_BARAJAR) {
					System.err.printf("Error: Se debe barajar menos de %s de veces\n", MAX_BARAJAR);
					numeroBarajar = -1;
				}
			} catch (NumberFormatException e) {
				System.err.println("Error: Debes introducir un número");
			} catch (Exception e) {
				System.err.println("Error: Ha ocurrido un error");
			}

		} while (numeroBarajar == -1);

		System.out.println("Barajando cartas...");
		for (int i = 0; i < numeroBarajar; i++) {
			Collections.shuffle(baraja); // Baraja la colección de forma aleatoria
		}

		for (Carta carta : baraja) {
			System.out.println(carta);
		}

		sc.close();
	}

	/**
	 * Método para ordenar la baraja por valor de sus cartas
	 */
	private static void ordenarPorValor() {
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
	 * Método para ordenar la baraja por palos
	 */
	private static void ordenarPorPalos() {
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
	 * Método para inicializar la baraja.
	 */
	private static void inicializarBaraja() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 10; j++) {
				Carta c = new Carta();
				if (j < 7) {
					c.setValor(j + 1);
				} else {
					c.setValor(j + 3);
				}
				switch (i) {
				case 0:
					c.setPalo("Copas");
					break;
				case 1:
					c.setPalo("Espadas");
					break;
				case 2:
					c.setPalo("Oros");
					break;
				case 3:
					c.setPalo("Bastos");
					break;
				}
				baraja.add(c);
			}
		}
	}

}
