package com.ipartek.ejercicios.estructurasCondicionales;

import java.util.Scanner;

/**
 * Pedir por teclado al usuario que introduzca una distancia en cm<br>
 * Una vez introducida, se solicitará que escoja a que unidad se van a
 * convertir, introduciendo la opción por teclado
 * <ul>
 * <li>A convertir a metros</li>
 * <li>B: convertir a pulgadas</li>
 * <li>C: convertir a pies</li>
 * <li>D:convertir a yardas</li>
 * </ul>
 * 
 * @version 1.0
 * @author LANDER
 *
 */
public class Ejercicio3 {

	static final float CONV_METROS = 100;
	static final float CONV_PULGADAS = 2.54f;
	static final float CONV_PIES = 30.48f;
	static final float CONV_YARDAS = 91.44f;

	public static void main(String[] args) {
		System.out.println("Introduzca una medida en cm");
		Scanner sc = new Scanner(System.in);
		int num = 0;
		num = sc.nextInt();
		System.out.println("Elija la conversión:");
		String opt = "";
		System.out.println("A: metros");
		System.out.println("B: pulgadas");
		System.out.println("C: pies");
		System.out.println("D: yardas");
		opt = sc.next();
		switch (opt.toUpperCase()) {
		case "A":
			System.out.printf("%s en metros es %.2f", num, num / CONV_METROS);
			break;
		case "B":
			System.out.printf("%s en pulgadas es %.2f", num, num / CONV_PULGADAS);
			break;
		case "C":
			System.out.printf("%s en pies es %.2f", num, num / CONV_PIES);
			break;
		case "D":
			System.out.printf("%s en yardas es %.2f", num, num / CONV_YARDAS);
			break;
		default:
			System.out.println("Error: Opción incorrecta");
			break;
		}
		sc.close();
	}

}
