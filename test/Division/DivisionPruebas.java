package Division;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Calculadora.Division;

class DivisionTest {
	private Division divi;
	
	@BeforeEach
	void setUp() throws Exception {
		divi = new Division();
	}
	
	@Test
	void divisionTestDivDosReales() {
		double num1 = 4.5;
		double num2 = 2.5;
		double resulEsperado = 1.8;
		double obtenido = divi.divDosReales(num1, num2);
		assertEquals(resulEsperado, obtenido);

	 
		
	}
	
	@Test
	void divisionTestDivDosEnteros() {
		int num1 = 4;
		int num2 = 2;
		int resulEsperado = 2;
		int obtenido = divi.divDosEnteros(num1, num2);
		assertEquals(resulEsperado, obtenido);
	}
	
	@Test
	void divisionTestinversioNumReal() {
		int num = 1234;
		int resulEsperado = 4321;
		int obtenido = divi.inversioNumReal(num);
		
	}
	
	@Test
	void divisionTestraiz() {
		int num = 6;
		double resulEsperado = 2.449489742783178;
		int obtenido = (int) divi.raiz(num);
			
	}
		
}