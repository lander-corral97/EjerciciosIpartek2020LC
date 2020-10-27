package com.ipartek.cartas;

public class EjercicioCartas {

	public static void main(String[] args) {
		BarajaPoker poker = new BarajaPoker();
		poker.crear();
		poker.mostrar();

		BarajaEspanola espanola = new BarajaEspanola();
		espanola.crear();
		espanola.mostrar();
	}

}
