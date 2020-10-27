package com.ipartek.cartas;

import com.ipartek.pojo.Carta;

public class BarajaEspanola extends Baraja {

	@Override
	void crear() {

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 10; j++) {
				Carta c = new Carta();
				if (j < 7) {
					c.setValor(j + 1);
				} else {
					c.setValor(j + 3);
				}
				switch (i) {
				case 0:
					c.setPalo("Copas");
					break;
				case 1:
					c.setPalo("Espadas");
					break;
				case 2:
					c.setPalo("Oros");
					break;
				case 3:
					c.setPalo("Bastos");
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
			case 10:
				cartaActual += "Sota";
				break;
			case 11:
				cartaActual += "Caballo";
				break;
			case 12:
				cartaActual += "Rey";
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
