package com.ipartek.pojo;

/**
 * Cuando extendemos de una clase, heredamos todos sus métodos y atributos.
 * 
 * @version 1.0
 * @author LANDER
 *
 */
public class Estudiante extends Persona {

	float notaMedia;

	public float getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(float notaMedia) {
		this.notaMedia = notaMedia;
	}

}
