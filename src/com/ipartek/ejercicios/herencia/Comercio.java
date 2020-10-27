package com.ipartek.ejercicios.herencia;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Producto;
import com.ipartek.pojo.Servicio;

public class Comercio {

	// Menú principal
	private static final String NUEVO_STOCK = "1";
	private static final String VENDER_PROD = "2";
	private static final String VENDER_SERV = "3";

	// Menú de nuevo stock
	private static final String DISCO_DURO = "A";
	private static final String PROCESADOR = "B";
	private static final String GRAFICA = "C";

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
				nuevoStock();
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
	 * Añade un nuevo producto a la lista de productos
	 */
	private static void nuevoStock() {
		System.out.println("Introduce el tipo de producto");
		System.out.println("-----------------------------");
		System.out.println("A- Disco Duro");
		System.out.println("B- Procesador");
		System.out.println("C- Grafica");
		System.out.println("-----------------------------");
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
