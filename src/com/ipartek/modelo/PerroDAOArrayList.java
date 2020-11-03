package com.ipartek.modelo;

import java.util.ArrayList;

import com.ipartek.pojo.Perro;

public class PerroDAOArrayList implements PerroDAO {

	private ArrayList<Perro> lista = new ArrayList<Perro>();
	private int indice = 0;
	private static PerroDAOArrayList INSTANCE = null;

	private PerroDAOArrayList() {
		super();
		lista.add(new Perro(1, "Bubba"));
		lista.add(new Perro(2, "Laika"));
		lista.add(new Perro(3, "Rintintin"));
		lista.add(new Perro(4, "goffy"));
		indice = 5;

	}

	public static synchronized PerroDAOArrayList getInstance() {

		if (INSTANCE == null) {
			INSTANCE = new PerroDAOArrayList();
		}

		return INSTANCE;
	}

	@Override
	public ArrayList<Perro> listar() {
		return lista;
	}

	@Override
	public Perro recuperar(int id) {
		Perro p = null;
		for (Perro perro : lista) {
			if (perro.getId() == id) {
				p = perro;
			}
		}
		return p;
	}

	@Override
	public Perro crear(Perro p) throws Exception {

		p.setId(indice);
		lista.add(p);
		indice++;

		return p;
	}

	@Override
	public Perro modificar(Perro p) throws Exception {
		int index = -1;

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == p.getId()) {
				index = i;
			}
		}

		if (index == -1) {
			throw new Exception("No se ha encontrado dicho perro");
		} else {
			lista.set(index, p);
		}

		return p;
	}

	@Override
	public boolean eliminar(int id) throws Exception {
		int index = -1;

		for (int i = 0; i < lista.size(); i++) {
			if (id == lista.get(i).getId()) {
				index = i;
			}
		}

		if (index == -1) {
			throw new Exception("No se ha encontrado dicho perro");
		} else {
			lista.remove(index);
			indice--;
		}

		return true;
	}

}
