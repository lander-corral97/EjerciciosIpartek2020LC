package com.ipartek.cartas;

import com.ipartek.pojo.Carta;

public class BarajaPoker extends Baraja {

	@Override
	void crear() {

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				Carta c = new Carta();
				c.setValor(j + 1);
				switch (i) {
				case 0:
					c.setPalo("Corazones");
					break;
				case 1:
					c.setPalo("Diamantes");
					break;
				case 2:
					c.setPalo("Picas");
					break;
				case 3:
					c.setPalo("Tréboles");
					break;
				}
				baraja.add(c);
			}
		}
	}

	@Override
	void mostrar() {
		for (Carta carta : baraja) {
			String cartaActual = "";
			switch (carta.getValor()) {
			case 1:
				cartaActual += "As";
				break;
			case 11:
				cartaActual += "J";
				break;
			case 12:
				cartaActual += "Q";
				break;
			case 13:
				cartaActual += "K";
				break;
			default:
				cartaActual += carta.getValor();
				break;
			}
			cartaActual += " de " + carta.getPalo();
			System.out.println(cartaActual);
		}
	}

}
