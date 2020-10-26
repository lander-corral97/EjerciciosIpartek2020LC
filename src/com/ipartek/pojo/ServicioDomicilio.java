package com.ipartek.pojo;

/**
 * Clase para representar Servicios a domicilio<br>
 * Esta clase hereda de <b><code>Servicio</code></b><br>
 * Además tendrá los siguientes atributos adicionales
 * <ul>
 * <li>gastoAdicional: <code>float</code></li>
 * </ul>
 * 
 * @author LANDER
 *
 */
public class ServicioDomicilio extends Servicio {

	private float gastoAdicional;

	public ServicioDomicilio() {
		super();
		this.gastoAdicional = 0f;
	}

	public ServicioDomicilio(String codigo, float precio, int minimoHoras, float gastoAdicional) {
		super(codigo, precio, minimoHoras);
		this.gastoAdicional = gastoAdicional;
	}

	public float getGastoAdicional() {
		return gastoAdicional;
	}

	public void setGastoAdicional(float gastoAdicional) {
		this.gastoAdicional = gastoAdicional;
	}

	@Override
	public String toString() {
		return super.toString() + " ServicioDomicilio [gastoAdicional=" + gastoAdicional + "]";
	}

}
