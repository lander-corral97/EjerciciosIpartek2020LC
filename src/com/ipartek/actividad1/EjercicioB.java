package com.ipartek.actividad1;

import java.util.Scanner;

/**
 * 
 * Crear un proyecto en modo consola que nos muestre un menú de 3 opciones
 * <ul>
 * <li>Calcular la letra del dni</li>
 * <li>Calcular medida de cm a pulgadas</li>
 * <li>Salir</li>
 * </ul>
 * Hacer que dicho menú se ejecute en bucle hasta que se pulse salir, y si el
 * usuario escoge cada una de las funciones, que permita introducir los datos
 * correspondientes por teclado para poder dar el resultado
 * 
 * @version 1.0
 * @author LANDER
 *
 */

public class EjercicioB {

	// Opciones de menú
	static final private String CALCULAR_LETRA_DNI = "1";
	static final private String CONVERSION_CM_PULGADAS = "2";
	static final private String SALIR = "3";

	// Letras en orden para el DNI
	static final private String LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";

	// Constante para convertir cm en pulgadas
	static final private float CONV_PULGADAS = 2.54f;

	static String opc = "";
	static Scanner sc = null;
	static boolean isContinuar = true;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		do {
			pintarMenu();

			switch (opc) {
			case CALCULAR_LETRA_DNI:
				try {
					calcularLetraDni();
				} catch (Exception e) {
					System.err.println("Error: " + e.getMessage());
				}
				break;

			case CONVERSION_CM_PULGADAS:
				try {
					convertirCmPulgadas();
				} catch (Exception e) {
					System.err.println("Error: " + e.getMessage());
				}
				break;

			case SALIR:
				System.out.println("¡Hasta Luego!");
				isContinuar = false;
				break;

			default:
				System.err.println("Error: No ha introducido una opción correcta");
				break;

			}
		} while (isContinuar);

		sc.close();
	}

	/**
	 * Transforma los centímetros a pulgadas
	 * 
	 * @throws Exception
	 */
	private static void convertirCmPulgadas() throws Exception {

		System.out.println("Introduce los cm a convertir");

		int cm = 0;

		try {

			cm = Integer.parseInt(sc.nextLine());
			System.out.printf("%s cm en pulgadas es %.2f\n\n", cm, cm / CONV_PULGADAS);

		} catch (NumberFormatException e) {

			throw new Exception("Sólo puedes meter números");

		} catch (Exception e) {

			throw new Exception("Ha ocurrido un error");

		}

	}

	/**
	 * Calcula la letra del DNI en base al número dado
	 * 
	 * @throws Exception
	 */
	private static void calcularLetraDni() throws Exception {

		System.out.println("Introduce el número de DNI");

		String numDniString = "";
		numDniString = sc.nextLine();
		char letra = ' ';
		int numDni = 0;

		if (numDniString == null) {
			throw new Exception("El DNI no puede ser null");
		}

		if (numDniString.length() != 8) {
			throw new Exception("El DNI debe tener 8 caracteres");
		}

		try {

			numDni = Integer.parseInt(numDniString);
			letra = LETRAS_DNI.charAt(numDni % 23); // Se escoge la letra en la posición numDni % 23
			System.out.printf("Su DNI completo es: %s\n\n", numDniString + letra);

		} catch (NumberFormatException e) {

			throw new Exception("Los datos introducidos deben ser números");

		} catch (Exception e) {

			throw new Exception("Ha ocurrido un error");

		}

	}

	/**
	 * Pinta el menú con sus opciones para que se vea en consola.
	 */
	private static void pintarMenu() {

		System.out.println("Elige una opción");
		System.out.println("---------------------------");
		System.out.println("1.- Calcular letra del DNI");
		System.out.println("2.- Convertir cm en pulgada");
		System.out.println("3.- Salir");
		System.out.println("---------------------------");

		opc = sc.nextLine();
	}

}
