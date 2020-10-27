package com.ipartek.ejercicios.abstracta;

/**
 * Clase para identificar un objeto gr�fico Tiene los siguientes atributos:
 * <ul>
 * <li>x: <code>int</code></li>
 * <li>y: <code>int</code></li>
 * </ul>
 * 
 * @author LANDER
 *
 */
public abstract class ObjetoGrafico {

	// Posici�n x e y del objeto gr�fico
	int x;
	int y;

	/**
	 * Todos los objetos gr�ficos que hereden se moveran igual
	 * 
	 * @param x Nueva posici�n x
	 * @param y Nueva posici�n y
	 */
	public void mover(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Todav�a no s� c�mo lo van a hacer mis hijos, pero les voy a obligar<br>
	 * Por ello declaramos <code>abstract</code> el m�todo y la clase.
	 */
	public abstract void dibujar();

}
