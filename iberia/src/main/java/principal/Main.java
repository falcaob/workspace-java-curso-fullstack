package principal;

import java.time.LocalTime;

import modelos.Vuelo;

public class Main {

	public static void main(String[] args) {
		
		Iberia iberia = new Iberia();
		
		//iberia.vaciarBaseDatos();
		iberia.insertarDatos();
		
		// el primer parámetro es el id de avión y el segundo, id de la base 
		iberia.llevarAvionABase(2,6);
		iberia.llevarAvionABase(1,1);
		iberia.llevarAvionABase(3,1);
		
		// el primer prámetro es el id del avión 
		// hay que pasarle atributos del objeto Vuelo
		Vuelo vuelo = new Vuelo(0, "Madrid", "Roma", LocalTime.now(), "MA-RO", 1);
		iberia.volarAvion(1, vuelo);
		
		Vuelo vuelo2 = new Vuelo(0, "Nueva York", "Londres", LocalTime.now(), "NY-LO", 1);
		iberia.volarAvion(4, vuelo2);
		
		Vuelo vuelo3 = new Vuelo(0, "Seúl", "Tokio", LocalTime.now(), "SE-TO", 1);
		iberia.volarAvion(2, vuelo3);
		
		iberia.crearVuelosParaAvion();

	}

}
