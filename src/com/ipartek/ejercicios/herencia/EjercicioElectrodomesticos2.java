package com.ipartek.ejercicios.herencia;

import java.util.ArrayList;

import com.ipartek.pojo.Electrodomestico;
import com.ipartek.pojo.Television;
import com.ipartek.pojo.TelevisionPlana;

/**
 * Realizar el mismo ejercicio que en EjecicioElectrodomesticos, pero esta vez
 * hay que crear nuevos constructores para poder crear instancias con todos los
 * atributos.<br>
 * por ejemplo: <br>
 * 
 * <pre>
 *   
 *      TelevisionPlana tv = new TelevisionPlana("tele", 300, .., ..  );
 * </pre>
 * 
 * @author ur00
 *
 */
public class EjercicioElectrodomesticos2 {

	public static void main(String[] args) {
		ArrayList<Electrodomestico> elecs = new ArrayList<Electrodomestico>();

		elecs.add(new Electrodomestico("Lavadora Balay", 300));
		elecs.add(new Television("Telefunken", 400, 30));
		elecs.add(new TelevisionPlana("LG", 600, 100, "XL"));

		for (Electrodomestico electrodomestico : elecs) {
			System.out.println("____________________________________");
			System.out.println(electrodomestico.getNombre());
			System.out.println(electrodomestico.getPrecio());
			if (electrodomestico instanceof Television) {
				System.out.println(((Television) electrodomestico).getPulgadas());
			}
			if (electrodomestico instanceof TelevisionPlana) {
				System.out.println(((TelevisionPlana) electrodomestico).getTipo());
			}
		}
		System.out.println("____________________________________");
	}

}
