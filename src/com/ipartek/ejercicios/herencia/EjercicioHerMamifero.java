package com.ipartek.ejercicios.herencia;

import com.ipartek.pojo.GatoMam;
import com.ipartek.pojo.GatoMamDomestico;
import com.ipartek.pojo.PerroMam;

public class EjercicioHerMamifero {

	public static void main(String[] args) {
		PerroMam p = new PerroMam("Luk");
		p.imprimirPatas();

		GatoMam g = new GatoMam("Lulú");
		g.imprimirPatas();

		GatoMamDomestico gd = new GatoMamDomestico("Michi");
		gd.setCastrado(true);
		gd.setVacunado(true);
		System.out.println(gd);
	}

}
