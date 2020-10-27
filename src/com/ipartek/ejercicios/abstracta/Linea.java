package com.ipartek.ejercicios.abstracta;

public class Linea extends ObjetoGrafico {

	int longitud;

	/**
	 * Implementamos el método que el padre ha declarado <code>abstract</code>
	 */
	@Override
	public void dibujar() {
		System.out.println("Dibujamos una línea de longitud " + longitud);
	}

}
