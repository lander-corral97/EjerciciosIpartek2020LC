package com.ipartek;

import java.util.Scanner;

import com.ipartek.pojo.Serie;

public class Utilidades implements IFunciones {

	Scanner sc = new Scanner(System.in);

	/**
	 * Calcula la letra del DNI
	 * 
	 * @param numeros String; son los 8 números del DNI
	 * @return Retorna el DNI completo con los números y letra
	 * @throws Exception Si no pasamos como parámetros los 8 números
	 */
	public static String calcularLetraDni(String numeros) throws Exception {
		String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKE";
		if (numeros == null) {
			throw new Exception("No puede ser null");
		}
		if (numeros.length() != 8) {
			throw new Exception("El DNI debe tener 8 números");
		}
		try {
			int numerosInt = Integer.parseInt(numeros);
			numeros += letrasDni.charAt(numerosInt % 23);
		} catch (NumberFormatException e) {
			throw new Exception("No has introducido un número");
		} catch (Exception e) {
			throw new Exception("Ha habido un error");
		}
		return numeros;
	}

	@Override
	public String pedirNombre() throws Exception {
		String nombre = "";

		System.out.println("Introduce tu nombre");
		nombre = sc.nextLine();
		if (nombre.length() < 1) {
			throw new Exception("El nombre debe tener al menos una letra");
		}
		for (int i = 0; i < nombre.length(); i++) {
			if ((Character.isLetter(nombre.charAt(i)) == false)) {
				throw new Exception(String.format(
						"Sólo puedes meter una cadena de letras y se ha encontrado un número en la posición %s",
						i + 1));
			}
		}

		return nombre;
	}

	@Override
	public void imprimirNumeroLoteria(int tipoLoteria) throws Exception {
		switch (tipoLoteria) {
		case LOTERIA_EUROMILLON:
			System.out.println("Euromillón: 05 06 15 37 42 E03 E04");
			break;
		case LOTERIA_BONOLOTO:
			System.out.println("Bonoloto: 01 04 05 16 23 43 C15 R00");
			break;
		case LOTERIA_QUINIELA:
			System.out.println("Quiniela: 2 2 X 1 1 2 1 X 2 X 1 1 2 2 M-0");
			break;
		default:
			throw new Exception("No has introducido ninguna de las opciones");
		}
	}

	@Override
	public float calcularVueltas(float dineroEntregado, float precioProducto) throws Exception {
		if (dineroEntregado < precioProducto) {
			throw new Exception("Debes entregar más dinero que el valor del producto");
		}
		return dineroEntregado - precioProducto;
	}

	@Override
	public Serie pedirDatosPorConsola() {
		System.out.println("Introduce un nombre");
		Serie s = new Serie(sc.nextLine());
		try {
			System.out.println("Introduce el número de temporadas");
			s.setNumTemporadas(Integer.parseInt(sc.nextLine()));
			System.out.println("Introduce la duración (en minutos)");
			s.setDuracion(Integer.parseInt(sc.nextLine()));
			System.out.println("Introduce la plataforma");
			s.setPlataforma(sc.nextLine());
		} catch (NumberFormatException e) {
			s = null;
			System.err.println("Error: Debes introducir un número");
		} catch (Exception e) {
			s = null;
			System.err.println("Error: Ha ocurrido un error");
		}

		return s;
	}

}
