package com.ipartek.pojo;

/**
 * Clase abstracta para representar una impresora<br>
 * Tendrá los siguientes atributos:
 * <ul>
 * <li>numHojas: <code>int</code></li>
 * <li>nivelTinta: <code>int</code></li>
 * <li>isLaser: <code>boolean</code></li>
 * </ul>
 * 
 * @author Lander Corral
 *
 */
public abstract class Impresora {

	private int numHojas;
	private int nivelTinta;
	private boolean isLaser;

	public Impresora() {
		super();
		this.numHojas = 0;
		this.nivelTinta = 0;
		this.isLaser = false;
	}

	public int getNumHojas() {
		return numHojas;
	}

	public void setNumHojas(int numHojas) {
		this.numHojas = numHojas;
	}

	public int getNivelTinta() {
		return nivelTinta;
	}

	public void setNivelTinta(int nivelTinta) {
		this.nivelTinta = nivelTinta;
	}

	public boolean isLaser() {
		return isLaser;
	}

	public void setLaser(boolean isLaser) {
		this.isLaser = isLaser;
	}

	@Override
	public String toString() {
		return "Impresora [numHojas=" + numHojas + ", nivelTinta=" + nivelTinta + ", isLaser=" + isLaser + "]";
	}

}
