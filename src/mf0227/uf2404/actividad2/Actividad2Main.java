package mf0227.uf2404.actividad2;

import java.util.ArrayList;
import java.util.Scanner;

import mf0227.uf2404.actividad2.pojo.Coche;

/**
 * Clase principal. Guardamos los datos en un ArrayList y luego los mostramos.
 * 
 * @version 1.0
 * @author Lander Corral
 *
 */
public class Actividad2Main {

	private static final String SI = "S";
	private static final String NO = "N";

	private static ArrayList<Coche> coches = new ArrayList<Coche>();
	private static Scanner sc = new Scanner(System.in);
	private static String siNo = "";

	public static void main(String[] args) {

		do {
			siNo = "";
			System.out.println("*******INTRODUCIENDO NUEVO COCHE*******");

			try {
				crearCoche();
			} catch (Exception e) {
				System.err.println("Error: " + e.getMessage());
			}

			while (!SI.equals(siNo) && !NO.equals(siNo)) {

				System.out.println("¿Quieres seguir añadiendo coches? (S/N)");
				siNo = sc.nextLine().toUpperCase();

				if (!SI.equals(siNo) && !NO.equals(siNo)) {
					System.err.println("Opción incorrecta");
				}

			}
		} while (!NO.equals(siNo));

		for (Coche coche : coches) {
			System.out.println(coche);
		}

		sc.close();
	}

	/**
	 * Método para crear un coche y meterlo en el <code>ArrayList</code>
	 * 
	 * @throws Exception Si no se mete un número cuando se pide (Potencia y
	 *                   Cilindrada)
	 */
	private static void crearCoche() throws Exception {
		Coche c = new Coche();

		try {
			System.out.println("Introduce el color");
			c.setColor(sc.nextLine());
			System.out.println("Introduce la matrícula");
			c.setMatricula(sc.nextLine());
			System.out.println("Introduce la marca");
			c.setMarca(sc.nextLine());
			System.out.println("Introduce el modelo");
			c.setModelo(sc.nextLine());
			System.out.println("Introduce la potencia (en caballos)");
			c.setPotencia(Integer.parseInt(sc.nextLine()));
			System.out.println("Introduce la cilindrada (en cc)");
			c.setCilindrada(Integer.parseInt(sc.nextLine()));

			coches.add(c);
		} catch (NumberFormatException e) {
			throw new Exception("No has introducido un número");
		} catch (Exception e) {
			throw new Exception("Ha ocurrido un error");
		}
	}

}
