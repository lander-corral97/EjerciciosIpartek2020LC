package com.ipartek.ejercicios.herencia;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Electrodomestico;
import com.ipartek.pojo.TelevisionPlana;

/**
 * Realizar las siguientes jerarquías de herencia: tendremos una clase padre que
 * se llamara Electrodoméstico. Dicha clase contara con los atributos nombre y
 * precio. Se realizaran todos los constructores, métodos get y set
 * necesarios<br>
 * <br>
 * Una vez creada dicha clase, se creara una serie de clases hijas. La primera
 * será la clase televisor. Dicha clase contara con el atributo pulgadas, así
 * como con todos los constructores y métodos necesarios para rellenar sus
 * atributos, incluidos los del padre<br>
 * <br>
 * También se creara una clase televisionPlana, que heredara de televisión,
 * tendrá el atributo string tipo de pantalla ( tft, plasma,..) y constructores,
 * métodos get y set para rellenar los datos de los objetos que se creen,
 * incluyendo todos los atributos de los objetos de las clases padres de las que
 * heredan<br>
 * <br>
 * Una vez creado esta jerarquía de herencia, realizar un programa que nos pida
 * insertar televisiones planas dentro de un array de electrodomésticos. Dicho
 * array constara de 5 electodomesticos, pero lo rellenaremos con objetos de
 * tipo televisiónPlana.
 * 
 * @author LANDER
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		ArrayList<Electrodomestico> teles = new ArrayList<Electrodomestico>();
		Scanner sc = new Scanner(System.in);

		while (teles.size() < 5) {
			TelevisionPlana tp = new TelevisionPlana();
			System.out.printf("Introduciendo la televisión nº%s...\n", teles.size() + 1);
			try {
				System.out.println("Introduce el nombre de la televisión");
				tp.setNombre(sc.nextLine());
				System.out.println("Introduce su precio");
				tp.setPrecio(Float.parseFloat(sc.nextLine()));
				System.out.println("Introduce las pulgadas");
				tp.setPulgadas(Integer.parseInt(sc.nextLine()));
				System.out.println("Introduce el tipo de televisión plana");
				tp.setTipo(sc.nextLine());
				teles.add(tp);
			} catch (NumberFormatException e) {
				System.err.println("Error: No has introducido un número");
			} catch (Exception e) {
				System.err.println("Error: Ha ocurrido un error");
			}
		}

		for (Electrodomestico tele : teles) {
			System.out.println(tele);
		}

		sc.close();
	}
}
