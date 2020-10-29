package com.ipartek.ejercicios.listas;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Impresora;

public class Ejercicio3 {

	private static final int IMP_A_RELLENAR = 3;
	private static final String TRUE = "S";
	private static final String FALSE = "N";

	public static void main(String[] args) {
		ArrayList<Impresora> impresoras = new ArrayList<Impresora>();
		Scanner sc = new Scanner(System.in);
		String siNo = "";
		int nivelTinta = 0;

		for (int i = 0; i < IMP_A_RELLENAR; i++) {

			Impresora imp = new Impresora() {
			};

			try {

				System.out.println("Número de hojas restantes");
				imp.setNumHojas(Integer.parseInt(sc.nextLine()));

				System.out.println("Nivel de tinta restante");
				nivelTinta = Integer.parseInt(sc.nextLine());
				if (nivelTinta >= 0 && nivelTinta <= 100) {
					imp.setNivelTinta(nivelTinta);
				} else {
					throw new Exception("El nivel de tinta es un porcentaje, por lo tanto, va entre 0 y 100");
				}

				System.out.println("¿Es Láser? (S/N)");
				siNo = sc.nextLine().toUpperCase();
				if (!TRUE.equals(siNo) && !FALSE.equals(siNo)) {
					throw new Exception("Sólo puedes meter S o N");
				} else {
					imp.setLaser(TRUE.equals(siNo) ? true : false);
				}

				impresoras.add(imp);
			} catch (NumberFormatException e) {
				System.err.println("Error: No has introducido un número");
				i--;
			} catch (Exception e) {
				System.err.println("Error: " + e.getMessage());
				i--;
			}

			sc.close();
		}

		for (Impresora impresora : impresoras) {
			System.out.println(impresora);
		}
	}
}
