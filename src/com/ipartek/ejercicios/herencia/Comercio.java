package com.ipartek.ejercicios.herencia;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import com.ipartek.pojo.DiscoDuro;
import com.ipartek.pojo.Grafica;
import com.ipartek.pojo.Procesador;
import com.ipartek.pojo.Producto;
import com.ipartek.pojo.Servicio;
import com.ipartek.pojo.ServicioDomicilio;
import com.ipartek.pojo.ServicioTienda;

/**
 * Realizar un proyecto nuevo llamado Comercio en la que definiremos las
 * siguientes clases y su herencia<br>
 * <br>
 * <b style="color:blue">Bloque1:</b> <br>
 * Clase producto: la utilizaremos para representar todos los productos que
 * tengamos en nuestra tienda. Contar� con los atributos referencia y precio.
 * <br>
 * Asimismo, tendremos las clases discoDuro, con los atributos capacidad,
 * velocidad y esSSD, la clase Grafica, con los atributos memoria y conexi�n y
 * la clase Procesador, que tendr� los atributos modelo y velocidad. Todas estas
 * clases ser�n clases hijas de la clase producto, y contar�n con dos
 * constructores m�nimo, el completo y el vac�o<br>
 * Todas las clases anteriores, contaran con un m�todo llamado toString, que nos
 * mostrara los valores de todos sus atributos, tanto loas propios de la clase
 * como los heredados si los tuviera<br>
 * <br>
 * <b style="color:blue">Bloque 2</b> <br>
 * La tienda tambi�n prestara distintos servicios inform�ticos. Par ello
 * contaremos con una clase padre llamada Servicio (esta clase ser� hija de la
 * clase producto) que tendr� los atributos c�digo, precio y minimoHoras, de la
 * que heredaran dos clases hijas, la clase servicioTienda, con un atributo
 * Empleado de tipo string, y servicioDomicilio, con un atributo gastoAdicional.
 * Todas estas clases contaran con los constructores adecuados<br>
 * <br>
 * <b style="color:blue">Programa main</b> <br>
 * Una vez realizado esta jerarqu�a de clases, se proceder� a crear un programa
 * principal llamado gesti�n de stocks, que almacenara todos los datos
 * solicitados en una lista En �l se crear� un men� que muestre las siguientes
 * opciones al usuario:
 * <ol type="A">
 * <li>a�adir al stock de la tienda</li>
 * <li>vender producto</li>
 * <li>vender servicio inform�tico</li>
 * </ol>
 * Validar la introducci�n de la elecci�n, repetir este men� hasta que la opci�n
 * sea A, a, B, b <br>
 * <br>
 * 
 * <b>Si pulsa la opci�n A</b>: se mostrar� otro men�, con tres opciones
 * <ol type="A">
 * <li>disco duro</li>
 * <li>procesador</li>
 * <li>grafica</li>
 * </ol>
 * Se validar� que la introducci�n de elecci�n es correcta y si es correcta, se
 * le solicitara la informaci�n por teclado al usuario para llenar el producto
 * seleccionado. Una vez obtenida toda la informaci�n, se a�adir� a la
 * lista.<br>
 * <br>
 * 
 * 
 * <b>Si pulsa la opci�n B:</b> se mostrar�n las referencias de toda la lista,
 * se pedir� que se elimine ese producto del stock (solo se mostraran en esta
 * lista los objetos de tipo producto) pidi�ndole la posici�n del elemento a
 * eliminar al usuario por teclado, volviendo a mostrar la lista de productos
 * para verificar que se vendi�. <br>
 * <br>
 * <b>Si pulsa la opci�n C:</b> se a�adir� a la lista un nuevo servicio. Para
 * ello deber� escogerse qu� tipo de servicio ser�, si es en la tienda o es en
 * donde el cliente. Una vez escogido el tipo, se creara el objeto de dicho tipo
 * y se rellenara con los datos adecuados, que se solicitaran por teclado al
 * cliente<br>
 * <br>
 * <b style="color:blue">Consejos: </b>Se recomienda precargar mediante c�digo
 * una serie de productos y servicios en la lista para tener material de prueba
 * 
 * @version 1.0
 * @author Lander Corral
 *
 */
public class Comercio {

	// Men� principal
	private static final String NUEVO_STOCK = "1";
	private static final String VENDER_PROD = "2";
	private static final String VENDER_SERV = "3";

	// Men� de nuevo stock
	private static final String DISCO_DURO = "A";
	private static final String PROCESADOR = "B";
	private static final String GRAFICA = "C";

	// Men� de vender servicio
	private static final String TIENDA = "A";
	private static final String DOMICILIO = "B";

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
				try {
					venderServicio();
				} catch (Exception e) {
					System.err.println("Error: " + e.getMessage());
				}
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
	 * <b>Si pulsa la opci�n C:</b> se a�adir� a la lista un nuevo servicio. Para
	 * ello deber� escogerse qu� tipo de servicio ser�, si es en la tienda o es en
	 * donde el cliente. Una vez escogido el tipo, se creara el objeto de dicho tipo
	 * y se rellenara con los datos adecuados, que se solicitaran por teclado al
	 * cliente
	 * 
	 * @throws Exception Si el usuario no mete un n�mero cuando es necesario
	 */
	private static void venderServicio() throws Exception {
		String opc = "";
		String codigo = "";
		float precio = 0f;
		int minimoHoras = 0;

		System.out.println("Introduce el tipo de servicio");
		System.out.println("-----------------------------");
		System.out.println("A- Tienda");
		System.out.println("B- A Domicilio");
		System.out.println("-----------------------------");

		opc = sc.nextLine().toUpperCase();
		if (opc.equalsIgnoreCase(TIENDA) || opc.equalsIgnoreCase(DOMICILIO)) {

			System.out.println("Introduce un c�digo");
			codigo = sc.nextLine();
			System.out.println("Introduce un precio");
			try {
				precio = Float.parseFloat(sc.nextLine());
				System.out.println("Introduce un m�nimo de horas");
				minimoHoras = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				throw new Exception("Debes introducir un n�mero");
			} catch (Exception e) {
				throw new Exception("Ha ocurrido un error");
			}

			switch (opc) {
			case TIENDA:
				ServicioTienda st = new ServicioTienda();

				System.out.println("Introduce al empleado");

				st.setEmpleado(sc.nextLine());
				st.setCodigo(codigo);
				st.setMinimoHoras(minimoHoras);
				st.setPrecio(precio);

				servicios.add(st);
				break;

			case DOMICILIO:
				ServicioDomicilio sd = new ServicioDomicilio();

				System.out.println("Introduce el gasto adicional");

				try {
					sd.setGastoAdicional(Float.parseFloat(sc.nextLine()));
				} catch (NumberFormatException e) {
					throw new Exception("Debes introducir un n�mero");
				} catch (Exception e) {
					throw new Exception("Ha ocurrido un error");
				}
				sd.setCodigo(codigo);
				sd.setMinimoHoras(minimoHoras);
				sd.setPrecio(precio);

				servicios.add(sd);
				break;

			}
			listarServicios();
		} else {
			System.err.println("Has introducido una opci�n incorrecta");
		}
	}

	/**
	 * Lista los servicios
	 */
	private static void listarServicios() {
		System.out.println("------------------------------------------------------------------");
		for (Servicio servicio : servicios) {
			System.out.printf("C�digo: %s, Precio: %.2f�, M�nimo Horas: %s", servicio.getCodigo(), servicio.getPrecio(),
					servicio.getMinimoHoras());
			if (servicio instanceof ServicioTienda) {
				ServicioTienda st = (ServicioTienda) servicio;
				System.out.printf(", Empleado: %s\n", st.getEmpleado());
			} else if (servicio instanceof ServicioDomicilio) {
				ServicioDomicilio sd = (ServicioDomicilio) servicio;
				System.out.printf(", Gasto Adicional: %.2f�\n", sd.getGastoAdicional());
			}
		}
		System.out.printf("Total de servicios: %s\n", servicios.size());
		System.out.println("------------------------------------------------------------------");
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
		productos.add(new DiscoDuro("Seagate BarraCuda 3.5\" 1TB SATA3", 33.95f, 1000, 7200, false));
		productos.add(new DiscoDuro("Kioxia EXCERIA 240GB SSD SATA", 35.01f, 240, 5400, true));
		productos.add(new DiscoDuro("Kingston A400 SSD 480GB", 47.95f, 480, 5499, true));
		productos.add(new Procesador("AMD Ryzen 5 3600 3.6GHz BOX", 202.9f, "AMD Ryzen 5 3600 3.6GHz BOX", 4));
		productos.add(new Procesador("AMD Ryzen 5 3400G 3.7GHz BOX", 139.9f, "AMD Ryzen 5 3400G 3.7GHz BOX", 4));
		productos.add(new Grafica("Zotac Gaming GTX 1660 SUPER Twin Fan 6GB GDDR6", 239.89f, 6, "8 pin"));

		servicios.add(new ServicioTienda("0001A", 47.5f, 5, "Juan Alberto Garc�a"));
		servicios.add(new ServicioTienda("0234C", 43.4f, 4, "Mar�a Su�rez"));
		servicios.add(new ServicioDomicilio("1930G", 39.25f, 4, 9.57f));
		servicios.add(new ServicioDomicilio("0983F", 67.69f, 5, 3.67f));
	}

}
