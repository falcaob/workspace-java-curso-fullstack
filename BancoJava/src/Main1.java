import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		
		/*
		 * implementa un programa que solicite al usuario que introduzca un numero por
		 * pantalla y en funcion del numero introducido se muestre el siguiente mensaje
		 * para cada numero:
		 * 
		 * 1 --> Gestores
		 * 
		 * 2 --> Clientes
		 * 
		 * 3 --> Transferencias
		 * 
		 * 4 --> Mensajes
		 * 
		 * 5 --> Prestamos
		 * 
		 * 6 -> Salir
		 * 
		 * Para el resto de numeros no se mostrará ningún mensaje por pantalla.
		 */
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("1 --> Gestores");
		System.out.println("2 --> Clientes");
		System.out.println("3 --> Transferencias");
		System.out.println("4 --> Mensajes");
		System.out.println("5 --> Prestamos");
		System.out.println("6 --> Salir");
		System.out.println("Introduca un numero: ");
		int eleccion = keyboard.nextInt();
		
		
		if (eleccion == 1) {
			System.out.println("Gestores");
		} 
		else if (eleccion == 2) {
			System.out.println("Clientes");
		}
		else if (eleccion == 3) {
			System.out.println("Transferencias");
		}
		else if (eleccion == 4) {
			System.out.println("Mensajes");
		}
		else if (eleccion == 5) {
			System.out.println("Prestamos");
		}
		else if (eleccion == 6) {
			System.out.println("Salir");
		}
		
		
		// importante no olvidar para que no pete
		keyboard.close();

	}

}
