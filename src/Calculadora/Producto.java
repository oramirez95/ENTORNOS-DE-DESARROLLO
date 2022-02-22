package Calculadora;
/**
 * Esta clase est� dedicada a implementar los m�todos de la suma necesarios para implementar una 
 * series de clase que compongan una calculadora.
 * @author Rub�n de Pablo G�mez 1� DAW
 * @since 27/01/2022
 * @version version v1.0
 */


public class Producto {
	/**
	 * Este metodo realiza el <b>producto</b> de dos <b>numeros reales</b>.
	 * @param num1 es el primer valor real que se introduce para la multiplicaci�n.
	 * @param num2 es el segundo valor real que se introduce para la multiplicaci�n
	 * @return devuelve el <b>producto</b> de <b>ambos</b> n�meros introducidos 
	 * as� como su potencia
	 */
	//Producto de 2 n�meros reales
	public float productoDosReales(float num1, float num2) {
		float resultado = num1 * num2;
		return resultado;
	}
	/**
	 * Este m�todo realiza el <b>producto</b>de dos <b>n�meros enteros</b>.
	 * @param num1 es el primer valor entero que se introduce para la multiplicaci�n.
	 * @param num2 es el segundo valor entero que se introduce para la multiplicaci�n.
	 * @return devuelve el <b>producto</b> de <b>ambos</b> n�meros enteros
	 */
	//Producto de 2 n�meros enteros
	public int productoDosEnteros(int num1, int num2) {
		int resultado = num1 * num2;
		return resultado;
	}
	/**
	 * Este m�todo realiza el <b>producto</b>de tres <b>n�meros reales</b>.
	 * @param num1 es el primer valor real que se introduce para la multiplicaci�n.
	 * @param num2 es el segundo valor real que se introduce para la multiplicaci�n.
	 * @param num3 es el tercer valor real que se introduce para la multiplicaci�n.
	 * @return devuelve el <b>producto</b> de <b>ambos</b> n�meros reales
	 */
	//Producto de 3 n�meros reales
	public float productoTresReales(float num1, float num2, float num3) {
		float resultado = num1 * num2 * num3;
		return resultado;
	}
	/**
	 * Este m�todo realiza la <b>potencia</b>de dos <b>n�meros</b>.
	 * @param num1 es el primer valor que se introduce que ser� la base y ser� de tipo double.
	 * @param num2 es el segundo valor que se introduce que ser� el exponente y ser� de tipo double.
	 * @return devuelve la <b>potencia</b> de <b>ambos</b> n�meros.
	 */
	//Potencia: num2 nunca puede ser 0
	public double potenciaDouble(double num1, double num2) {
		double resultado = Math.pow(num1, num2);
		if (num2 == 0) {//El exponente no puede ser 0
			System.out.println("El exponente no puede ser 0");
		}
		if (num1 == 0){//La base no puede ser 0
			System.out.println("La base no puede ser 0");
		}
		return resultado;
	}
	
	

}