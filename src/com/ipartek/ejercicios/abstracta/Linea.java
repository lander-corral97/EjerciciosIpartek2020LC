package com.ipartek.ejercicios.abstracta;

public class Linea extends ObjetoGrafico {

	int longitud;

	/**
	 * Implementamos el m�todo que el padre ha declarado <code>abstract</code>
	 */
	@Override
	public void dibujar() {
		System.out.println("Dibujamos una l�nea de longitud " + longitud);
	}

}
