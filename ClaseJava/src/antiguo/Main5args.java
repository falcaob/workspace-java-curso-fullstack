package antiguo;

import java.util.ArrayList;

public class Main5args {

	public static void main(String[] args) {
		
		//System.out.println(args.length);
		
		// se le puede pasar parametros desde fuera en run config. > argumentos
		// args es un array que se puede iterar
		/*
		for (String arg : args) {
			System.out.println(arg);
		}
		*/
		
		// ArrayList hay que importarlos
		// a diferencia de los Array se pueden modificar para optimizarlos
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(5);
		numeros.add(6);
		numeros.add(7);
		//System.out.println(numeros);
		
		for (Integer numero : numeros) {
			System.out.println(numero);
		}
		
		// para anadir en una posicion concreta
		//coches.add(3, "Volvo");
		// metodos: set, size como length, clear, remove, contains
		// .get para extaer y tengo que pasarle la posicion del elemento
		
		// iterar un String
		String coche = "volvo";
		for (int i = 0; i < coche.length(); i++) {
			System.out.println(coche.charAt(i));
		}

	}

}
