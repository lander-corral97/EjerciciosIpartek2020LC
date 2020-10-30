package com.ipartek.pojo;

/**
 * 
 * Clase para representar a un perro
 * 
 * @version 1.0
 * @author LANDER
 *
 */

public class Perro extends Mamifero {

	// Atributos, deben ser siempre privados
	// la forma de manipular estos atributos es a traves de los getteres y settres
	///////////////////////////////////////
	private int id;
	private String raza;
	private float peso;
	private boolean isVacunado;
	private String historia;

	// Constructores
	///////////////////////////////////////
	public Perro() {
		super("Sin nombre");
		this.id = 0;
		this.raza = "Cruce";
		this.peso = 0f;
		this.isVacunado = false;
		this.historia = "Erase una vez....";
	}

	// otro constructor sobrecargado

	public Perro(String nombre) {
		super(nombre);
		this.id = 0;
		this.raza = "Cruce";
		this.peso = 0f;
		this.isVacunado = false;
		this.historia = "Erase una vez....";
	}

	public Perro(String nombre, String raza, float peso) {
		this(nombre);
		this.raza = raza;
		this.peso = peso;
	}

	// Getters y setters
	///////////////////////////////////////

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		if (peso < 0) {
			this.peso = 0;
		} else {
			this.peso = peso;
		}
	}

	public boolean isVacunado() {
		return isVacunado;
	}

	public void setVacunado(boolean isVacunado) {
		this.isVacunado = isVacunado;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Perro [id=" + id + ", raza=" + raza + ", peso=" + peso + ", isVacunado=" + isVacunado + ", historia="
				+ historia + ", getNombre()=" + getNombre() + ", getPatas()=" + getPatas() + "]";
	}

	// HashCode ???
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	// Equals, comprueba si es igual en base a uno o varios campos
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perro other = (Perro) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

}
