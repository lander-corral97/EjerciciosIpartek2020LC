package com.ipartek.ejercicios.estructurasRepetitivas;

import java.util.Scanner;

/**
 * 
 * Realizar un programa que pida por teclado las notas de un alumno. Dichas
 * notas se guardarán en formato entero, en un array de 8 posiciones,
 * totales.</br>
 * Se solicitará la nota del alumno, y se guardará en el array. Una vez
 * introducida se preguntará si se desean introducir más notas. Si la respuesta
 * es si, se continuara metiendo notas en el array</br>
 * Tener cuidado, solo se podrán meter 8 notas. No se deberá dejar éter una
 * novena
 * 
 * 
 * @version 1.0
 * @author LANDER
 *
 */

public class Ejercicio5 {

	public static void main(String[] args) {
		int notas[] = new int[8];
		Scanner sc = new Scanner(System.in);
		boolean isContinue = true;
		for (int i = 0; i < notas.length && isContinue; i++) {
			System.out.println("Introduce la nota");
			notas[i] = Integer.parseInt(sc.nextLine());
			System.out.println("¿Quieres continuar? (S/N)");
			if (sc.next().equalsIgnoreCase("N")) {
				isContinue = false;
			}
		}
		sc.close();
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota nº" + (i + 1) + ": " + notas[i]);
		}
	}

}
