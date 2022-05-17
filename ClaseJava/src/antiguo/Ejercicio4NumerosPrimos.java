package antiguo;
import java.util.Scanner;

public class Ejercicio4NumerosPrimos {

	public static void main(String[] args) {
		/*
		 * Ejercicio: escribe un programa que dado un numero, calcule si es primo o no.
		 * Un numero primo es un numero natural mayor que 1 que tiene unicamente dos
		 * divisores distintos: el mismo y el 1.
		 */
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		int numero = keyboard.nextInt();
		
		for(int i=numero-1; i >= 2; i--) {
			System.out.println(numero + "%" + i + " = " + numero%i);
			if(numero % i == 0) {
				System.out.println("No es primo");
				break;
			}
		}
	}

}
