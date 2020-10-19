package com.ipartek.ejercicios.excepciones;

import java.util.Scanner;

/**
 * 
 * Realice un programa que nos solicite por teclado dos n�meros, y leerlos
 * usando la clase Scanner mediante la funci�n nextLine(). </br>
 * Transformar ambos strings a n�meros enteros usando la siguiente sentencia
 * Integer.parseInt(numeroLeido). Agrupar el c�digo entre un bloque try catch y
 * procesar para que no se produzca una interrupci�n y finalizaci�n del programa
 * si alguno de los n�meros le�dos no puede convertirse, retomando el control en
 * el punto del fallo, hasta que se solucione
 * 
 * @version 1.0
 * @author LANDER
 *
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		int a, b;
		a = 0;
		b = 0;
		Scanner sc = new Scanner(System.in);
		int contNum = 0;
		while (contNum != 2) {
			/*
			 * En este caso s�lo hay dos datos, pero si hubiese m�s es mejor hacer un bucle
			 * por cada dato, ya que si no habr�a que rellenar todo.
			 */
			try {
				System.out.println("Introduce un n�mero");
				a = Integer.parseInt(sc.nextLine());
				contNum++;
				System.out.println("Introduce otro n�mero");
				b = Integer.parseInt(sc.nextLine());
				contNum++;
			} catch (Exception e) {
				System.out.println("Un n�mero no es correcto...");
				contNum = 0;
			}
		}
		System.out.printf("Los n�meros son %s y %s", a, b);
		sc.close();
	}

}
