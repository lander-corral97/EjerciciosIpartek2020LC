package com.ipartek;

import com.ipartek.pojo.Serie;

/**
 * Interfaz para obligar a implementar una serie de métodos
 * 
 * @author LANDER
 * @version 1.0
 */
public interface IFunciones {

	final int LOTERIA_EUROMILLON = 1;
	final int LOTERIA_QUINIELA = 2;
	final int LOTERIA_BONOLOTO = 3;

	/**
	 * Pide nombre por Scanner
	 * 
	 * @throws Exception Si el nombre es menor de una letra o contiene números
	 * @return Nombre escrito
	 */
	String pedirNombre() throws Exception;

	/**
	 * Imprime los número de la lotería
	 * 
	 * @param tipoLoteria El tipo de lotería (1: EUROMILLÓN, 2: QUINIELA, 3:
	 *                    BONOLOTO)
	 * @throws Exception Si el tipoLoteria no existe
	 */
	void imprimirNumeroLoteria(int tipoLoteria) throws Exception;

	/**
	 * Calcula las vueltas
	 * 
	 * @param dineroEntregado
	 * @param precioProducto
	 * @return Float con las vueltas
	 * @throws Exception Si precioProducto es mayor que dineroEntregado
	 */
	float calcularVueltas(float dineroEntregado, float precioProducto) throws Exception;

	/**
	 * Pedimos todos los datos de una serie por consola
	 * 
	 * @return Serie
	 */
	Serie pedirDatosPorConsola();
}
