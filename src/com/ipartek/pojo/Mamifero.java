package com.ipartek.pojo;

import javax.swing.JOptionPane;

public class Mamifero {

	private int patas;
	private String nombre;

	public void imprimirPatas() {
		JOptionPane.showMessageDialog(null, "Tiene " + patas + " patas \n", nombre, JOptionPane.INFORMATION_MESSAGE);
	}

	public Mamifero(String nombre, int patas) {
		this.nombre = nombre;
		this.patas = patas;
	}

}
