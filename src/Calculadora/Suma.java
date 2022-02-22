package Calculadora;
/**
 * Esta clase est� dedicada a implementar los m�todos de la sumapara componer una calculadora. 
 * @author Adrian Martinez
 * @version version 1.0
 */

public class Suma {
	
	int acumulador;

	/** M�todo que calcula la suma entre dos n�meros reales.
	 * El resultado se obtiene sumando dichos dos numeros.
	 * 
	 * @param dos n�meros reales para obtener su suma.
	 * @return un n�mero que ser� el resultado de la suma.
	 */
	  
	public double sumaReales(double num1, double num2) {
		double resultado = num1 + num2;
		return resultado;
	}
	
	/** M�todo que calcula la suma entre dos n�meros enteros.
	 * El resultado se obtiene sumando dichos dos numeros.
	 * 
	 * @param dos n�meros enteros para obtener su suma.
	 * @return un n�mero que ser� el resultado de la suma.
	 */
	public int sumaEnteros(int num1, int num2) {
		int resultado = num1 + num2;
		return resultado;
	}
	
	/** M�todo que calcula la suma entre 3 n�meros enteros.
	 * El resultado se obtiene sumando dichos tres numeros enteros.
	 * 
	 * @param tres n�meros reales de los cuales se desea obtener la diferencia.
	 * @return un n�mero que ser� el resultado de la suma.
	 */
	  
	public double sumaTres(double num1, double num2, double num3) {
		double resultado = num1 + num2 + num3;
		return resultado;
	}
	
	/** 
	 * Este m�todo suma un valor inicial a la variable acumulado la cual inicalizamos a 0.
	 * Cada vez que se ejecute el metodo se sumara un nuevo numero real a la variabe acumulado.
	 * 
	 * @param un solo n�mero real que se utilizar� para sumar a la variable mecionada anteriormente.
	 * 
	 * @return devolver� el resultado de la suma. 
	 */
	
	public int sumaAcumulado(int num1) {
		int resultado = acumulador + num1;
		acumulador = resultado + num1;
		return resultado;
	} 
}


