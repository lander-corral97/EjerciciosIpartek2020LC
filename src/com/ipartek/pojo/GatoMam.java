package com.ipartek.pojo;

public class GatoMam extends Mamifero {

	public GatoMam(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return "GatoMam [nombre= " + getNombre() + ", patas=" + getPatas() + "]";
	}

}
