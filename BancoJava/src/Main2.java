import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		System.out.println("1. Gestores");
		System.out.println("2. Clientes");
		System.out.println("3. Transferencias");
		System.out.println("4. Mensajes");
		System.out.println("5. Pr�stamos");
		System.out.println("6. Salir");

		/*
		 * Ejercicio proyecto (Main2): Solicita continuamente un numero al usuario
		 * hasta que este sea 6
		 */
		
		int eleccion;
	
		do {
			System.out.print("Introduzca eleccion: ");
			eleccion = keyboard.nextInt();
		} while (eleccion != 6);
		

		if (eleccion == 1) {
			System.out.println("Gestores");
		} else if (eleccion == 2) {
			System.out.println("Clientes");
		} else if (eleccion == 3) {
			System.out.println("Transferencias");
		}
		
		
		/* 
		 * CON WHILE
		 * 
		 * int eleccion = 0;
		while(eleccion != 6) {
			System.out.print("Introduzca elecci�n: ");
			eleccion = keyboard.nextInt();
		}
		
		if (eleccion == 1) {
			System.out.println("Gestores");
		} 
		else if (eleccion == 2) {
			System.out.println("Clientes");
		} 
		else if (eleccion == 3) {
			System.out.println("Transferencias");
		}
		else if (eleccion == 6) {
			System.out.println("Salir");
		}
		 */

		keyboard.close();
	}

}
