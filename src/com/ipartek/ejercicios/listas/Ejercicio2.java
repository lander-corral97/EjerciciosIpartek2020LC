package com.ipartek.ejercicios.listas;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Jugador;

/**
 * Crear una lista de jugadores de futbol. En dicha lista se guardaran objetos
 * de la clase Jugador, que tendrá los atributos nombre, de tipo Sting y dorsal
 * de tipo int.<br>
 * Solicitar los datos de los jugadores por teclado, y una vez introducido el
 * primero, se insertara en la lista y se preguntara si se desea introducir otro
 * más, para lo cual el usuario escribirá S o N. En caso afirmativo se volverá a
 * pedir otro más, hasta que el usuario escriba N
 * 
 * @version 1.0
 * @author LANDER
 *
 */

public class Ejercicio2 {

	public static void main(String[] args) {

		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		Scanner sc = new Scanner(System.in);
		boolean isContinuar = true;
		String siNo = "";

		do {

			try {
				Jugador j = new Jugador();
				System.out.println("Introduce un nombre");
				j.setNombre(sc.nextLine());
				System.out.println("Introduce su dorsal");
				j.setDorsal(Integer.parseInt(sc.nextLine()));
				jugadores.add(j);
			} catch (NumberFormatException e) {
				System.err.println("Error: Debes introducir un número para el dorsal.");
			} catch (Exception e) {
				System.err.println("Error: Ha ocurrido un error");
			}

			System.out.println("¿Quieres continuar? (S/N)");
			siNo = sc.nextLine();
			if ("n".equalsIgnoreCase(siNo)) {
				isContinuar = false;
			}
		} while (isContinuar);

		for (Jugador jugador : jugadores) {
			System.out.println(jugador);
		}

		sc.close();
	}

}
