package com.ipartek.ejercicios.herencia;

import java.util.ArrayList;

import com.ipartek.pojo.Electrodomestico;
import com.ipartek.pojo.Television;
import com.ipartek.pojo.TelevisionPlana;

/**
 * Creamos 3 objetos Electrodomestico, Television y TelevisionPlana. <br>
 * Una vez creados guardarlos en un {@code ArrayList<Electrodomestico>} el cual
 * debeis recorrer con un foreach para: <br>
 * mostrar uno a uno todos los atributos de cada instancia dentro del Array
 * usando los getters. <br>
 * usar <b>instanceof</b> para determinar cada objeto a que tipo de clase
 * pertenece. *
 * 
 * @author ur00
 *
 */
public class EjercicioElectrodomesticos {

	public static void main(String[] args) {
		ArrayList<Electrodomestico> elecs = new ArrayList<Electrodomestico>();

		Electrodomestico elec = new Electrodomestico();
		elec.setNombre("Lavadora Balay");
		elec.setPrecio(300);
		elecs.add(elec);

		Television tv = new Television();
		tv.setNombre("Telefunken");
		tv.setPrecio(400);
		tv.setPulgadas(30);
		elecs.add(tv);

		TelevisionPlana tp = new TelevisionPlana();
		tp.setNombre("LG");
		tp.setPrecio(600);
		tp.setPulgadas(100);
		tp.setTipo("XL");
		elecs.add(tp);

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
