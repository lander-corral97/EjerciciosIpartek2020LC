package com.ipartek.sqlite3;

import com.ipartek.modelo.PerroDAOSqlite;
import com.ipartek.pojo.Perro;

public class EjercicioPerro {

	public static void main(String[] args) {
		PerroDAOSqlite dao = new PerroDAOSqlite();

		for (Perro p : dao.listar()) {
			System.out.println(p);
		}

		System.out.println();

		System.out.println(dao.recuperar(1));
		System.out.println(dao.recuperar(99));

		Perro pNuevo = new Perro("Luk", "Nuse", 45.0f);
		try {
			dao.crear(pNuevo);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
