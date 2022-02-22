package Calculadora;
/**
 * Esta clase está dedicada a implementar los métodos de la suma necesarios para implementar una 
 * series de clase que compongan una calculadora.
 * @author Rubén de Pablo Gómez 1º DAW
 * @since 27/01/2022
 * @version version v1.0
 */


public class Producto {
	/**
	 * Este metodo realiza el <b>producto</b> de dos <b>numeros reales</b>.
	 * @param num1 es el primer valor real que se introduce para la multiplicación.
	 * @param num2 es el segundo valor real que se introduce para la multiplicación
	 * @return devuelve el <b>producto</b> de <b>ambos</b> números introducidos 
	 * así como su potencia
	 */
	//Producto de 2 números reales
	public float productoDosReales(float num1, float num2) {
		float resultado = num1 * num2;
		return resultado;
	}
	/**
	 * Este método realiza el <b>producto</b>de dos <b>números enteros</b>.
	 * @param num1 es el primer valor entero que se introduce para la multiplicación.
	 * @param num2 es el segundo valor entero que se introduce para la multiplicación.
	 * @return devuelve el <b>producto</b> de <b>ambos</b> números enteros
	 */
	//Producto de 2 números enteros
	public int productoDosEnteros(int num1, int num2) {
		int resultado = num1 * num2;
		return resultado;
	}
	/**
	 * Este método realiza el <b>producto</b>de tres <b>números reales</b>.
	 * @param num1 es el primer valor real que se introduce para la multiplicación.
	 * @param num2 es el segundo valor real que se introduce para la multiplicación.
	 * @param num3 es el tercer valor real que se introduce para la multiplicación.
	 * @return devuelve el <b>producto</b> de <b>ambos</b> números reales
	 */
	//Producto de 3 números reales
	public float productoTresReales(float num1, float num2, float num3) {
		float resultado = num1 * num2 * num3;
		return resultado;
	}
	/**
	 * Este método realiza la <b>potencia</b>de dos <b>números</b>.
	 * @param num1 es el primer valor que se introduce que será la base y será de tipo double.
	 * @param num2 es el segundo valor que se introduce que será el exponente y será de tipo double.
	 * @return devuelve la <b>potencia</b> de <b>ambos</b> números.
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