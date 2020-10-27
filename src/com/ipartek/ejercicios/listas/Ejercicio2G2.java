package com.ipartek.ejercicios.listas;

import com.ipartek.pojo.BoletoEuro;

/**
 * Genera un programa que seleccione números aleatorios para el sorteo de los
 * euro millones. Para dicho sorteo se creara una lista de enteros que se
 * rellenara con los números del 1 al 50, así como una lista con los números del
 * 1 al 12 para representar las estrellas.<br>
 * Ambas listas se desordenaran y se sacaran los cinco primeros números de la
 * lista de los 50 números y 2 de la lista de 12.<br>
 * Se mostraran los números en pantalla<br>
 * Bonus: realizar este programa haciendo que ambas listas se creen haciendo uso
 * de POO, mediante una clase llamada BoletoEuro y que al hacer uso de un
 * constructor vacio, ya nos muestre el resultado generado en pantalla
 * 
 * @author LANDER
 *
 */
public class Ejercicio2G2 {

	public static void main(String[] args) {
		BoletoEuro be = new BoletoEuro();
		System.out.println(be);
	}

}
