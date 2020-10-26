package com.ipartek.modelo;

import java.util.ArrayList;

import com.ipartek.pojo.Futbolista;

/**
 * DAO para los Futbolistas
 * 
 * @author LANDER
 * @version 1.0
 */
public interface FutbolistaDAO {

	/**
	 * Lista de futbolistas
	 * 
	 * @return Array con los futbolistas
	 * @throws Exception Si la edad o altura del futbolista es incorrecta
	 */
	ArrayList<Futbolista> listar() throws Exception;

	/**
	 * Devuelve el futbolista con dicho id
	 * 
	 * @param id Identificador
	 * @return Futbolista cuyo id es {@code id}
	 */
	Futbolista getFutbolista(int id);

	/**
	 * Crea un nuevo Futbolista y los mete en el array
	 * 
	 * @param fut Futbolista a introducir en la lista
	 * @return Futbolista introducido
	 * @throws Exception Si el futbolista ya está en el array
	 */
	Futbolista nuevoFutbolista(Futbolista fut) throws Exception;

	/**
	 * Se introduce un parámetro de búsqueda para sacar un array con los datos que
	 * coincidan
	 * 
	 * @param busqueda Parte del nombre para buscar en el array
	 * @return ArrayList con todos los futbolistas que contengan el parámetro
	 *         {@code busqueda}
	 */
	ArrayList<Futbolista> buscarFutbolistaPorNombre(String busqueda);

	/**
	 * Introduce los nuevos datos del futbolista y los reemplaza por los nuevos
	 * 
	 * @param fut Futbolista a modificar
	 * @return Futbolista modificado
	 * @throws Exception Si no encuentra al futbolista o no existe.
	 */
	Futbolista modificarFutbolista(Futbolista fut) throws Exception;

	/**
	 * Borra el futbolista con dicho id
	 * 
	 * @param id Identificador
	 * @return true; si borra, false; si no borra
	 */
	boolean borrarFutbolista(int id);

	/**
	 * Devuelve una lista con dicha nacionalidad
	 * 
	 * @param nacionalidad Nacionalidad a buscar
	 * @return ArrayList con todos los futbolistas de dicha nacionalidad
	 */
	ArrayList<Futbolista> getFutbolistaNacionalidad(String nacionalidad);

	/**
	 * Devuelve una lista que se mayor/menor de edad X
	 * 
	 * @param edad       Edad para comparar
	 * @param mayorMenor String para saber si comparar como mayor o menor
	 * @return ArrayList con Futbolistas mayor o menor de dicha edad
	 * @throws Exception No encuentra futbolistas
	 */
	ArrayList<Futbolista> getFutbolistaMayorMenorEdad(int edad, String mayorMenor) throws Exception;

	/**
	 * Ordena un array por edad
	 * 
	 * @param futs ArrayList sin ordenar
	 * @return ArrayList ordenado por Edad
	 */
	ArrayList<Futbolista> ordenarPorEdad(ArrayList<Futbolista> futs);

	/**
	 * Ordena el array por nombre
	 */
	void ordenarArray();

}
