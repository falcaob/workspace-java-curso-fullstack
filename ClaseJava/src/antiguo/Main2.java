package antiguo;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		//System.out.println(4.3 >= 4);
		//System.out.println(1 == 2);
		//System.out.println(4 < 4);
		//System.out.println(2 != 5);
		
		
		/*
		 * Ejercicio: escribe un programa con una variable de tipo entero (a) y un 	condicional que evalue si el elemento es pae o impar utilizando el operador %.
		 
		
		int a = 5;
		
		if (a % 2 == 0) {
			System.out.println("es par");
		} else {
			System.out.println("es impar");
		}
		
		*/
		
		
		
		
		
		/*
		 * Introduccion de datos por teclado
		 
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Introduzca numero:");
		
		// aqu� se queda detenido el programa hasta que pulses intro
		int numero = keyboard.nextInt();
		System.out.println(numero);
				
		// buena practica siempre esto para que no pete programa
		// keyboard.close();
		*/
		
		
		
		
		
		
		/*
		 * Realiza programa que calcule la media de tres notas pedidas al usuario.
		 */
		 
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Introduzca primera nota:");
		double nota1 = keyboard.nextDouble();
		
		System.out.print("Introduzca segunda nota:");
		double nota2 = keyboard.nextDouble();
		
		System.out.print("Introduzca tercera nota:");
		double nota3 = keyboard.nextDouble();
		
		
		System.out.printf("La nota media es: %f ", (nota1 + nota2 + nota3) / 3).println();
		
		/*
		 * EL DEL PROFE
		 * double notaMedia = (nota1 + nota2 + nota3) / 3;
			System.out.println("La nota media es " + notaMedia);
			System.out.printf("La nota media es %f", notaMedia);
			
			print / prinln / printf
		 */
		
		
		
		
		
		/*
		 * Amplia el programa anterior para que diga la nota media (insuficiente (<5),
		 * suficiente (>=5 y <6), bien(>=6 y <8), notable(>=8 y <9) o sobresaliente(>=9).
		 *  Si la nota no est� entre 0 y 10, mostrar en pantalla un aviso con println.
		 */
		
		double notaMedia = (nota1 + nota2 + nota3) / 3;
		
		if (notaMedia <5) {
			System.out.println("Insuficiente");
		}
		else if ((notaMedia >= 5) && (notaMedia < 6)) {
			System.out.println("Suficiente");
		} 
		else if ((notaMedia >= 6) && (notaMedia < 8)) {
			System.out.println("Bien");
		}
		else if ((notaMedia >= 8) && (notaMedia < 9)) {
			System.out.println("Notable");
		}
		else if ((notaMedia >= 9) && (notaMedia < 10)) {
		System.out.println("Sobresaliente");
		}
		else {
			System.out.println("La nota media no está entre 0 y 10");
		}
		
		keyboard.close();

	}

}
