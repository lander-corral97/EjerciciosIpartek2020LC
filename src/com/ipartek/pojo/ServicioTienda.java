package com.ipartek.pojo;

/**
 * Clase para representar Servicios en la tienda<br>
 * Esta clase hereda de <b><code>Servicio</code></b><br>
 * Además tendrá los siguientes atributos adicionales
 * <ul>
 * <li>empleado: <code>String</code></li>
 * </ul>
 * 
 * @author LANDER
 *
 */
public class ServicioTienda extends Servicio {

	private String empleado;

	public ServicioTienda() {
		super();
		this.empleado = "";
	}

	public ServicioTienda(String codigo, float precio, int minimoHoras, String empleado) {
		super(codigo, precio, minimoHoras);
		this.empleado = empleado;
	}

	public String getEmpleado() {
		return empleado;
	}

	public void setEmpleado(String empleado) {
		this.empleado = empleado;
	}

	@Override
	public String toString() {
		return super.toString() + " ServicioTienda [empleado=" + empleado + "]";
	}

}
