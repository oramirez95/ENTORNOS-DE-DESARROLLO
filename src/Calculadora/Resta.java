package Calculadora;
/**
 * Esta clase está dedicada a implementar los métodos de resta necesarios para implementar una 
 * series de clase que compongan una calculadora. Cada clase que compone los métodos de resta 
 * están documentados para poder instruirse en caso de necesitar información del método. 
 * @author Franco Pellizzari
 * @since 27/01/2022
 * @version version v1.0
 */

public class Resta {
	
	double acumulador = 2000;

	/** Método que calcula la diferencia entre dos números reales.
	 * La diferencia se obtiene restando los números en el orden que se hayan introducido.
	 * 
	 * @param dos números reales de los cuales se desea obtener la diferencia.
	 * @return un número que será el resultado de la resta.
	 */
	  
	public double resta1(double num1, double num2) {
		double resultado = num1 - num2;
		return resultado;
		}
	
	/**
	 * Método que calcula la diferencia entre dos números enteros..
	 * La diferencia se obtiene restando los números en el orden que se hayan introducido.
	 * En caso de que se ingresen números con decimales, la clase dará error. 
	 * @param dos números enteros de los cuales se desea obtener la diferencia.
	 * @return devolverá un número entero que será el resultado de la resta.
	 */
	public int resta2(int num1, int num2) {
		int resultado = num1 - num2;
		return resultado;
	    }
	
	/** Método que calcula la diferencia entre 3 números reales.
	 * La diferencia se obtiene restando los números en el orden que se hayan introducido.
	 * 
	 * @param tres números reales de los cuales se desea obtener la diferencia.
	 * @return un número que será el resultado de la resta.
	 */
	  
	public double restaVersion1(double num1, double num2, double num3) {
		double resultado = num1 - num2 - num3;
		return resultado;
		}
	
	/** 
	 * Este método resta el valor inicial de la variable "acumulado" (2000). Se ingresará un número real, cada vez que se ejecute el método
	 * se restará el numero ingresado al valor de la variable. Este método permite que el valor acumulado se guarde como una propiedad 
	 * durante toda la clase.
	 * 
	 * @param un solo número real que se utilizará para restar a la variable.
	 * 
	 * @return devolverá el resultado de la resta cada vez que se utilice el método guardandose el valor tras cada resta realizada. 
	 */
	
	public double restaValorAcumulado(double num1) {
		double resultado = acumulador - num1;
		acumulador = resultado - num1;
		return resultado;

	    } 

}

