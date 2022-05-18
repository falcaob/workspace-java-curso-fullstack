package antiguo;

public class Ejercicio12StringBuilder {

	public static void main(String[] args) {
		
		/*
		 * Ejercicio: escribe un programa que concatene dos StringBuilder, utilizando
		 * append y tambien el operador concatenacion.
		 */
		StringBuilder strb1 = new StringBuilder("hola");
		StringBuilder strb2 = new StringBuilder("adios");
		
		// strb1 es un StringBuilder (mutable) ha cambiado su valor
		// append concatenar stringbuilders
		strb1.append(strb2);
		strb2.append(strb1);
		System.out.println(strb1);
		System.out.println(strb2);
		

	}

}
