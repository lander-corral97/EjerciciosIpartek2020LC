package com.ipartek.ejercicios.colecciones;

import java.util.ArrayList;
import java.util.Iterator;

import com.ipartek.pojo.Perro;

/**
 * Ejercicio de prueba con Arrays, aplicando lo aprendido en el ejercicio de
 * países
 * 
 * @version 1.0
 * @author LANDER
 *
 */

public class EjercicioPerros {

	private static void inicializarPerros(ArrayList<Perro> perros) {
		for (int i = 0; i < 8; i++) {
			perros.add(new Perro());
		}

		// Laika
		perros.get(0).setNombre("Laika");
		perros.get(0).setHistoria(
				"Esta famosa perrita soviética fue el primer ser vivo en viajar al espacio. En 1957 emprendió su viaje y desafortunadamente murió a las 5 horas de despegar por el estrés y la falta de oxígeno. Este suceso puso en el punto de mira los experimentos con animales. Desde entonces Laika ha sido un icono en la historia.");

		// Hachiko
		perros.get(1).setNombre("Hachiko");
		perros.get(1).setHistoria(
				"Pocos perros han sido tan famosos como él, llegando incluso a traspasar la pantalla y hacernos soltar alguna que otra lagrimilla. Este perro de raza Akita conmocionó al mundo con su historia de lealtad y amor por su amo. Su historia se hizo famosa por estar durante 10 años esperando a su dueño en la estación de metro, a pesar de que éste había muerto en uno de los trayectos.");

		// Balto
		perros.get(2).setNombre("Balto");
		perros.get(2).setHistoria(
				"Este husky siberiano comandó a un grupo de perros para llevar vacunas a un pueblo que tenía una epidemia de difteria y que se encontraba aislado a mil kilómetros de distancia del hospital más cercano. Se le considera el héroe de los niños del pueblo Nome.");

		// Rin tin tin
		perros.get(3).setNombre("Rin tin tin");
		perros.get(3).setHistoria(
				"Este pastor alemán se hizo famoso por interpretar 27 peliculas mudas de Hollywood. En 1929 incluso recibió varios votos para ser el ganador de un premio Óscar, sin embargo la propia academia lo tuvo que denegar por no ser una persona.");

		// Stubby
		perros.get(4).setNombre("Stubby");
		perros.get(4).setHistoria(
				"El sargento Stubby fue un héroe de la Primera Guerra Mundial. Era un  american pitbull terrier que acompañó durante los años de guerra a las tropas americanas. Se encargaba de avisarles de peligros y de gases que puedieran afectarles. Fue condecorado por el gobierno francés y estadounidense.");

		// Pancho
		perros.get(5).setNombre("Pancho");
		perros.get(5).setHistoria(
				"Pancho ha sido sin duda uno de los perros más famosos en España. Lo vimos hacerse millonario jugando a la primitiva e irse de vacaciones al Caribe. También compartió pantalla con la loca comunidad de vecinos de “Aquí no hay quien viva”. Su muerte fue un momento duro para el cine español.");

		// Greyfriars Bobby
		perros.get(6).setNombre("Greyfriars Bobby");
		perros.get(6).setHistoria(
				"Es conocido por ser el perro más fiel del mundo. Para conocer su historia nos trasladamos hasta Edimburgo. Bobby fue acompañante durante varios años de un vigilante de seguridad. Después de que éste muriera Bobby pasó 14 años hasta su muerte junto a su tumba.");

		// Smoky
		perros.get(7).setNombre("Smoky");
		perros.get(7).setHistoria(
				"Este pequeño Yorkshire fue encontrado por un soldado estadounidense en la Primera Guerra Mundial y le acompañó en todas sus misiones. La historia cuenta que incluso ayudó a construir una base aérea transportando cable. Fue también un perro terapia para las víctimas de la guerra que estaban hospitalizadas.");

	}

	public static void main(String[] args) {
		ArrayList<Perro> perros = new ArrayList<Perro>();
		inicializarPerros(perros);

		Perro p = new Perro();
		p.setNombre("Smoky");

		perros.remove(p);

		p.setHistoria(
				"Este pequeño Yorkshire fue encontrado por un soldado estadounidense en la Primera Guerra Mundial y le acompañó en todas sus misiones. La historia cuenta que incluso ayudó a construir una base aérea transportando cable. Fue también un perro terapia para las víctimas de la guerra que estaban hospitalizadas.");
		perros.add(3, p);

		Perro p2 = new Perro();
		p2.setNombre("Luk");
		p2.setHistoria("El perro que tenía en el pueblo");
		perros.set(4, p2);

		Perro p3 = new Perro();
		p3.setNombre("Rin tin tin");
		p3.setHistoria(
				"Este pastor alemán se hizo famoso por interpretar 27 peliculas mudas de Hollywood. En 1929 incluso recibió varios votos para ser el ganador de un premio Óscar, sin embargo la propia academia lo tuvo que denegar por no ser una persona.");

		perros.add(p3);

		for (Iterator<Perro> iterator = perros.iterator(); iterator.hasNext();) {
			Perro perro = (Perro) iterator.next();
			System.out.printf("Nombre: %s\nHistoria: %s\n", perro.getNombre(), perro.getHistoria());
		}
	}

}
