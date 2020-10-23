package com.ipartek;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class UtilidadesTest {

	@Test
	void test() {
		assertTrue(2 > 1);
	}

	@Test
	void testImprimirNumeroLoteria() {
		Utilidades util = new Utilidades();
		try {
			util.imprimirNumeroLoteria(1);
			util.imprimirNumeroLoteria(2);
			util.imprimirNumeroLoteria(3);
			assertTrue(true);
		} catch (Exception e) {
			fail("No deber�a haber lanzado exception");
		}
		try {
			util.imprimirNumeroLoteria(4);
			fail("Deber�a haber lanzado la excepci�n");
		} catch (Exception e) {
			assertTrue(true);
		}
	}

	@Test
	void testCalcularVueltas() {
		Utilidades util = new Utilidades();

		try {
			assertEquals(50f, util.calcularVueltas(100, 50));
			assertEquals(0f, util.calcularVueltas(100, 100));
		} catch (Exception e) {
			fail("No deber�a lanzar una excepci�n.");
		}

		try {
			assertEquals(50, util.calcularVueltas(50, 100));
			fail("Deber�a haber lanzado Exception");
		} catch (Exception e) {
			assertTrue(true);
		}
	}
}
