package Calculadora;
import java.util.Scanner;
public class MainCalculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tipoOperacion;
		System.out.println("Bienvenido elija el tipo de operacion que quiere realizar: ");
		System.out.println("1-Suma");
		System.out.println("2-Resta");
		System.out.println("3-Producto");
		System.out.println("4-Division");
		tipoOperacion = sc.nextInt();
		
		switch (tipoOperacion) {
			case(1):
				// ****** CLASE SUMA ****** //
				Suma sum = new Suma();
				
				// ****** FUNCIONES SUMA ****** //
				System.out.println("FUNCIONES DE LA SUMA");
				double suma_reales = sum.sumaReales(1.5, 2);
				System.out.println(suma_reales);
				
				int suma_enteros = sum.sumaEnteros(2, 2);
				System.out.println(suma_enteros);

				double suma_tres = sum.sumaTres(1, 2, 6);
				System.out.println(suma_tres);
				
				int suma_acc = sum.sumaAcumulado(6);
				System.out.println(suma_acc);
				int suma_acc1 = sum.sumaAcumulado(4);
				System.out.println(suma_acc1);
				break;
			case(2):
				// ****** CLASE RESTA ****** //
		        Resta res = new Resta(); 
		        
		        // ****** FUNCIONES RESTA ****** //
		        System.out.println("FUNCIONES DE LA RESTA");
				double resta_reales = res.resta1(1,2);
				System.out.println(resta_reales);
				
				int resta_enteros = res.resta2(5,3);
				System.out.println(resta_enteros);

				double resta_tres = res.restaVersion1(5,3,1);
				System.out.println(resta_tres);
				
				double resta_acc = res.restaValorAcumulado(6);
				System.out.println(resta_acc);
				double resta_acc1 = res.restaValorAcumulado(4);
				System.out.println(resta_acc1);
				break;
				
			case(3):
				// ****** CLASE PRODUCTO ****** //
		        Producto pro = new Producto(); 
		        
		        // ****** FUNCIONES PRODUCTO ****** //
		        System.out.println("FUNCIONES DEL PRODUCTO");
				double producto_reales = pro.productoDosReales(1,2);
				System.out.println(producto_reales);
				
				int producto_enteros = pro.productoDosEnteros(5,3);
				System.out.println(producto_enteros);

				double producto_tres = pro.productoTresReales(5,3,1);
				System.out.println(producto_tres);
				
				double potencia_reales = pro.potenciaDouble(2,2);
				System.out.println(potencia_reales);
				break;
				
			case(4):
				// ****** CLASE DIVISION ****** //
		        Division div = new Division(); 
		        
		        // ****** FUNCIONES DIVISION ****** //
		        System.out.println("FUNCIONES DE LA DIVISION");
				double division_reales = div.divDosReales(1,2);
				System.out.println(division_reales);
				
				int division_enteros = div.divDosEnteros(5,3);
				System.out.println(division_enteros);

				int inversion_reales = div.inversioNumReal(1234);
				System.out.println(inversion_reales);
				
				double raiz_reales = div.raiz(6);
				System.out.println(raiz_reales);
				break;
		}		

	}

}
