package com.ipartek.pojo;

public class GatoMamDomestico extends GatoMam {

	private boolean vacunado;
	private boolean castrado;

	public GatoMamDomestico(String nombre) {
		super(nombre);
	}

	public boolean isVacunado() {
		return vacunado;
	}

	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}

	public boolean isCastrado() {
		return castrado;
	}

	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}

	@Override
	public String toString() {
		return super.toString() + "GatoMamDomestico [vacunado=" + vacunado + ", castrado=" + castrado + "]";
	}
}
