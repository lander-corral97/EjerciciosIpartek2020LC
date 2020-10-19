package com.ipartek;

public class Utilidades {

	/**
	 * Calcula la letra del DNI
	 * 
	 * @param numeros String; son los 8 n�meros del DNI
	 * @return Retorna el DNI completo con los n�meros y letra
	 * @throws Exception Si no pasamos como par�metros los 8 n�meros
	 */
	public static String calcularLetraDni(String numeros) throws Exception {
		String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKE";
		if (numeros == null) {
			throw new Exception("No puede ser null");
		}
		if (numeros.length() != 8) {
			throw new Exception("El DNI debe tener 8 n�meros");
		}
		try {
			int numerosInt = Integer.parseInt(numeros);
			numeros += letrasDni.charAt(numerosInt % 23);
		} catch (NumberFormatException e) {
			throw new Exception("No has introducido un n�mero");
		} catch (Exception e) {
			throw new Exception("Ha habido un error");
		}
		return numeros;
	}

}
