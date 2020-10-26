package com.ipartek.pojo;

/**
 * Clase para representar graficas<br>
 * Esta clase hereda de <b><code>Producto</code></b><br>
 * Además tendrá los siguientes atributos adicionales
 * <ul>
 * <li>memoria: <code>int</code></li>
 * <li>conexion: <code>String</code></li>
 * </ul>
 * 
 * @author LANDER
 *
 */
public class Grafica extends Producto {

	private int memoria;
	private String conexion;

	public Grafica() {
		super();
		this.memoria = 0;
		this.conexion = "";
	}

	public Grafica(String referencia, float precio, int memoria, String conexion) {
		super(referencia, precio);
		this.memoria = memoria;
		this.conexion = conexion;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public String getConexion() {
		return conexion;
	}

	public void setConexion(String conexion) {
		this.conexion = conexion;
	}

	@Override
	public String toString() {
		return super.toString() + " Grafica [memoria=" + memoria + ", conexion=" + conexion + "]";
	}

}
