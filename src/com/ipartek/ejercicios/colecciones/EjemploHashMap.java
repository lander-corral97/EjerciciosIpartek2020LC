package com.ipartek.ejercicios.colecciones;

import java.util.HashMap;
import java.util.Iterator;

import com.ipartek.pojo.Perro;

public class EjemploHashMap {

	public static void main(String[] args) {
		// Definir un HashMap
		HashMap<String, String> global = new HashMap<String, String>();

		// Insertar valores "key"-"value" al HashMap
		global.put("Laura", "667895789");
		global.put("Pepe", "645895756");
		global.put("Abelardo", "55895711");
		global.put("Daniel", "667111788");
		global.put("Arturo", "667598623");

		// probar a meter un duplicado
		global.put("Arturo", "666555444");

		/*
		 * // recuperar el value por la Key String telefonoPepe = global.get("Pepe");
		 * System.out.println(telefonoPepe);
		 * 
		 * // obtener todas las Keys Set<String> keys = global.keySet();
		 * System.out.println(keys);
		 * 
		 * // obtener todos los values Collection<String> values = global.values();
		 * System.out.println(values);
		 */

		// Definir Iterator para extraer o imprimir valores
		for (Iterator<String> it = global.keySet().iterator(); it.hasNext();) {
			String key = (String) it.next();
			String value = (String) global.get(key);
			System.out.println("Alumno: " + key + " - " + "Telefono: " + value);
		}

		// definir una hashamp con perros la key será su id(int) y el value(Perro)
		HashMap<Integer, Perro> hmPerros = new HashMap<Integer, Perro>();

		// meter 2 perros
		Perro p1 = new Perro("Luk", "Labrador", 26);
		p1.setId(1);
		Perro p2 = new Perro("León", "Mastín del Pirineo", 35);
		p2.setId(2);
		Perro p3 = new Perro("Pancho", "Chichuahua", 12);
		p3.setId(3);

		hmPerros.put(p1.getId(), p1);
		hmPerros.put(p2.getId(), p2);
		hmPerros.put(p3.getId(), p3);

		// recorrer con un Iterator

		for (Iterator<Integer> iterator = hmPerros.keySet().iterator(); iterator.hasNext();) {
			int key = iterator.next();
			Perro perro = (Perro) hmPerros.get(key);
			System.out.println("Id: " + key + "| Perro: Nombre - " + perro.getNombre() + ", Peso - " + perro.getPeso()
					+ "kg, Raza: " + perro.getRaza());
		}

	}

}
