package com.ipartek.pojo;

/**
 * Una clase para representar las televisiones planas<br>
 * Es una clase que hereda de <b><code>Television</b></code> que a su vez hereda
 * de <b><code>Electrodomestico</code></b><br>
 * También tiene el siguiente atributo:
 * <ul>
 * <li>tipo: <code>String</code> (tft, plasma, ...)</li>
 * </ul>
 * 
 * @author LANDER
 *
 */
public class TelevisionPlana extends Television {

	private String tipo;

	public TelevisionPlana() {
		super();
		this.tipo = "";
	}

	public TelevisionPlana(String nombre, float precio, int pulgadas, String tipo) {
		super(nombre, precio, pulgadas);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString() + " TelevisionPlana [tipo=" + tipo + "]";
	}

}
