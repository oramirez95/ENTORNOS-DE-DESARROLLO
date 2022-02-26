package Pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Calculadora.Suma;

class SumaPruebas {
	
	private Suma sum;

	@BeforeEach
	void setUp() throws Exception {
		sum = new Suma();
	}

	@Test
	void testSumaDosReales() {
		double num1 = 4.3;
		double num2 = 6.5;
		double resulEsperado = 10.8;
		double resultadoObtenido = sum.sumaReales(num1, num2);
		assertEquals(resulEsperado, resultadoObtenido);
	}

	@Test
	void testSumaDosEnteros() {
		int num1 = 2;
		int num2 = 18;
		int resulEsperado = 20;
		int resultadoObtenido = sum.sumaEnteros(num1, num2);
		assertEquals(resulEsperado, resultadoObtenido);
		
	}
	
	@Test
	void testSumaTresReales() {
		double num1 = 2.2;
		double num2 = 3.3;
		double num3 = 4.4;
		double resulEsperado = 9.9;
		double resultadoObtenido = sum.sumaTres(num1, num2, num3);
		assertEquals(resulEsperado, resultadoObtenido);
	}
	
	@Test 
	void testSumaAcumulador() {
		int num1 = 8;
		int acumulador = 0;
		int resulEsperado = acumulador + num1;
		int resultadoObtenido = sum.sumaAcumulado(num1);
		assertEquals(resulEsperado, resultadoObtenido);

	}
}