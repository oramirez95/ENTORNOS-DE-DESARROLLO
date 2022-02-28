package Pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Calculadora.Resta;

class RestaPruebas {
	
	private Resta res;

	@BeforeEach
	void setUp() throws Exception {
		res = new Resta();
	}
	
	@Test
	void testRestaDosReales() {
		double num1 = 6.8;
		double num2 = 4.1;
		double resulEsperado = 2.7;
		double resultadoObtenido = res.resta1(num1, num2);
		assertEquals(resulEsperado, resultadoObtenido);
	}
	
	@Test
	void testRestaDosEnteros() {
		int num1 = 41;
		int num2 = 11;
		int resulEsperado = 30;
		int resultadoObtenido = res.resta2(num1, num2);
		assertEquals(resulEsperado, resultadoObtenido);
		
	}
	
	@Test
	void testRestaTresReales() {
		double num1 = 25.5;
		double num2 = 7.8;
		double num3 = 3.7;
		double resulEsperado = 14.0;
		double resultadoObtenido = res.restaVersion1(num1, num2, num3);
		assertEquals(resulEsperado, resultadoObtenido);
	}
	
	@Test 
	void testRestaValorAcumulado() {
		int num1 = 8;
		int acumulador = 2000;
		int resulEsperado = acumulador - num1;
		double resultadoObtenido = res.restaValorAcumulado(num1);
		assertEquals(resulEsperado, resultadoObtenido);
	
	}
}		