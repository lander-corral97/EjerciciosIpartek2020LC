package com.ipartek.ejercicios.variablesYoperadores;

import java.text.DecimalFormat;

/**
 * Realizar una pequeña calculadora. Para ello se crearan 10 variables de
 * distintos tipos numéricos. Una vez creadas dichas variables y asignadas desde
 * código valores (se recomienda valores entre -10 y 10) realizar las siguientes
 * operaciones:
 * <ul>
 * <li>La suma de todos los números</li>
 * <li>La resta de todos los números</li>
 * <li>La media de todos los números</li>
 * </ul>
 * 
 * @version 1.0
 * @author LANDER
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		int a, b, c;
		long e, d, f;
		float g, h;
		short i, j;

		a = 1;
		b = 2;
		c = 3;
		e = -1;
		d = -2;
		f = -3;
		g = 7.0f;
		h = 5.0f;
		i = -3;
		j = -4;

		int suma = (int) (a + b + c + d + e + f + g + h + i + j);
		int resta = (int) (a - b - c - d - e - f - g - h - i - j);
		float media = (float) (suma / 10.0);

		System.out.println("Suma: " + suma);
		System.out.println("Resta: " + resta);
		System.out.println("Media: " + media);

		// A PARTE:

		int temperaturaSemana[] = { 13, 16, 19, 20, 23, 21, 20 };
		String diasSemana[] = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };
		float mediaSemana = 0;
		for (int k = 0; k < temperaturaSemana.length; k++) {
			System.out.println(diasSemana[k] + " hace " + temperaturaSemana[k] + " grados");
			mediaSemana += temperaturaSemana[k];
		}
		mediaSemana = mediaSemana / temperaturaSemana.length;
		DecimalFormat df = new DecimalFormat("#.00");

		System.out.println("La media de la semana: " + df.format(mediaSemana));
	}

}
