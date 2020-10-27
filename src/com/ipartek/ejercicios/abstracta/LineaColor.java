package com.ipartek.ejercicios.abstracta;

public class LineaColor extends Linea {

	String color;

	@Override
	public void dibujar() {
		System.out.println("El color es " + color);
	}
}
