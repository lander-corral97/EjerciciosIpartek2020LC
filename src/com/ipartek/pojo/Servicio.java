package com.ipartek.pojo;

/**
 * 
 * Clase usada para representar servicios<br>
 * Tendrá los siguientes atributos:
 * <ul>
 * <li>codigo: <code>String</code></li>
 * <li>precio: <code>float</code></li>
 * <li>minimoHoras: <code>int</code></li>
 * </ul>
 * 
 * @author LANDER
 *
 */
public class Servicio {

	private String codigo;
	private float precio;
	private int minimoHoras;

	public Servicio() {
		super();
		this.codigo = "";
		this.precio = 0f;
		this.minimoHoras = 0;
	}

	public Servicio(String codigo, float precio, int minimoHoras) {
		super();
		this.codigo = codigo;
		this.precio = precio;
		this.minimoHoras = minimoHoras;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getMinimoHoras() {
		return minimoHoras;
	}

	public void setMinimoHoras(int minimoHoras) {
		this.minimoHoras = minimoHoras;
	}

	@Override
	public String toString() {
		return "Servicio [codigo=" + codigo + ", precio=" + precio + ", minimoHoras=" + minimoHoras + "]";
	}

}
