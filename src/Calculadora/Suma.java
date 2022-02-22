package Calculadora;
/**
 * Esta clase está dedicada a implementar los métodos de la sumapara componer una calculadora. 
 * @author Adrian Martinez
 * @version version 1.0
 */

public class Suma {
	
	int acumulador;

	/** Método que calcula la suma entre dos números reales.
	 * El resultado se obtiene sumando dichos dos numeros.
	 * 
	 * @param dos números reales para obtener su suma.
	 * @return un número que será el resultado de la suma.
	 */
	  
	public double sumaReales(double num1, double num2) {
		double resultado = num1 + num2;
		return resultado;
	}
	
	/** Método que calcula la suma entre dos números enteros.
	 * El resultado se obtiene sumando dichos dos numeros.
	 * 
	 * @param dos números enteros para obtener su suma.
	 * @return un número que será el resultado de la suma.
	 */
	public int sumaEnteros(int num1, int num2) {
		int resultado = num1 + num2;
		return resultado;
	}
	
	/** Método que calcula la suma entre 3 números enteros.
	 * El resultado se obtiene sumando dichos tres numeros enteros.
	 * 
	 * @param tres números reales de los cuales se desea obtener la diferencia.
	 * @return un número que será el resultado de la suma.
	 */
	  
	public double sumaTres(double num1, double num2, double num3) {
		double resultado = num1 + num2 + num3;
		return resultado;
	}
	
	/** 
	 * Este método suma un valor inicial a la variable acumulado la cual inicalizamos a 0.
	 * Cada vez que se ejecute el metodo se sumara un nuevo numero real a la variabe acumulado.
	 * 
	 * @param un solo número real que se utilizará para sumar a la variable mecionada anteriormente.
	 * 
	 * @return devolverá el resultado de la suma. 
	 */
	
	public int sumaAcumulado(int num1) {
		int resultado = acumulador + num1;
		acumulador = resultado + num1;
		return resultado;
	} 
}


