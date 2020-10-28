package com.ipartek.apps;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.modelo.FutbolistaDAOArrayList;
import com.ipartek.pojo.Futbolista;

/**
 * Aplicación de futbolistas para practicar el CRUD con las siguientes
 * funcionalidades.
 * 
 * <ul>
 * <li>Listar jugadores</li>
 * <li>Listar jugadores de cierta nacionalidad</li>
 * <li>Listar jugadores mayores o menores de cierta edad</li>
 * <li>Añadir jugador</li>
 * <li>Modificar jugador</li>
 * <li>Borrar jugador</li>
 * <li>Ordenar la lista alfabéticamente</li>
 * <li>Salir</li>
 * </ul>
 * 
 * @author LANDER
 *
 */
public class AppFutbolistas {

	// Constantes para el menú principal
	static final private String LISTA = "1";
	static final private String LISTA_POR_NAC = "2";
	static final private String LISTA_MAY_MEN_EDAD = "3"; // Constante para el método de mayor/menor de una edad
	static final private String MOSTRAR_FUT_CON_ID = "4";
	static final private String ANADIR = "5";
	static final private String MODIFICAR = "6";
	static final private String BORRAR = "7";
	static final private String ORDENAR_LISTA_ALF = "8"; // Ordena alfabeticamente la lista
	static final private String SALIR = "9";

	/*
	 * Constante para el método de modificación. Cuando te lista todos los
	 * jugadores, van de 1 al máximo de coincidencias. Esta constante es el número
	 * mínimo, es decir 1.
	 */
	static final private int MIN_MODIFICAR = 1;

	// Constantes para la modificación
	static final private int NOMBRE = 1;
	static final private int EDAD = 2;
	static final private int ALTURA = 3;
	static final private int NACIONALIDAD = 4;
	static final private int EQUIPO = 5;
	static final private int NO_MODIFICAR = 6;

	static private ArrayList<Futbolista> futs = new ArrayList<Futbolista>();
	static private FutbolistaDAOArrayList dao = new FutbolistaDAOArrayList();
	static private Scanner sc = null;
	static private String opt = "";
	static private boolean isContinuar = true;

	public static void main(String[] args) {

		System.out.println("--------------Futbolistas--------------");

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

			case LISTA_POR_NAC:
				listarPorNacionalidad();
				break;

			case LISTA_MAY_MEN_EDAD:
				try {
					listarMayorOMenorDeEdad();
				} catch (Exception e) {
					System.err.println("Error: " + e.getMessage());
				}
				break;

			case MOSTRAR_FUT_CON_ID:
				try {
					mostrarFutConId();
				} catch (Exception e) {
					System.err.println("Error: " + e.getMessage());
				}
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

			case ORDENAR_LISTA_ALF:
				ordenarListaAlfabeticamente();
				break;

			case SALIR:
				isContinuar = false;
				break;

			default:
				System.err.println("Opción incorrecta");
				break;
			}
		}
		sc.close();

		System.out.println("----------------¡Adiós!----------------");
	}

	/**
	 * Muestra el futbolista con cierto Id
	 * 
	 * @throws Exception
	 */
	private static void mostrarFutConId() throws Exception {

		int id = 0;
		Futbolista futConId;

		System.out.println("Introduce un id");

		try {

			id = Integer.parseInt(sc.nextLine());
			futConId = dao.getFutbolista(id);

			if (futConId == null) {
				System.out.println("No se ha encontrado un futbolista con dicho id");
			} else {
				System.out.printf("El futbolista con id=%s es:\n----------------------------------\n", id);
				System.out.println(futConId);
			}

		} catch (NumberFormatException e) {

			throw new Exception("Debes introducir un número");
		}
	}

	/**
	 * Ordena la lista alfabéticamente en orden ascendente
	 */
	private static void ordenarListaAlfabeticamente() {
		dao.ordenarArray();
	}

	/**
	 * Lista los jugadores que sean mayor o menor de una edad que da el usuario.
	 * 
	 * @throws Exception
	 */
	private static void listarMayorOMenorDeEdad() throws Exception {
		System.out.println("Introduce una edad");

		int edad = 0;
		String mayMen = "";
		ArrayList<Futbolista> arrayFutOrdenadoPorEdad = new ArrayList<Futbolista>();

		try {

			edad = Integer.parseInt(sc.nextLine());
			System.out.printf("Introduce si debe buscar jugadores mayores o menores a %s (< = menor, > = mayor)\n",
					edad);
			mayMen = sc.nextLine();
			arrayFutOrdenadoPorEdad = dao.getFutbolistaMayorMenorEdad(edad, mayMen);

			if (arrayFutOrdenadoPorEdad == null) {
				System.out.println("No se ha encontrado ningún resultado");
			} else {
				arrayFutOrdenadoPorEdad = dao.ordenarPorEdad(arrayFutOrdenadoPorEdad);
				for (Futbolista fut : arrayFutOrdenadoPorEdad) {
					System.out.println(fut);
				}
			}
		} catch (NumberFormatException e) {
			throw new Exception("No has introducido un número");
		}
	}

	/**
	 * Lista los jugadores de cierta nacionalidad
	 */
	private static void listarPorNacionalidad() {
		System.out.println("Introduce una nacionalidad");

		String nac = sc.nextLine();
		ArrayList<Futbolista> futsNacion = dao.getFutbolistaNacionalidad(nac);

		if (futsNacion.size() == 0) {
			System.out.println("No se ha encontrado a ningún jugador con dicha nacionalidad");
		} else {
			for (Futbolista futbolista : futsNacion) {
				System.out.println(futbolista);
			}
		}
	}

	/**
	 * Borra un futbolista de la lista. Busca en base a su nombre, te salen todos
	 * los que contienen el parámetro de búsqueda. Después eliges de todos los que
	 * coinciden y el seleccionado se borra.
	 * 
	 * @throws Exception
	 */
	private static void eliminar() throws Exception {
		System.out.println("Introduce el nombre del futbolista");

		String busqueda = sc.nextLine();
		ArrayList<Futbolista> futCoinciden = new ArrayList<Futbolista>();
		int futElegido = 0; // Opción elegida entre los jugadores que coincidían
		futElegido = 0;
		Futbolista futSeleccionado = new Futbolista();
		String siNo = "";

		// Busca los futbolistas cuyos nombre contienen el String de búsqueda
		futCoinciden = dao.buscarFutbolistaPorNombre(busqueda);

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
				futElegido = Integer.parseInt(sc.nextLine());
				/*
				 * Aquí eliges qué futbolista eliges de los que contienen el parámetro de
				 * búsqueda. El número debe estar entre el 1 y el tamaño del array (ambos
				 * incluidos), ya que en el bucle anterior va listando de 1 al size() del array.
				 */
				if (futElegido < 1 || futElegido > futCoinciden.size()) {

					throw new Exception(
							String.format("El número que has introducido no está en el rango indicado: %s y %s",
									MIN_MODIFICAR, futCoinciden.size()));
				} else {
					futSeleccionado = futCoinciden.get(futElegido - 1);

					System.out.printf("¿Quieres borrar a %s de la lista? (S/N)\n", futSeleccionado.getNombre());
					siNo = sc.nextLine();

					if (siNo.equalsIgnoreCase("s")) {
						dao.borrarFutbolista(futSeleccionado.getId());
						futs = dao.listar();
					}
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
		int futElegido = 0; // Opción elegida entre los jugadores que coincidían
		Futbolista futSeleccionado = new Futbolista();
		int campoAModificar = 0; // Variable que identifica el campo a modificar

		// Busca los futbolistas cuyos nombre contienen el String de búsqueda
		futCoinciden = dao.buscarFutbolistaPorNombre(busqueda);

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
					futSeleccionado = futCoinciden.get(futElegido - 1);

					System.out.printf("El futbolista seleccionado es %s\n", futSeleccionado.getNombre());
					System.out.println("_______________________________________");

					do {
						System.out.println("Selecciona el campo a modificar");
						System.out.println("_______________________________________");
						System.out.println("1.- Nombre");
						System.out.println("2.- Edad");
						System.out.println("3.- Altura");
						System.out.println("4.- Nacionalidad");
						System.out.println("5.- Equipo");
						System.out.println("6.- Terminar de modificar");
						System.out.println("_______________________________________");
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

						dao.modificarFutbolista(futSeleccionado);
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
	 * 
	 * @throws Exception
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

			dao.nuevoFutbolista(fut);
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
		System.out.println("_______________________________________");
		System.out.println("1.- Listar futbolistas");
		System.out.println("2.- Mostrar futbolistas de una nacionalidad");
		System.out.println("3.- Mostrar futbolistas con edad mayor/menor de X años");
		System.out.println("4.- Mostrar futbolista con id X");
		System.out.println("5.- Añadir un futbolista");
		System.out.println("6.- Modificar un futbolista");
		System.out.println("7.- Eliminar un futbolista");
		System.out.println("8.- Ordenar lista alfabéticamente");
		System.out.println("9.- Salir");
		System.out.println("_______________________________________");

		opt = sc.nextLine();
	}

	/**
	 * Método para inicializar la lista de futbolistas
	 * 
	 * @throws Exception
	 */
	private static void inicializarLista() throws Exception {
		futs = dao.listar();
	}

}
