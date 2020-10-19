package com.ipartek.ejercicio.excepciones;

import java.util.Scanner;

/**
 * Realice un método que reciba como argumento un String y un número y muestre
 * la letra de la posición indicada. Llámelo pasando como parámetro un String
 * sin inicializar. Dicha llamada se encontrara dentro de un bloque try catch,
 * que en caso de producirse una excepción por un paso de parámetros a null, no
 * acabe con la ejecución del programa. <br/>
 * Así mismo, se controlara también que si el numero pasado es mayor que el
 * tamaño del string, capturara el error y nos solicitara meter un numero
 * valido, indicándonos los valores en los que puede estar comprendido (para
 * este apartado se le pasa como string la cadena de texto “La lluvia en Sevilla
 * no es una maravilla”)
 * 
 * @version 1.0
 * @author LANDER
 *
 */

public class Ejercicio3 {

	static char letraMensaje(String mensaje, int pos) throws Exception {
		try {
			return mensaje.charAt(pos - 1);
		} catch (StringIndexOutOfBoundsException e) {
			throw new Exception("El número que has dado es mayor al número de caracteres del mensaje");
		}
	}

	public static void main(String[] args) {
		String mensaje;
		int pos;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un mensaje");
		mensaje = sc.nextLine();
		try {
			System.out.println("Introduce un número (del 1 al nº máximo de caracteres de tu mensaje)");
			pos = Integer.parseInt(sc.nextLine());
			System.out.printf("Cogeremos el caracter en la posición %s...\n", pos);
			System.out.printf("La letra en la posición %s es %s", pos, letraMensaje(mensaje, pos));
		} catch (NumberFormatException e) {
			System.out.println("No has introducido un número");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
