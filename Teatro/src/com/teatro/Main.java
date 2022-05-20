package com.teatro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Obra obra = new Obra("LA BOMBILLA DE DON BLAS", "Sol, 45", 300, 2, "La cena de los idiotas", 		"comedia", 95, 30.0);
		
		//System.out.println(obra.getLocalidades().size()); //error, tengo 50 localidades
		
		// mostramos el menú
		 Main.menu(obra);
	}
	
	
	
	public static void menu(Obra obra) {
		
		Scanner keyboard = new Scanner(System.in);

		int eleccion = 0;
		
		do {

			System.out.println("-------------------------------");
			System.out.println("Teatro: " + obra.getNombre());
			System.out.println("-------------------------------");
			System.out.println("1. Ver la programación actual");
			System.out.println("2. Mostrar todas las localidades");
			System.out.println("3. Mostrar localides ocupadas");
			System.out.println("4. Vender localidad");
			System.out.println("5. Cancelar localidad");
			System.out.println("6. Consultar localidad");
			System.out.println("7. Calcular recaudación");
			System.out.println("8. Terminar programa\n");
			System.out.print("¿Qué opción desea? ");
			eleccion = keyboard.nextInt();

			if (eleccion == 1) {
				obra.verProgramacion();
			} else if (eleccion == 2) {
				obra.mostrarTodasLocalidades();
			} else if (eleccion == 3) {
				obra.mostrarLocalidadesOcupadas();
			} else if (eleccion == 4) {
				obra.venderLocalidad(keyboard);
			}

		} while (eleccion != 8);
		
		keyboard.close();
	}
	

}
