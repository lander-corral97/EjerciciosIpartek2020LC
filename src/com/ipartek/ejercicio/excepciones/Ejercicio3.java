package com.ipartek.ejercicio.excepciones;

import java.util.Scanner;

/**
 * Realice un m�todo que reciba como argumento un String y un n�mero y muestre
 * la letra de la posici�n indicada. Ll�melo pasando como par�metro un String
 * sin inicializar. Dicha llamada se encontrara dentro de un bloque try catch,
 * que en caso de producirse una excepci�n por un paso de par�metros a null, no
 * acabe con la ejecuci�n del programa. <br/>
 * As� mismo, se controlara tambi�n que si el numero pasado es mayor que el
 * tama�o del string, capturara el error y nos solicitara meter un numero
 * valido, indic�ndonos los valores en los que puede estar comprendido (para
 * este apartado se le pasa como string la cadena de texto �La lluvia en Sevilla
 * no es una maravilla�)
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
			throw new Exception("El n�mero que has dado es mayor al n�mero de caracteres del mensaje");
		}
	}

	public static void main(String[] args) {
		String mensaje;
		int pos;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un mensaje");
		mensaje = sc.nextLine();
		try {
			System.out.println("Introduce un n�mero (del 1 al n� m�ximo de caracteres de tu mensaje)");
			pos = Integer.parseInt(sc.nextLine());
			System.out.printf("Cogeremos el caracter en la posici�n %s...\n", pos);
			System.out.printf("La letra en la posici�n %s es %s", pos, letraMensaje(mensaje, pos));
		} catch (NumberFormatException e) {
			System.out.println("No has introducido un n�mero");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
