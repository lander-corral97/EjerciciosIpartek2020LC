package com.ipartek.pojo;

/**
 * Clase para representar discos duros<br>
 * Esta clase hereda de <b><code>Producto</code></b><br>
 * Además tendrá los siguientes atributos adicionales
 * <ul>
 * <li>capacidad: <code>int</code></li>
 * <li>velocidad: <code>int</code></li>
 * <li>isSSD: <code>boolean</code></li>
 * </ul>
 * 
 * @author LANDER
 *
 */
public class DiscoDuro extends Producto {

	private int capacidad;
	private int velocidad;
	private boolean isSSD;

	public DiscoDuro() {
		super();
		this.capacidad = 0;
		this.velocidad = 0;
		this.isSSD = true;
	}

	public DiscoDuro(String referencia, float precio, int capacidad, int velocidad, boolean isSSD) {
		super(referencia, precio);
		this.capacidad = capacidad;
		this.velocidad = velocidad;
		this.isSSD = isSSD;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public boolean isSSD() {
		return isSSD;
	}

	public void setSSD(boolean isSSD) {
		this.isSSD = isSSD;
	}

	@Override
	public String toString() {
		return super.toString() + " DiscoDuro [capacidad=" + capacidad + ", velocidad=" + velocidad + ", isSSD=" + isSSD
				+ "]";
	}

}
