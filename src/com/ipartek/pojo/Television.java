package com.ipartek.pojo;

/**
 * Clase para representar a televisiones<br>
 * Hereda de <code><b>Electrodomesticos</b></code><br>
 * Además tiene el siguiente atributo adicional
 * <ul>
 * <li>pulgadas: <code>int</code></li>
 * </ul>
 * 
 * @version 1.0
 * @author LANDER
 *
 */
public class Television extends Electrodomestico {

	private int pulgadas;

	public Television() {
		super();
		this.pulgadas = 0;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	@Override
	public String toString() {
		return super.toString() + " Television [pulgadas=" + pulgadas + "]";
	}

}
