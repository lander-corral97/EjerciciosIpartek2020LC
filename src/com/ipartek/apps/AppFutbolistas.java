package com.ipartek.apps;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Futbolista;

public class AppFutbolistas {

	// Constantes para el menú principal
	static final String LISTA = "1";
	static final String ANADIR = "2";
	static final String MODIFICAR = "3";
	static final String BORRAR = "4";
	static final String SALIR = "5";
	static final int MIN_MODIFICAR = 1;

	// Constantes para la modificación
	static final int NOMBRE = 1;
	static final int EDAD = 2;
	static final int ALTURA = 3;
	static final int NACIONALIDAD = 4;
	static final int EQUIPO = 5;
	static final int NO_MODIFICAR = 6;

	static ArrayList<Futbolista> futs = new ArrayList<Futbolista>();
	static Scanner sc = null;
	static String opt = "";
	static boolean isContinuar = true;

	public static void main(String[] args) {

		System.out.println("Futbolistas");

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
				try {
					eliminar();
				} catch (Exception e) {
					System.err.println("Error: " + e.getMessage());
				}
				break;

			case SALIR:
				isContinuar = false;
				break;
			}
		}

		System.out.println("¡Hasta otra!");
	}

	/**
	 * Borra un futbolista de la lista. Busca en base a su nombre, te salen todos
	 * los que contienen el parámetro de búsqueda. Después eliges de todos los que
	 * coinciden y el seleccionado se borra.
	 */
	private static void eliminar() throws Exception {
		System.out.println("Introduce el nombre del futbolista");

		String busqueda = sc.nextLine();
		ArrayList<Futbolista> futCoinciden = new ArrayList<Futbolista>();

		// Busca los futbolistas cuyos nombre contienen el String de búsqueda
		for (Futbolista fut : futs) {
			if (fut.getNombre().toLowerCase().contains(busqueda.toLowerCase())) {
				futCoinciden.add(fut);
			}
		}

		int futElegido = 0; // Opción elegida entre los jugadores que coincidían

		if (!futCoinciden.isEmpty()) {

			System.out.println("Estos son los jugadores que coinciden con tu búsqueda");
			for (int i = 0; i < futCoinciden.size(); i++) {

				/*
				 * Muestra el nombre de los futbolistas que coinciden con el parámetro de
				 * búsqueda con el siguiente formato: 1: jugador1 2: jugador2 ... array.size():
				 * jugador(Array.Size())
				 */
				System.out.println(i + 1 + ": " + futCoinciden.get(i).getNombre());
			}

			System.out.println("Introduce a quién quieres borrar");

			try {

				/*
				 * Aquí eliges qué futbolista eliges de los que contienen el parámetro de
				 * búsqueda. El número debe estar entre el 1 y el tamaño del array (ambos
				 * incluidos), ya que en el bucle anterior va listando de 1 al size() del array.
				 */
				futElegido = Integer.parseInt(sc.nextLine());
				if (futElegido < 1 || futElegido > futCoinciden.size()) {

					throw new Exception(
							String.format("El número que has introducido no está en el rango indicado: %s y %s",
									MIN_MODIFICAR, futCoinciden.size()));
				} else {
					Futbolista futSeleccionado = futCoinciden.get(futElegido - 1);
					int indiceEnArrayOriginal = 0;
					String siNo = "";

					// Buscamos en el array original el índice del futbolista
					for (int i = 0; i < futs.size(); i++) {

						if (futs.get(i).getNombre().equals(futSeleccionado.getNombre())) {
							indiceEnArrayOriginal = i;
						}
					}

					System.out.printf("¿Quieres borrar a %s de la lista? (S/N)\n", futSeleccionado.getNombre());
					siNo = sc.nextLine();

					if (siNo.equalsIgnoreCase("s")) {
						futs.remove(indiceEnArrayOriginal);
					}
				}
			} catch (NumberFormatException e) {
				throw new Exception("No has introducido un número");
			} catch (Exception e) {
				throw e;
			}
		}
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

		// Busca los futbolistas cuyos nombre contienen el String de búsqueda
		for (Futbolista fut : futs) {
			if (fut.getNombre().toLowerCase().contains(busqueda.toLowerCase())) {
				futCoinciden.add(fut);
			}
		}

		int futElegido = 0; // Opción elegida entre los jugadores que coincidían

		if (!futCoinciden.isEmpty()) {

			System.out.println("Estos son los jugadores que coinciden con tu búsqueda");
			for (int i = 0; i < futCoinciden.size(); i++) {

				/*
				 * Muestra el nombre de los futbolistas que coinciden con el parámetro de
				 * búsqueda con el siguiente formato: 1: jugador1 2: jugador2 ... array.size():
				 * jugador(Array.Size())
				 */
				System.out.println(i + 1 + ": " + futCoinciden.get(i).getNombre());
			}

			System.out.println("Introduce a quién quieres modificar");
			try {

				/*
				 * Aquí eliges qué futbolista eliges de los que contienen el parámetro de
				 * búsqueda. El número debe estar entre el 1 y el tamaño del array (ambos
				 * incluidos), ya que en el bucle anterior va listando de 1 al size() del array.
				 */
				futElegido = Integer.parseInt(sc.nextLine());
				if (futElegido < 1 || futElegido > futCoinciden.size()) {

					throw new Exception(
							String.format("El número que has introducido no está en el rango indicado: %s y %s",
									MIN_MODIFICAR, futCoinciden.size()));
				} else {
					Futbolista futSeleccionado = futCoinciden.get(futElegido - 1);
					int indiceEnArrayOriginal = 0;

					// Buscamos en el array original el índice del futbolista
					for (int i = 0; i < futs.size(); i++) {

						if (futs.get(i).getNombre().equals(futSeleccionado.getNombre())) {
							indiceEnArrayOriginal = i;
						}
					}

					System.out.printf("El futbolista seleccionado es %s\n", futSeleccionado.getNombre());
					System.out.println("________________________________________");

					int campoAModificar = 0; // Variable que identifica el campo a modificar
					do {
						System.out.println("Selecciona el campo a modificar");
						System.out.println("________________________________________");
						System.out.println("1.- Nombre");
						System.out.println("2.- Edad");
						System.out.println("3.- Altura");
						System.out.println("4.- Nacionalidad");
						System.out.println("5.- Equipo");
						System.out.println("6.- Terminar de modificar");
						System.out.println("________________________________________");
						campoAModificar = Integer.parseInt(sc.nextLine());
						switch (campoAModificar) {

						case NOMBRE:
							System.out.println("Introduce un nuevo nombre");
							futSeleccionado.setNombre(sc.nextLine());
							break;

						case EDAD:
							System.out.println("Introduce una nueva edad (de 0 a 120)");
							futSeleccionado.setEdad(Integer.parseInt(sc.nextLine()));
							break;

						case ALTURA:
							System.out.println("Introduce una nueva altura (de 0.0 a 3.0)");
							futSeleccionado.setAltura(Float.parseFloat(sc.nextLine()));
							break;

						case NACIONALIDAD:
							System.out.println("Introduce una nueva nacionalidad");
							futSeleccionado.setNacionalidad(sc.nextLine());
							break;

						case EQUIPO:
							System.out.println("Introduce un nuevo equipo");
							futSeleccionado.setEquipo(sc.nextLine());
							break;

						case NO_MODIFICAR:
							break;

						default:
							throw new Exception("No has metido una opción correcta");

						}

						futs.set(indiceEnArrayOriginal, futSeleccionado);
					} while (campoAModificar != NO_MODIFICAR);
				}
			} catch (NumberFormatException e) {
				throw new Exception("No has introducido un número");
			} catch (Exception e) {
				throw e;
			}
		} else {
			System.out.println("No hemos encontrado nada");
		}
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
			fut.setEquipo(sc.nextLine());
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
		for (int i = 0; i < 25; i++) {
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

		// pos 10
		futs.get(10).setNombre("N'Golo Kanté");
		futs.get(10).setEdad(29);
		futs.get(10).setAltura(1.68f);
		futs.get(10).setNacionalidad("Francia");
		futs.get(10).setEquipo("Chelsea");

		// pos 11
		futs.get(11).setNombre("Kevin de Bruyne");
		futs.get(11).setEdad(29);
		futs.get(11).setAltura(1.81f);
		futs.get(11).setNacionalidad("Bélgica");
		futs.get(11).setEquipo("Manchester City");

		// pos 12
		futs.get(12).setNombre("Luka Modric");
		futs.get(12).setEdad(35);
		futs.get(12).setAltura(1.72f);
		futs.get(12).setNacionalidad("Croacia");
		futs.get(12).setEquipo("Real Madrid");

		// pos 13
		futs.get(13).setNombre("Neymar da Silva Santos Júnior");
		futs.get(13).setEdad(28);
		futs.get(13).setAltura(1.75f);
		futs.get(13).setNacionalidad("Brasil");
		futs.get(13).setEquipo("PSG");

		// pos 14
		futs.get(14).setNombre("Frenkie de Jong");
		futs.get(14).setEdad(23);
		futs.get(14).setAltura(1.81f);
		futs.get(14).setNacionalidad("Países Bajos");
		futs.get(14).setEquipo("FC Barcelona");

		// pos 15
		futs.get(15).setNombre("Mohamed Salah");
		futs.get(15).setEdad(28);
		futs.get(15).setAltura(1.75f);
		futs.get(15).setNacionalidad("Egipto");
		futs.get(15).setEquipo("Liverpool");

		// pos 16
		futs.get(16).setNombre("Harry Edward Kane");
		futs.get(16).setEdad(27);
		futs.get(16).setAltura(1.88f);
		futs.get(16).setNacionalidad("Inglaterra");
		futs.get(16).setEquipo("Tottenham Hotspurs");

		// pos 17
		futs.get(17).setNombre("Antoine Griezmann");
		futs.get(17).setEdad(29);
		futs.get(17).setAltura(1.76f);
		futs.get(17).setNacionalidad("Francia");
		futs.get(17).setEquipo("FC Barcelona");

		// pos 18
		futs.get(18).setNombre("Karim Benzema");
		futs.get(18).setEdad(32);
		futs.get(18).setAltura(1.84f);
		futs.get(18).setNacionalidad("Francia");
		futs.get(18).setEquipo("Real Madrid");

		// pos 19
		futs.get(19).setNombre("Virgil van Dijk");
		futs.get(19).setEdad(29);
		futs.get(19).setAltura(1.93f);
		futs.get(19).setNacionalidad("Países Bajos");
		futs.get(19).setEquipo("Liverpool");

		// pos 20
		futs.get(20).setNombre("Sadio Mané");
		futs.get(20).setEdad(28);
		futs.get(20).setAltura(1.74f);
		futs.get(20).setNacionalidad("Senegal");
		futs.get(20).setEquipo("Liverpool");

		// pos 21
		futs.get(21).setNombre("Sergio Leonel Agüero del Castillo");
		futs.get(21).setEdad(32);
		futs.get(21).setAltura(1.73f);
		futs.get(21).setNacionalidad("Argentina");
		futs.get(21).setEquipo("Manchester City");

		// pos 22
		futs.get(22).setNombre("Paul Labile Pogba");
		futs.get(22).setEdad(27);
		futs.get(22).setAltura(1.91f);
		futs.get(22).setNacionalidad("Francia");
		futs.get(22).setEquipo("Manchester United");

		// pos 23
		futs.get(23).setNombre("Raheem Shaquille Sterling");
		futs.get(23).setEdad(25);
		futs.get(23).setAltura(1.7f);
		futs.get(23).setNacionalidad("Inglaterra");
		futs.get(23).setEquipo("Manchester City");

		// pos 24
		futs.get(24).setNombre("Christian Dannemann Eriksen");
		futs.get(24).setEdad(28);
		futs.get(24).setAltura(1.82f);
		futs.get(24).setNacionalidad("Dinamarca");
		futs.get(24).setEquipo("Inter de Milán");
	}

}
