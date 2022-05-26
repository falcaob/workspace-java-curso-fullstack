package myapp;

import java.util.Scanner;

import utils.main.UEmail;

public class Main {

	public static void main(String[] args) {
		
		// UEmail.send("pruebacore12@gmail.com", "", "", "");
		
		/*
		 * Cuenta de correo: pruebacore122a@gmail.com
			Contraseña: pepitoperez
		 */
		
		/*
		 * 1. Registrar un nuevo usuario: solicita el nombre de usuario, password y correo
			2. Autenticación
			3. Cambiar contraseña
			4. Listar usuarios
			5. Eliminar usuario
			6. Salir
		 */
		
		Scanner keyboard = new Scanner(System.in);

		int eleccion = 6;
		
		do {

			System.out.println("---");
			System.out.println("1. Registrar nuevo usuario");
			System.out.println("2. Autenticación");
			System.out.println("3. Cambiar contraseña");
			System.out.println("4. Listar usuarios");
			System.out.println("5. Eliminar usuario");
			System.out.println("6. Salir");
			System.out.println("---");
			System.out.print("Introduzca elección: ");
			eleccion = keyboard.nextInt();
		} while (eleccion != 6);

		if (eleccion == 1) {
			Main.resgitrarNuevoUsuario(keyboard);
		} else if (eleccion == 2) {
			Main.autenticacion(keyboard);
		} else if (eleccion == 3) {
			Main.cambiarPassword(keyboard);
		} else if(eleccion == 4) {
			Main.listarUsuarios();
		} else if(eleccion == 5) {
			Main.eliminarUsuario(keyboard);
		} else if (eleccion == 6) {
			System.out.println("Salir");
		}

		keyboard.close();

	}


	private static void eliminarUsuario(Scanner keyboard) {
		// TODO Auto-generated method stub
		
	}


	private static void listarUsuarios() {
		// TODO Auto-generated method stub
		
	}


	private static void cambiarPassword(Scanner keyboard) {
		// TODO Auto-generated method stub
		
	}

	private static void autenticacion(Scanner keyboard) {
		// TODO Auto-generated method stub
		
	}

	private static void resgitrarNuevoUsuario(Scanner keyboard) {
		
		System.out.println("Usuario: ");
		String usuario = keyboard.next();
		
		
	}

}
