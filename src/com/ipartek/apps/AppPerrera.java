package com.ipartek.apps;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Perro;

public class AppPerrera {

	static ArrayList<Perro> perros = new ArrayList<Perro>();
	static String opcion = ""; // Opci�n seleccionada en el men� por el usuario
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

		System.out.println("********* ADI�S *********");
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
				"Esta famosa perrita sovi�tica fue el primer ser vivo en viajar al espacio. En 1957 emprendi� su viaje y desafortunadamente muri� a las 5 horas de despegar por el estr�s y la falta de ox�geno. Este suceso puso en el punto de mira los experimentos con animales. Desde entonces Laika ha sido un icono en la historia.");

		// Hachiko
		perros.get(1).setNombre("Hachiko");
		perros.get(1).setHistoria(
				"Pocos perros han sido tan famosos como �l, llegando incluso a traspasar la pantalla y hacernos soltar alguna que otra lagrimilla. Este perro de raza Akita conmocion� al mundo con su historia de lealtad y amor por su amo. Su historia se hizo famosa por estar durante 10 a�os esperando a su due�o en la estaci�n de metro, a pesar de que �ste hab�a muerto en uno de los trayectos.");

		// Balto
		perros.get(2).setNombre("Balto");
		perros.get(2).setHistoria(
				"Este husky siberiano comand� a un grupo de perros para llevar vacunas a un pueblo que ten�a una epidemia de difteria y que se encontraba aislado a mil kil�metros de distancia del hospital m�s cercano. Se le considera el h�roe de los ni�os del pueblo Nome.");

		// Rin tin tin
		perros.get(3).setNombre("Rin tin tin");
		perros.get(3).setHistoria(
				"Este pastor alem�n se hizo famoso por interpretar 27 peliculas mudas de Hollywood. En 1929 incluso recibi� varios votos para ser el ganador de un premio �scar, sin embargo la propia academia lo tuvo que denegar por no ser una persona.");

		// Stubby
		perros.get(4).setNombre("Stubby");
		perros.get(4).setHistoria(
				"El sargento Stubby fue un h�roe de la Primera Guerra Mundial. Era un  american pitbull terrier que acompa�� durante los a�os de guerra a las tropas americanas. Se encargaba de avisarles de peligros y de gases que puedieran afectarles. Fue condecorado por el gobierno franc�s y estadounidense.");

		// Pancho
		perros.get(5).setNombre("Pancho");
		perros.get(5).setHistoria(
				"Pancho ha sido sin duda uno de los perros m�s famosos en Espa�a. Lo vimos hacerse millonario jugando a la primitiva e irse de vacaciones al Caribe. Tambi�n comparti� pantalla con la loca comunidad de vecinos de �Aqu� no hay quien viva�. Su muerte fue un momento duro para el cine espa�ol.");

		// Greyfriars Bobby
		perros.get(6).setNombre("Greyfriars Bobby");
		perros.get(6).setHistoria(
				"Es conocido por ser el perro m�s fiel del mundo. Para conocer su historia nos trasladamos hasta Edimburgo. Bobby fue acompa�ante durante varios a�os de un vigilante de seguridad. Despu�s de que �ste muriera Bobby pas� 14 a�os hasta su muerte junto a su tumba.");

		// Smoky
		perros.get(7).setNombre("Smoky");
		perros.get(7).setHistoria(
				"Este peque�o Yorkshire fue encontrado por un soldado estadounidense en la Primera Guerra Mundial y le acompa�� en todas sus misiones. La historia cuenta que incluso ayud� a construir una base a�rea transportando cable. Fue tambi�n un perro terapia para las v�ctimas de la guerra que estaban hospitalizadas.");

	}

	/**
	 * Se encarga de pintar las opciones del men� </br>
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
