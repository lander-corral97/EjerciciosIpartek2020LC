package com.ipartek.pojo;

/**
 * Clase para representar los productos. Tendrán los atributos:
 * <ul>
 * <li>referencia: <code>String</code></li>
 * <li>precio: <code>float</code></li>
 * </ul>
 * 
 * @version 1.0
 * @author LANDER
 *
 */
public class Producto {

	private String referencia;
	private float precio;

	public Producto() {
		super();
		this.referencia = "";
		this.precio = 0f;
	}

	public Producto(String referencia, float precio) {
		super();
		this.referencia = referencia;
		this.precio = precio;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [referencia=" + referencia + ", precio=" + precio + "]";
	}

}
