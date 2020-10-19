package com.ipartek.pojo;

public class Perro {

	// Atributos
	// La forma de manipular atributos es a través
	// de Setters y Getters.
	/////////////////////////////////////////////////////
	private String nombre;
	private String raza;
	private float peso;
	private boolean isVacunado;
	private String historia;

	// Constructor
	/////////////////////////////////////////////////////
	public Perro() {
		super();
		this.nombre = "Sin Nombre";
		this.raza = "Cruce";
		this.peso = 0f;
		this.isVacunado = false;
		this.historia = "-";
	}

	// Otro constructor (Sobrecarga)
	/////////////////////////////////////////////////////
	public Perro(String nombre) {
		this(); // Llama al constructor por defecto
		this.nombre = nombre;
	}

	// Getters y Setters
	/////////////////////////////////////////////////////

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

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

}
