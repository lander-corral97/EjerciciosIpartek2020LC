package mf0227.uf2404.actividad2.pojo;

import mf0227.uf2404.actividad2.interfaces.IConducible;

/**
 * Clase para representar un veh�culo.<br>
 * Tendr� los siguientes atributos:
 * <ul>
 * <li>color: <code>String</code></li>
 * <li>matricula: <code>String</code></li>
 * </ul>
 * 
 * @author Lander Corral
 *
 */
public class Vehiculo implements IConducible {

	private String color;
	private String matricula;

	public Vehiculo() {
		super();
		this.color = "";
		this.matricula = "";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public void arrancar() {
		System.out.println("Veh�culo arrancado");
	}

	@Override
	public void parar() {
		System.out.println("Veh�culo parado");
	}

	@Override
	public String toString() {
		return String.format("Veh�culo [Color: %s, Matricula: %s]", color, matricula);
	}

}
