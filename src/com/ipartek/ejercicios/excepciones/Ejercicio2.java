package com.ipartek.ejercicios.excepciones;

import java.util.Scanner;

/**
 * 
 * Realice un programa que nos solicite por teclado dos números, y leerlos
 * usando la clase Scanner mediante la función nextLine(). </br>
 * Transformar ambos strings a números enteros usando la siguiente sentencia
 * Integer.parseInt(numeroLeido). Agrupar el código entre un bloque try catch y
 * procesar para que no se produzca una interrupción y finalización del programa
 * si alguno de los números leídos no puede convertirse, retomando el control en
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
			 * En este caso sólo hay dos datos, pero si hubiese más es mejor hacer un bucle
			 * por cada dato, ya que si no habría que rellenar todo.
			 */
			try {
				System.out.println("Introduce un número");
				a = Integer.parseInt(sc.nextLine());
				contNum++;
				System.out.println("Introduce otro número");
				b = Integer.parseInt(sc.nextLine());
				contNum++;
			} catch (Exception e) {
				System.out.println("Un número no es correcto...");
				contNum = 0;
			}
		}
		System.out.printf("Los números son %s y %s", a, b);
		sc.close();
	}

}
