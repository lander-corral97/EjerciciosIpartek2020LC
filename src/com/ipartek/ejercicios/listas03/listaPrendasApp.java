package com.ipartek.ejercicios.listas03;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Scanner;

public class listaPrendasApp {

	private static final String SI = "SI";
	private static final String NO = "NO";

	private static final double MAYOR_DE_180 = 0.8;
	private static final double MAYOR_DE_120 = 0.9;

	private static ArrayList<PrendaVestir> prendas = new ArrayList<PrendaVestir>();
	private static String siNo = "";
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Por si acaso alguien pone el "sí" con acento
		Collator col = Collator.getInstance();
		double total = 0;

		col.setStrength(Collator.NO_DECOMPOSITION);

		do {
			System.out.println("¿Quieres meter una prenda? (Si/No)");
			siNo = sc.nextLine().toUpperCase();
			if (col.compare(siNo, SI) == 0) {
				siNo = SI;
			}
			switch (siNo) {
			case SI:
				try {
					crearNuevaPrenda();
				} catch (Exception e) {
					System.err.println("Error: " + e.getMessage());
				}
				break;
			case NO:
				break;
			default:
				System.err.println("Has introducido una opción incorrecta");
				prendas.clear();
				break;
			}
		} while (SI.equals(siNo));
		if (NO.equals(siNo)) {
			while (NO.equals(siNo) && prendas.size() > 0) {
				System.out.println("Cantidad de productos: " + prendas.size());
				for (int i = 0; i < prendas.size(); i++) {
					System.out.println((i + 1) + ". " + prendas.get(i));
					total += prendas.get(i).getPrecio();
				}
				System.out.printf("Total %s: %.2f€\n",
						total > 180 ? "(descuento del 20% aplicado)"
								: (total > 120 ? "(descuento del 10% aplicado)" : ""),
						total > 180 ? total * MAYOR_DE_180 : (total > 120 ? total * MAYOR_DE_120 : total));
				total = 0;

				System.out.println("¿Está todo correcto? (Si/No)");

				siNo = sc.nextLine().toUpperCase();
				if (col.compare(siNo, SI) == 0) {
					siNo = SI;
				}
				switch (siNo) {
				case SI:
					break;
				case NO:
					try {
						borrarPrendaIncorrecta();
					} catch (Exception e) {
						System.err.println("Error: " + e.getMessage());
					}
					break;
				default:
					System.err.println("Has introducido una opción incorrecta");
					prendas.clear();
					break;
				}
			}

			System.out.println("Cantidad de productos: " + prendas.size());
			for (int i = 0; i < prendas.size(); i++) {
				System.out.println((i + 1) + ". " + prendas.get(i));
				total += prendas.get(i).getPrecio();
			}
			System.out.printf("Total %s: %.2f€\n",
					total > 180 ? "(descuento del 20% aplicado)" : (total > 120 ? "(descuento del 10% aplicado)" : ""),
					total > 180 ? total * MAYOR_DE_180 : (total > 120 ? total * MAYOR_DE_120 : total));
		}
	}

	/**
	 * Borra la prenda seleccionada
	 * 
	 * @throws Exception Si no se introduce un número
	 */
	private static void borrarPrendaIncorrecta() throws Exception {
		System.out.printf("¿Cuál es la prenda incorrecta? (Mirar arriba del 1 al %s)\n", prendas.size());
		try {
			prendas.remove(Integer.parseInt(sc.nextLine()) - 1);
		} catch (NumberFormatException e) {
			throw new Exception("No has introducido un número");
		} catch (IndexOutOfBoundsException e) {
			throw new Exception(String.format("Has metido un número que no está entre 1 y %s", prendas.size()));
		} catch (Exception e) {
			throw new Exception("Ha ocurrido un error");
		}
	}

	/**
	 * Crea una nueva prenda y la añade a la lista de prendas
	 * 
	 * @throws Exception Si no se introduce un número
	 */
	private static void crearNuevaPrenda() throws Exception {
		PrendaVestir pv = new PrendaVestir();

		try {
			System.out.println("Introduce un nombre");
			pv.setNombre(sc.nextLine());
			System.out.println("Introduce una talla");
			pv.setTalla(Integer.parseInt(sc.nextLine()));
			System.out.println("Introduce un precio");
			pv.setPrecio(Double.parseDouble(sc.nextLine()));
		} catch (NumberFormatException e) {
			throw new Exception("No has introducido un número");
		} catch (Exception e) {
			throw new Exception("Ha ocurrido un error");
		}

		prendas.add(pv);
	}

}
