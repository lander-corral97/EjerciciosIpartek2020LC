package com.ipartek.apps;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.modelo.PerroDAO;
import com.ipartek.modelo.PerroDAOArrayList;
import com.ipartek.pojo.Perro;

public class AppPerrera {

	// variables globales para esta Clase
	static private Scanner sc = null;
	static private PerroDAO modelo = new PerroDAOArrayList();
	static private String opcion = ""; // opcion seleccionada en el menu por el usuario

	// opciones del menu
	static final private String OP_LISTAR = "1";
	static final private String OP_CREAR = "2";
	static final private String OP_ELIMINAR = "3";
	static final private String OP_SALIR = "s";

	public static void main(String[] args) {

		System.out.println("***********  APP  PERRERA   **************");
		sc = new Scanner(System.in);
		boolean salir = false;

		do {

			pintarMenu();

			switch (opcion) {
			case OP_LISTAR:
				listar();
				break;
			case OP_CREAR:
				// TODO resto de opciones
				System.out.println("Sin Terminar");
				break;

			case OP_SALIR:
				salir = true;
				System.out.println("***********  ADIOS, nos vemos pronto   **************");
				break;

			default:
				System.out.println(" ** por favor selecciona una opci�n valida ** ");
				break;
			}

		} while (!salir);

		sc.close();

	}// main

	private static void listar() {

		// TODO ver como dar una fixed lenght al String para nombre
		ArrayList<Perro> perros = modelo.listar();
		for (Perro perro : perros) {
			System.out.println(String.format("%15s [%s]  %s Kg", perro.getNombre(), perro.getRaza(), perro.getPeso()));
		}

	}

	/**
	 * Se encraga de pintar las pociones del menu.<br>
	 * Fijaros que no aparece {@code @return} porque no retorna nada {@code void}
	 * 
	 */
	private static void pintarMenu() {

		System.out.println("************************************");
		System.out.println(" " + OP_LISTAR + ".- Listar todos los perros");
		System.out.println(" " + OP_CREAR + ".- Crear un perro");
		System.out.println(" " + OP_ELIMINAR + ".- Dar de baja un Perro");
		System.out.println(" etc etc ...");
		System.out.println(" ");
		System.out.println(" " + OP_SALIR + " - Salir");
		System.out.println("************************************");

		System.out.println("\n Selecciona una opcion del menu:");
		// TODO gestionar errores
		opcion = sc.nextLine();

	}

}
