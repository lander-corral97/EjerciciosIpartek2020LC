package com.ipartek.ejercicios.herencia;

import com.ipartek.pojo.Estudiante;
import com.ipartek.pojo.Persona;
import com.ipartek.pojo.Profesor;

public class EjercicioHerencia {

	public static void main(String[] args) throws Exception {

		Persona p = new Persona();
		Estudiante estudiante = new Estudiante();
		Profesor pr = new Profesor();

		p.setEdad(18);
		p.setNombre("Pepe");

		estudiante.setEdad(18);
		estudiante.setNombre("Pepe");
		estudiante.setNotaMedia(8.5f);

		pr.setEdad(77);
		pr.setNombre("Bacterio");
		pr.setAsignatura("Ciencia Avanzada");
	}

}
