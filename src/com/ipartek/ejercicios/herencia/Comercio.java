package com.ipartek.ejercicios.herencia;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import com.ipartek.pojo.DiscoDuro;
import com.ipartek.pojo.Grafica;
import com.ipartek.pojo.Procesador;
import com.ipartek.pojo.Producto;
import com.ipartek.pojo.Servicio;

public class Comercio {

	// Men� principal
	private static final String NUEVO_STOCK = "1";
	private static final String VENDER_PROD = "2";
	private static final String VENDER_SERV = "3";

	// Men� de nuevo stock
	private static final String DISCO_DURO = "A";
	private static final String PROCESADOR = "B";
	private static final String GRAFICA = "C";

	private static ArrayList<Producto> productos = new ArrayList<Producto>();
	private static ArrayList<Servicio> servicios = new ArrayList<Servicio>();
	private static String opc = "";
	private static boolean isContinuar = true;
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String siNo = "";

		inicializarListas();

		do {
			pintarMenu();
			switch (opc) {
			case NUEVO_STOCK:
				try {
					nuevoStock();
				} catch (Exception e) {
					System.err.println("Error: " + e.getMessage());
				}
				break;
			case VENDER_PROD:
				try {
					venderProducto();
				} catch (Exception e) {
					System.err.println("Error: " + e.getMessage());
				}
				break;
			case VENDER_SERV:
				// TODO Realizar el m�todo
				break;
			default:
				System.err.println("Has introducido una opci�n incorrecta");
				break;
			}
			System.out.println("�Quieres seguir? (S/N)");
			siNo = sc.nextLine();
			if ("n".equalsIgnoreCase(siNo)) {
				isContinuar = false;
			} else if (!"s".equalsIgnoreCase(siNo)) {
				System.err.println("Como has introducido algo diferente a S o N, seguir�s dentro del bucle");
			}
		} while (isContinuar);

		sc.close();
	}

	/**
	 * <b>Si pulsa la opci�n B:</b> se mostrar�n las referencias de toda la lista,
	 * se pedir� que se elimine ese producto del stock (solo se mostraran en esta
	 * lista los objetos de tipo producto) pidi�ndole la posici�n del elemento a
	 * eliminar al usuario por teclado, volviendo a mostrar la lista de productos
	 * para verificar que se vendi�.
	 * 
	 * @throws Exception Si no se da un n�mero cuando se pide
	 */
	private static void venderProducto() throws Exception {
		int productoAVender = 0;
		if (productos.size() > 0) {
			listarProductos();

			System.out.printf("Introduce un n�mero del 1 al %s\n", productos.size());

			try {
				productoAVender = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				throw new Exception("Debes introducir un n�mero");
			} catch (Exception e) {
				throw new Exception("Ha ocurrido un error");
			}

			if (productoAVender >= 1 && productoAVender <= productos.size()) {
				productos.remove(productoAVender - 1);
				System.out.println("Borrando...");
				TimeUnit.SECONDS.sleep(2); // Haciendo efecto de espera

				listarProductos();
			} else {
				throw new Exception(
						String.format("El n�mero introducido tiene que estar entre 1 y %s", productos.size()));
			}
		} else {
			System.out.println("No hay ning�n producto");
		}

	}

	/**
	 * <b>Si pulsa la opci�n A</b>: se mostrar� otro men�, con tres opciones
	 * <ol type="A">
	 * <li>disco duro</li>
	 * <li>procesador</li>
	 * <li>grafica</li>
	 * </ol>
	 * Se validar� que la introducci�n de elecci�n es correcta y si es correcta, se
	 * le solicitara la informaci�n por teclado al usuario para llenar el producto
	 * seleccionado. Una vez obtenida toda la informaci�n, se a�adir� a la lista.
	 * 
	 * @throws Exception Si no se introduce un n�mero cuando se pide
	 * 
	 */
	private static void nuevoStock() throws Exception {
		String opc = "";
		String referencia = "";
		float precio = 0f;

		System.out.println("Introduce el tipo de producto");
		System.out.println("-----------------------------");
		System.out.println("A- Disco Duro");
		System.out.println("B- Procesador");
		System.out.println("C- Grafica");
		System.out.println("-----------------------------");

		opc = sc.nextLine().toUpperCase();
		if (opc.equalsIgnoreCase(DISCO_DURO) || opc.equalsIgnoreCase(PROCESADOR) || opc.equalsIgnoreCase(GRAFICA)) {
			System.out.println("Introduce la referencia del producto");
			referencia = sc.nextLine();
			System.out.println("Intoduce el precio");
			try {
				precio = Float.parseFloat(sc.nextLine());
			} catch (NumberFormatException e) {
				throw new Exception("Debes introducir un n�mero");
			} catch (Exception e) {
				throw new Exception("Ha ocurrido un error");
			}
			switch (opc) {
			case DISCO_DURO:
				try {
					DiscoDuro dd = nuevoDiscoDuro();
					dd.setPrecio(precio);
					dd.setReferencia(referencia);
					productos.add(dd);
				} catch (Exception e) {
					System.err.println("Error: " + e.getMessage());
				}
				break;
			case PROCESADOR:
				try {
					Procesador p = nuevoProcesador();
					p.setPrecio(precio);
					p.setReferencia(referencia);
					productos.add(p);
				} catch (Exception e) {
					System.err.println("Error: " + e.getMessage());
				}
				break;
			case GRAFICA:
				try {
					Grafica g = nuevaGrafica();
					g.setPrecio(precio);
					g.setReferencia(referencia);
					productos.add(g);
				} catch (Exception e) {
					System.err.println("Error: " + e.getMessage());
				}
				break;
			}
			listarProductos();
		} else {
			System.err.println("Has introducido una opci�n incorrecta");
		}
	}

	/**
	 * Lista los productos
	 */
	private static void listarProductos() {
		System.out.println("------------------------------------------------------------------");
		for (Producto producto : productos) {
			System.out.printf("Referencia: %s, Precio: %.2f�", producto.getReferencia(), producto.getPrecio());
			if (producto instanceof DiscoDuro) {
				DiscoDuro dd = (DiscoDuro) producto;
				System.out.printf(", Capacidad: %s, Velocidad: %s, �Es SSD?: %s\n", dd.getCapacidad(),
						dd.getVelocidad(), dd.isSSD() ? "S�" : "No");
			} else if (producto instanceof Procesador) {
				Procesador p = (Procesador) producto;
				System.out.printf(", Modelo: %s, Velocidad: %s\n", p.getModelo(), p.getVelocidad());
			} else if (producto instanceof Grafica) {
				Grafica g = (Grafica) producto;
				System.out.printf(", Memoria: %s, Conexi�n: %s\n", g.getMemoria(), g.getConexion());
			}
		}
		System.out.printf("Total de productos: %s\n", productos.size());
		System.out.println("------------------------------------------------------------------");
	}

	/**
	 * Crea una grafica (S�lo sus atributos espec�ficos)
	 * 
	 * @return Grafica con sus atributos
	 * @throws Exception Al parsear los campos num�ricos (memoria)
	 */
	private static Grafica nuevaGrafica() throws Exception {
		Grafica g = new Grafica();

		try {
			System.out.println("Introduce la memoria");
			g.setMemoria(Integer.parseInt(sc.nextLine()));
			System.out.println("Introduce la conexi�n");
			g.setConexion(sc.nextLine());
		} catch (NumberFormatException e) {
			throw new Exception("Debes introducir un n�mero");
		} catch (Exception e) {
			throw new Exception("Ha ocurrido un error");
		}
		return g;
	}

	/**
	 * Crea un procesador (S�lo sus atributos espec�ficos)
	 * 
	 * @return Procesador con sus atributos
	 * @throws Exception Al parsear los campos num�ricos (velocidad)
	 */
	private static Procesador nuevoProcesador() throws Exception {
		Procesador p = new Procesador();

		try {
			System.out.println("Introduce el modelo");
			p.setModelo(sc.nextLine());
			System.out.println("Introduce la velocidad");
			p.setVelocidad(Integer.parseInt(sc.nextLine()));
		} catch (NumberFormatException e) {
			throw new Exception("Debes introducir un n�mero");
		} catch (Exception e) {
			throw new Exception("Ha ocurrido un error");
		}
		return p;
	}

	/**
	 * Crea un disco duro (S�lo sus atributos espec�ficos)
	 * 
	 * @return Disco duro con sus atributos
	 * @throws Exception Al parsear los campos num�ricos (capacidad y velocidad)
	 */
	private static DiscoDuro nuevoDiscoDuro() throws Exception {
		DiscoDuro dd = new DiscoDuro();
		String siNo = "";

		try {
			System.out.println("Introduce la capacidad");
			dd.setCapacidad(Integer.parseInt(sc.nextLine()));
			System.out.println("Introduce la velocidad");
			dd.setVelocidad(Integer.parseInt(sc.nextLine()));
			do {
				System.out.println("�Es SSD? (S/N)");
				siNo = sc.nextLine();
				if ("s".equalsIgnoreCase(siNo)) {
					dd.setSSD(true);
				} else if ("n".equalsIgnoreCase(siNo)) {
					dd.setSSD(false);
				} else {
					System.err.println("Debes introducir S o N");
				}
			} while (!"s".equalsIgnoreCase(siNo) && !"n".equalsIgnoreCase(siNo));
		} catch (NumberFormatException e) {
			throw new Exception("Debes introducir un n�mero");
		} catch (Exception e) {
			throw new Exception("Ha ocurrido un error");
		}
		return dd;
	}

	/**
	 * Pinta el men� inicial
	 */
	private static void pintarMenu() {
		System.out.println("Introduce una opci�n");
		System.out.println("-----------------------------");
		System.out.println("1.- A�adir el stock de la tienda");
		System.out.println("2.- Vender producto");
		System.out.println("3.- Vender servicio inform�tico");
		System.out.println("-----------------------------");

		opc = sc.nextLine();
	}

	/**
	 * M�todo para inicializar las listas (productos y servicios)
	 */
	private static void inicializarListas() {
		// TODO Buscar ejemplos en Google
	}

}
