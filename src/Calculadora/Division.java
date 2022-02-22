package Calculadora;

/**
 * Esta clase está dedicada a implementar los métodos de la division necesarios para implementar una 
 * series de clase que compongan una calculadora.
 * @author Oscar Ramirez Garcia
 * @since 27/01/2022
 * @version version v1.0
 *
 */

public class Division {
	
	/**
	 * Método que calcula la division entre dos numeros reales. El resultado se obtiene
	 * dividiendo el pirmer numero (numReal) entre el segundo (numReal2).
	 * 
	 * @param numReal y numReal2 son números reales de los cuales se desea obtener la division.
	 * @return un número real que será el resultado de la division.
	 * @throws RuntimeException Cuando numReal o numReal2 es null daria error. Y si el
	 * divisor es igual a 0 no se podria realizar la division.
	 */
	public double divDosReales(double numReal, double numReal2) throws RuntimeException{
		double resultado = numReal/numReal2;
		return resultado;

	}

	/**
	 * Método que calcula la division entre dos numeros enteros. El resultado se obtiene
	 * dividiendo el pirmer numero (numEntero) entre el segundo (numEntero2).
	 * 
	 * @param numEntero y numEntero2 son números reales de los cuales se desea obtener la division.
	 * @return un número real que será el resultado de la division.
	 * @throws RuntimeException Cuando numEntero o numEntero2 es null daría error. Y si el
	 * divisor es igual a 0 no se podria realizar la division.
	 */
	public int divDosEnteros(int numEntero, int numEntero2) throws RuntimeException{
		int resultado = numEntero/numEntero2;
		return resultado;
	}

	/**
	 * Método que invierte un numero entero. Este metodo se encarga de leer un numero al reves.
	 * 	 * 
	 * @param numEntero es un numero entero y el resto que sera otro numero entero.
	 * @return el inverso del numero entero o si el numero es 0 o negativo devolvera 0.
	 */

	public int inversioNumReal(int numEntero) {
		int resto;
		int invertido = 0;
	      while( numEntero > 0 ) {
	          resto = numEntero % 10;
	          invertido = invertido * 10 + resto;
	          numEntero /= 10;
	       }
	      return invertido;
	}

	/**
	 * Este método se encarga de hacer la raiz de un numero entero.
	 * 
	 * @param un solo número entero numEntero para realizar la raiz.
	 * 
	 * @return devolverá el resultado de la raiz de ese numero.
	 * @throws si el numero es negativo no se podra realiza la raiz.
	 */

	public double raiz(int numEntero) throws RuntimeException{
		double resultado = Math.sqrt(numEntero);
		return resultado;

	}

}
