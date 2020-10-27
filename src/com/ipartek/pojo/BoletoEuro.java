package com.ipartek.pojo;

import java.util.ArrayList;
import java.util.Collections;

public class BoletoEuro {

	private ArrayList<Integer> nums = new ArrayList<Integer>();
	private ArrayList<Integer> estrellas = new ArrayList<Integer>();

	public BoletoEuro() {

		for (int i = 0; i <= 50; i++) {
			nums.add(i);
		}

		for (int i = 1; i <= 12; i++) {
			estrellas.add(i);
		}

		Collections.shuffle(nums);
		Collections.shuffle(estrellas);

	}

	@Override
	public String toString() {
		String mensajeCompleto = "";
		mensajeCompleto += "Números: \n";
		for (int i = 0; i < 5; i++) {
			mensajeCompleto += nums.get(i) + "\n";
		}
		mensajeCompleto += "Estrellas: \n" + estrellas.get(0) + "\n" + estrellas.get(1);
		return mensajeCompleto;
	}

}
