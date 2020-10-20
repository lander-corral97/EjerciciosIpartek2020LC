package com.ipartek.apps;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Futbolista;

public class AppFutbolistas {

	static final String LISTA = "1";
	static final String ANADIR = "2";
	static final String MODIFICAR = "3";
	static final String BORRAR = "4";
	static final String SALIR = "5";
	static final int MIN_MODIFICAR = 1;

	static ArrayList<Futbolista> futs = new ArrayList<Futbolista>();
	static Scanner sc = null;
	static String opt = "";
	static boolean isContinuar = true;

	public static void main(String[] args) {

		System.out.println("Futbolistas_____________________________");

		sc = new Scanner(System.in);
		try {
			inicializarLista();
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}

		while (isContinuar) {
			pintarMenu();
			switch (opt) {
			case LISTA:
				listar();
				break;
			case ANADIR:
				try {
					anadir();
				} catch (Exception e) {
					System.err.println("Error: " + e.getMessage());
				}
				break;
			case MODIFICAR:
				try {
					modificar();
				} catch (Exception e) {
					System.err.println("Error: " + e.getMessage());
				}
				break;
			case BORRAR:
				break;
			case SALIR:
				isContinuar = false;
				break;
			}
		}

		System.out.println("¡Hasta otra!____________________________");
	}

	/**
	 * Modifica un futbolista. Busca en base a su nombre, te salen todos los
	 * resultados con ese nombre y eliges cual quieres modificar, luego eliges qué
	 * campo quieres modificar.
	 * 
	 * @throws Exception
	 */
	private static void modificar() throws Exception {
		System.out.println("Introduce el nombre del futbolista");
		String busqueda = sc.nextLine(); // Nombre a buscar

		ArrayList<Futbolista> futCoinciden = new ArrayList<Futbolista>();
		do {
			// Busca los futbolistas cuyos nombre contienen el String de búsqueda
			for (Futbolista fut : futs) {
				if (fut.getNombre().toLowerCase().contains(busqueda)) {
					futCoinciden.add(fut);
				}
			}

			int futElegido = 0; // Opción elegida entre los jugadores que coincidían

			if (!futCoinciden.isEmpty()) {

				System.out.println("Estos son los jugadores que coinciden con tu búsqueda");
				for (int i = 0; i < futCoinciden.size(); i++) {
					System.out.println(i + 1 + ": " + futCoinciden.get(i).getNombre());
				}
				System.out.println("Introduce a quién quieres modificar");
				try {
					futElegido = Integer.parseInt(sc.nextLine());
					if (futElegido < 1 || futElegido >= futCoinciden.size()) {

						throw new Exception(
								String.format("El número que has introducido no está en el rango indicado: %s y %s",
										MIN_MODIFICAR, futCoinciden.size()));
					} else {
						Futbolista futSeleccionado = futCoinciden.get(futElegido - 1);
						System.out.println("Campo a modificar");
						System.out.println("________________________________________");
						System.out.println("1.- Nombre");
						System.out.println("2.- Edad");
						System.out.println("3.- Altura");
						System.out.println("4.- Nacionalidad");
						System.out.println("5.- Equipo");
						System.out.println("________________________________________");
						// TODO Tras la opción, que pueda modificar dicho campo.
					}
				} catch (NumberFormatException e) {
					throw new Exception("No has introducido un número");
				} catch (Exception e) {
					throw e;
				}
			} else {
				System.out.println("No hemos encontrado nada");
			}
		} while (futCoinciden.isEmpty());
	}

	/**
	 * Añade un futbolista a la lista
	 */
	private static void anadir() throws Exception {
		Futbolista fut = new Futbolista();
		try {
			System.out.println("Introduce un nombre");
			fut.setNombre(sc.nextLine());
			System.out.println("Introduce la edad [entre 0 y 120]");
			fut.setEdad(Integer.parseInt(sc.nextLine()));
			System.out.println("Introduce la altura [entre 0 y 3 metros]");
			fut.setAltura(Float.parseFloat(sc.nextLine()));
			System.out.println("Introduce la nacionalidad");
			fut.setNacionalidad(sc.nextLine());
			System.out.println("Introduce el equipo");
			fut.setNacionalidad(sc.nextLine());
			futs.add(fut);
		} catch (NumberFormatException e) {
			throw new Exception("No has introducido un número");
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * Muestra los datos de la lista de futbolistas
	 */
	private static void listar() {
		for (Futbolista futbolista : futs) {
			System.out.println(futbolista);
		}
	}

	/**
	 * Muestra el menú para elegir una opción.
	 * <ul>
	 * <li>Lista de fut.</li>
	 * <li>Añade un fut.</li>
	 * <li>Modifica un fut.</li>
	 * <li>Elimina un fut.</li>
	 * <li>Sale de la app</li>
	 * </ul>
	 */
	private static void pintarMenu() {
		System.out.println("________________________________________");
		System.out.println("1.- Listar futbolistas");
		System.out.println("2.- Añadir un futbolista");
		System.out.println("3.- Modificar un futbolista");
		System.out.println("4.- Eliminar un futbolista");
		System.out.println("5.- Salir");
		System.out.println("________________________________________");

		opt = sc.nextLine();
	}

	/**
	 * Método para inicializar la lista de futbolistas
	 * 
	 * @throws Exception
	 */
	private static void inicializarLista() throws Exception {
		for (int i = 0; i < 10; i++) {
			futs.add(new Futbolista());
		}

		// pos 0
		futs.get(0).setNombre("Lionel Andrés Messi Cuccitini");
		futs.get(0).setEdad(33);
		futs.get(0).setAltura(1.7f);
		futs.get(0).setNacionalidad("Argentina");
		futs.get(0).setEquipo("FC Barcelona");

		// pos 1
		futs.get(1).setNombre("Kylian Sanmi Mbappé Lotin");
		futs.get(1).setEdad(21);
		futs.get(1).setAltura(1.78f);
		futs.get(1).setNacionalidad("Francia");
		futs.get(1).setEquipo("PSG");

		// pos 2
		futs.get(2).setNombre("Cristiano Ronaldo dos Santos Aveiro");
		futs.get(2).setEdad(35);
		futs.get(2).setAltura(1.87f);
		futs.get(2).setNacionalidad("Portugal");
		futs.get(2).setEquipo("Juventus");

		// pos 3
		futs.get(3).setNombre("Marc-André ter Stegen");
		futs.get(3).setEdad(28);
		futs.get(3).setAltura(1.87f);
		futs.get(3).setNacionalidad("Alemania");
		futs.get(3).setEquipo("FC Barcelona");

		// pos 4
		futs.get(4).setNombre("Gerard Piqué i Bernabeu");
		futs.get(4).setEdad(33);
		futs.get(4).setAltura(1.92f);
		futs.get(4).setNacionalidad("España");
		futs.get(4).setEquipo("FC Barcelona");

		// pos 5
		futs.get(5).setNombre("Luis Alberto Suárez Díaz");
		futs.get(5).setEdad(33);
		futs.get(5).setAltura(1.82f);
		futs.get(5).setNacionalidad("Uruguay");
		futs.get(5).setEquipo("Atlético de Madrid");

		// pos 6
		futs.get(6).setNombre("Jan Oblak");
		futs.get(6).setEdad(27);
		futs.get(6).setAltura(1.88f);
		futs.get(6).setNacionalidad("Eslovenia");
		futs.get(6).setEquipo("Atlético de Madrid");

		// pos 7
		futs.get(7).setNombre("Eden Michael Hazard");
		futs.get(7).setEdad(29);
		futs.get(7).setAltura(1.75f);
		futs.get(7).setNacionalidad("Bélgica");
		futs.get(7).setEquipo("Real Madrid");

		// pos 8
		futs.get(8).setNombre("Sergio Busquets i Burgos");
		futs.get(8).setEdad(32);
		futs.get(8).setAltura(1.89f);
		futs.get(8).setNacionalidad("España");
		futs.get(8).setEquipo("FC Barcelona");

		// pos 9
		futs.get(9).setNombre("Sergio Ramos García");
		futs.get(9).setEdad(34);
		futs.get(9).setAltura(1.84f);
		futs.get(9).setNacionalidad("España");
		futs.get(9).setEquipo("Real Madrid");
	}

}
