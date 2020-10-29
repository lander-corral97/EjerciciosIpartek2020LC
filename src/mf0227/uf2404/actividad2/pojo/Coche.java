package mf0227.uf2404.actividad2.pojo;

/**
 * Clase para representar un coche.<br>
 * Extiende de la clase <b><code>Vehiculo</code></b><br>
 * Tendrá los siguientes atributos:
 * <ul>
 * <li>marca: <code>String</code></li>
 * <li>modelo: <code>String</code></li>
 * <li>potencia: <code>int</code></li>
 * <li>cilindrada: <code>int</code></li>
 * </ul>
 * 
 * @author Lander Corral
 *
 */
public class Coche extends Vehiculo {

	private String marca;
	private String modelo;
	private int potencia;
	private int cilindrada;

	public Coche() {
		super();
		this.marca = "";
		this.modelo = "";
		this.potencia = 0;
		this.cilindrada = 0;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return String.format(
				"Coche [Color: %s, Matrícula: %s, Marca: %s, Modelo: %s, Potencia: %s caballos, Cilindrada: %s cc]",
				getColor(), getMatricula(), marca, modelo, potencia, cilindrada);
	}

}
