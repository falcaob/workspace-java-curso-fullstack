import java.util.Scanner;

public class Main4 {
	
	public static void menuGestores () {
		System.out.println("Gestores");
	}
	
	public static void menuClientes () {
			System.out.println("Clientes");
	}
	
	public static void menuTranferencias () {
		System.out.println("Tranferencias");
	}
	
	public static void menuMensajes () {
		System.out.println("Mensajes");
	}
	
	public static void menuPrestamos () {
		System.out.println("Prestamos");
	}
	
	public static void Salir () {
		System.out.println("Salir");
	}

	
	
	public static void main(String[] args) {
		/*
		 * Ejercicio proyecto (Main4): reutiliza el programa desarrollado para mostrar
		 * los mensajes (Gestores, Clientes, Transferencias, Mensajes, Prestamos) en
		 * metodos (un metodo por cada mensaje).
		 */
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Introduce numero: ");
		int eleccion = keyboard.nextInt();
		
		/*
		do {
			System.out.println("---");
			System.out.println("1. Gestores");
			System.out.println("2. Clientes");
			System.out.println("3. Transferencias");
			System.out.println("4. Mensajes");
			System.out.println("5. Prestamos");
			System.out.println("6. Salir");
			System.out.println("---");
			System.out.print("Introduzca eleccion: ");
			eleccion = keyboard.nextInt();
		} while (eleccion != 6);
		*/
		
		
		if (eleccion == 1) {
			Main4.menuGestores();
		} else if (eleccion == 2) {
			Main4.menuClientes();
		} else if (eleccion == 3) {
			Main4.menuTranferencias();
		} else if (eleccion == 4) {
			Main4.menuMensajes();
		} else if (eleccion == 5) {
			Main4.menuPrestamos();
		} else if (eleccion == 6) {
			Main4.Salir();
		}
		 
		
		
		keyboard.close();

	}

}