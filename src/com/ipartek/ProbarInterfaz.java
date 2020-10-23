package com.ipartek;

import java.util.Scanner;

import com.ipartek.pojo.Serie;

public class ProbarInterfaz {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Utilidades util = new Utilidades();
		float dineroEntregado = 0f;
		float valorProducto = 0f;
		Serie s = null;

		try {
			System.out.printf("Tu nombre es %s\n", util.pedirNombre());
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}

		System.out.println("Introduce una de las siguientes opciones: ");
		System.out.println("1.- Número de euromillón");
		System.out.println("2.- Número de quiniela");
		System.out.println("3.- Numero de bonoloto");
		try {
			util.imprimirNumeroLoteria(Integer.parseInt(sc.nextLine()));
		} catch (NumberFormatException e) {
			System.err.println("Error: Debes introducir un número");
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}

		try {
			System.out.println("Introduce el valor del producto");
			valorProducto = Float.parseFloat(sc.nextLine());
			System.out.println("¿Cuanto dinero das?");
			dineroEntregado = Float.parseFloat(sc.nextLine());

			System.out.printf("Te devolvemos %.2f€", util.calcularVueltas(dineroEntregado, valorProducto));
		} catch (NumberFormatException e) {
			System.err.println("Error: Debes introducir números");
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}

		s = util.pedirDatosPorConsola();
		System.out.println(s == null ? "" : s);

	}

}
