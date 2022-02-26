package Pruebas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Calculadora.Producto;

class ProductoPruebas {
	
	private Producto prod;

	@BeforeEach
	void setUp() throws Exception {
		prod = new Producto();
	}

	@Test
	void testProductoDosReales() {
		double num1 = 2.2;
		double num2 = 4.6;
		double resulEsperado = 10.12;
		double obtenido = prod.productoDosReales(num1, num2);
		assertEquals(resulEsperado, obtenido);
	}

	@Test
	void testproductosDosEnteros() {
		int num1 = 5;
		int num2 = 10;
		int resulEsperado = 50;
		int obtenido = prod.productoDosEnteros(num1, num2);
		assertEquals(resulEsperado, obtenido);
		
	}
	
	@Test
	void testproductoTresReales() {
		double num1 = 4.2;
		double num2 = 7.1;
		double num3 = 4.8;
		double resulEsperado = 143.136;
		double obtenido = prod.productoTresReales(num1, num2, num3);
		assertEquals(resulEsperado, obtenido);
	}
	
	@Test 
	void testpotenciaDouble() {
		double num1 = 8.4;
		double num2 = 3.7;
		double resulEsperado = 2629.258934843365;
		double obtenido = prod.potenciaDouble(num1, num2);
		assertEquals(resulEsperado, obtenido);

	}
}