package antiguo;
import java.util.Scanner;

public class Ejercicio11Conversor {
	
	public static double convertirKMaUA (long km) {
		double ua = km / 150000000.0;
		return ua;
	}
	
	public static double convertirEurosAPeseta (double euros) {
		double pesetas = (long) euros * 166.386;
		return pesetas;
	}

	public static void main(String[] args) {
		/*
		 * Convertir de Unidad Astronómica (UA) a km. 
		 * Escribir un metodo que reciba los km en log y devuelva el numero UA en int.
		 
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Introduzca km: ");
		long km = keyboard.nextLong();
		
		double ua = Ejercicio11Conversor.convertirKMaUA(km);
		System.out.println(ua + " UA");
		
		keyboard.close();
		*/
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Introduzca euros: ");
		double euros = keyboard.nextLong();
		
		double pesetas = Ejercicio11Conversor.convertirEurosAPeseta(euros);
		System.out.println(pesetas + " pesetas");
		
		
		keyboard.close();
		

	}

}
