package com.ipartek.cartas;

public class EjercicioCartas {

	public static void main(String[] args) {
		BarajaPoker poker = new BarajaPoker();
		poker.crear();
		poker.barajar();
		poker.mostrar();

		System.out.println("***************************************");

		BarajaEspanola espanola = new BarajaEspanola();
		espanola.crear();
		espanola.barajar();
		espanola.mostrar();
	}

}
