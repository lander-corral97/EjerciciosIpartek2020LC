package com.ipartek.pojo;

/**
 * Clase para representar cartas para el ejercicio 4.
 * 
 * Tiene:
 * <ul>
 * <li>valor: <code>int</code></li>
 * <li>palo: <code>String</code>
 * <li>
 * </ul>
 * 
 * @version 1.0
 * @author LANDER
 *
 */
public class Carta {

	private int valor;
	private String palo;

	public Carta() {
		super();
		this.valor = 0;
		this.palo = "";
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	@Override
	public String toString() {
		String cartasConNombre;
		switch (this.valor) {
		case 1:
			cartasConNombre = "As";
			break;
		case 10:
			cartasConNombre = "Sota";
			break;
		case 11:
			cartasConNombre = "Caballo";
			break;
		case 12:
			cartasConNombre = "Rey";
			break;
		default:
			cartasConNombre = String.valueOf(this.valor);
			break;
		}
		return "Carta: " + cartasConNombre + " de " + this.palo;
	}

}
