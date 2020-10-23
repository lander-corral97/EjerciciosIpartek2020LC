package com.ipartek;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Test para la Calculadora
 * 
 * @version 1.0
 * @author LANDER
 *
 */
class CalculadoraTest {

	Calculadora calc = new Calculadora();

	@Test
	void testSuma() {
		assertEquals(7, calc.suma(5, 2));
	}

	@Test
	void testResta() {
		assertEquals(3, calc.resta(5, 2));
	}

	@Test
	void testMultiplicacion() {
		assertEquals(10, calc.multiplicacion(5, 2));
	}

	@Test
	void testDivision() {
		assertEquals(2, calc.division(5, 2));
	}

	@Test
	void testResto() {
		assertEquals(1, calc.resto(5, 2));
	}

}
