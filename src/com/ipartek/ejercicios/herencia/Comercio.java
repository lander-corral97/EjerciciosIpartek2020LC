package com.ipartek.ejercicios.herencia;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Producto;
import com.ipartek.pojo.Servicio;

public class Comercio {

	private static final String NUEVO_STOCK = "1";
	private static final String VENDER_PROD = "2";
	private static final String VENDER_SERV = "3";

	private static ArrayList<Producto> productos = new ArrayList<Producto>();
	private static ArrayList<Servicio> servicios = new ArrayList<Servicio>();
	private static String opc = "";
	private static boolean isContinuar = true;
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String siNo = "";

		inicializarListas();

		do {
			pintarMenu();
			switch (opc) {
			case NUEVO_STOCK:
				break;
			case VENDER_PROD:
				break;
			case VENDER_SERV:
				break;
			default:
				System.err.println("Has introducido una opción incorrecta");
				break;
			}
			System.out.println("¿Quieres seguir? (S/N)");
			siNo = sc.nextLine();
			if ("n".equalsIgnoreCase(siNo)) {
				isContinuar = false;
			} else if (!"s".equalsIgnoreCase(siNo)) {
				System.err.println("Como has introducido algo diferente a S o N, seguirás dentro del bucle");
			}
		} while (isContinuar);

		sc.close();
	}

	/**
	 * Pinta el menú inicial
	 */
	private static void pintarMenu() {
		System.out.println("Introduce una opción");
		System.out.println("-----------------------------");
		System.out.println("1.- Añadir el stock de la tienda");
		System.out.println("2.- Vender producto");
		System.out.println("3.- Vender servicio informático");
		System.out.println("-----------------------------");

		opc = sc.nextLine();
	}

	/**
	 * Método para inicializar las listas (productos y servicios)
	 */
	private static void inicializarListas() {
		// TODO Buscar ejemplos en Google
	}

}
