package com.ipartek.actividad1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * A) Realizar un programa en java que realice la siguiente función: Crear un
 * array de 5 notas que almacenara en formato double.<br>
 * Una vez creado dicho array se rellenaran dichos elementos leyéndolo desde el
 * teclado.<br>
 * Una vez creado el contenido, se calculara la media de las notas así como se
 * mostraran las notas más altas y más bajas de dicho array.
 * 
 * 
 * @version 1.0
 * @author LANDER
 *
 */

public class EjercicioA {

	public static void main(String[] args) {

		ArrayList<Double> notas = new ArrayList<Double>();
		Scanner sc = new Scanner(System.in);
		double media = 0;
		double mayor = Double.MIN_VALUE;
		double menor = Double.MAX_VALUE;

		for (int i = 0; i < 5; i++) {

			System.out.printf("Introduce la nota nº %s\n", i + 1);
			try {
				notas.add(Double.parseDouble(sc.nextLine()));
				media += notas.get(i);
				if (menor > notas.get(i)) {
					menor = notas.get(i);
				}
				if (mayor < notas.get(i)) {
					mayor = notas.get(i);
				}
			} catch (NumberFormatException e) {
				System.err.println("Error: Debes introducir un número");
				i--;
			} catch (Exception e) {
				e.printStackTrace();
				i--;
			}
		}

		media = media / notas.size();

		System.out.println("Notas: ");
		for (Double nota : notas) {
			System.out.println(nota);
		}
		System.out.printf("Media: %.2f\nMenor: %.2f\nMayor: %.2f", media, menor, mayor);

		sc.close();
	}

}
