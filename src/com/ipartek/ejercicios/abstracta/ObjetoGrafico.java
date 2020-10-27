package com.ipartek.ejercicios.abstracta;

/**
 * Clase para identificar un objeto gráfico Tiene los siguientes atributos:
 * <ul>
 * <li>x: <code>int</code></li>
 * <li>y: <code>int</code></li>
 * </ul>
 * 
 * @author LANDER
 *
 */
public abstract class ObjetoGrafico {

	// Posición x e y del objeto gráfico
	int x;
	int y;

	/**
	 * Todos los objetos gráficos que hereden se moveran igual
	 * 
	 * @param x Nueva posición x
	 * @param y Nueva posición y
	 */
	public void mover(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Todavía no sé cómo lo van a hacer mis hijos, pero les voy a obligar<br>
	 * Por ello declaramos <code>abstract</code> el método y la clase.
	 */
	public abstract void dibujar();

}
