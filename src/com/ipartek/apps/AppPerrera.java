package com.ipartek.apps;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Perro;

public class AppPerrera {

	static ArrayList<Perro> perros = new ArrayList<Perro>();
	static String opcion = ""; // Opción seleccionada en el menú por el usuario
	static Scanner sc = null;

	public static void main(String[] args) {

		System.out.println("********* APP PERRERA *********");
		sc = new Scanner(System.in);

		inicializarDatos();

		pintarMenu();

		switch (opcion) {
		case "1":
			listar();
			break;
		case "2":

		case "3":

		}

		System.out.println("********* ADIÓS *********");
		sc.close();
	}

	private static void listar() {
		for (Perro perro : perros) {
			System.out.println(perro);

		}
	}

	/**
	 * Inicializar el ArrayList para simular que existen perros. </br>
	 * En un futuro nos conectaremos a una BBDD.
	 */
	private static void inicializarDatos() {
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

	/**
	 * Se encarga de pintar las opciones del menú </br>
	 * No aparece {@code @return} porque no retorna nada. {@code void}
	 */
	private static void pintarMenu() {

		System.out.println("******************************");
		System.out.println("1.- Listar perros");
		System.out.println("2.- Crear un perro");
		System.out.println("3.- Dar de baja a un perro");
		System.out.println("4.- Salir");
		System.out.println("******************************");

		opcion = sc.nextLine();
	}

}
