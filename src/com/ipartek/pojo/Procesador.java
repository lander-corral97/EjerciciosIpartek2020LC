package com.ipartek.pojo;

/**
 * Clase para representar procesadores<br>
 * Esta clase hereda de <b><code>Producto</code></b><br>
 * Además tendrá los siguientes atributos adicionales
 * <ul>
 * <li>modelo: <code>String</code></li>
 * <li>velocidad: <code>int</code></li>
 * </ul>
 * 
 * @author LANDER
 *
 */
public class Procesador extends Producto {

	private String modelo;
	private int velocidad;

	public Procesador() {
		super();
		this.modelo = "";
		this.velocidad = 0;
	}

	public Procesador(String referencia, float precio, String modelo, int velocidad) {
		super(referencia, precio);
		this.modelo = modelo;
		this.velocidad = velocidad;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public String toString() {
		return super.toString() + " Procesador [modelo=" + modelo + ", velocidad=" + velocidad + "]";
	}

}
