package com.ipartek.ejercicios.listas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Realizar un programa que solicite por teclado una temperatura. Una vez le�da,
 * se a�adir� a una lista de temperaturas. Introducir 8 temperaturas diferentes,
 * valid�ndolas seg�n estos criterios.
 * <ul>
 * <li>Deber�n estar comprendidas entre -90 y 75 grados</li>
 * </ul>
 * Una vez introducidas las 8 temperaturas, se recorrer� la lista y se mostrara
 * la siguiente informaci�n:
 * <ul>
 * <li>El valor de la temperatura m�s baja</li>
 * <li>El valor de la temperatura m�s alta</li>
 * <li>La temperatura media</li>
 * <li>Cuantos grados por encima de la media est� la temperatura m�s c�lida</li>
 * <li>Cuantos grados por debajo de la media est� la temperatura m�s baja</li>
 * <li>La diferencia entre la temperatura m�xima y m�nima.</li>
 * </ul>
 * 
 * @version 1.0
 * @author LANDER
 *
 */
public class Ejercicio1G2 {

	private static final float MIN_TEMP = -90f;
	private static final float MAX_TEMP = 75f;

	public static void main(String[] args) {

		ArrayList<Float> temperaturas = new ArrayList<Float>();
		Scanner sc = new Scanner(System.in);
		float min = MAX_TEMP + 1;
		float max = MIN_TEMP - 1;
		float media = 0f;

		for (int i = 0; i < 8; i++) {
			float temp = 0f;
			try {
				System.out.printf("Introduce una temperatura (Entre %s y %s)\n", MIN_TEMP, MAX_TEMP);
				temp = Float.parseFloat(sc.nextLine());
				if (temp < MIN_TEMP || temp > MAX_TEMP) {
					System.err.printf("Error: La temperatura debe estaer entre %s y %s\n", MIN_TEMP, MAX_TEMP);
					i--;
				} else {
					temperaturas.add(temp);
				}
			} catch (NumberFormatException e) {
				System.err.println("Error: Debes introducir un n�mero");
				i--;
			} catch (Exception e) {
				System.err.println("Error: Ha ocurrido un error");
				i--;
			}
		}

		for (Float temp : temperaturas) {
			media += temp;
			if (temp < min) {
				min = temp;
			}
			if (temp > max) {
				max = temp;
			}
		}

		media = media / temperaturas.size();

		System.out.printf("Temperatura m�nima: %.2f\n", min);
		System.out.printf("Temperatura m�xima: %.2f\n", max);
		System.out.printf("Temperatura media: %.2f\n", media);
		System.out.printf("Diferencia entre m�nima y media: %.2f\n", media - min);
		System.out.printf("Diferencia entre m�xima y media: %.2f\n", max - media);
		System.out.printf("Diferencia entre m�nima y m�xima: %.2f\n", max - min);

		sc.close();
	}

}
