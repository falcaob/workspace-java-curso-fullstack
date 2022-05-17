package antiguo;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que obtenga los numeros enteros comprendidos entre dos
		 * numeros introducidos por teclado y validados como distintos.
		 * Mostrar numeros comprendidos entre numero1 y numero2.
		 */
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Introduzca un numero: ");
		int numero = keyboard.nextInt();
		System.out.print("Introduzca otro numero: ");
		int numero2 = keyboard.nextInt();
		
		if(numero == numero2) {
			System.out.println("Los numeros son iguales");
			keyboard.close();
			return;
		}
		
		int numeroMayor, numeroMenor;
		
		if(numero > numero2) {
			numeroMayor = numero;
			numeroMenor = numero2;
		}
		else{
			numeroMayor = numero2;
			numeroMenor = numero;
		}
		
		// java no entiende el valor de las variables con el else if
		
		
		System.out.println("Continua el progarama...");
		
		for( int i = numeroMenor; i <= numeroMayor; i++) {
			System.out.println(i);
		}
		
		
		
		
		
		// salida del programa para que no haya memoria residual
		keyboard.close();
	}

}
