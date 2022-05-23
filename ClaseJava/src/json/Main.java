package json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		
		// hay que importarlo
		// Gson gson = new Gson();
		// pasa mostrar parámtros de direfrente forma hay que inicializar de otra forma
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		// inicializacion
		Persona persona = new Persona(25, "Chema", null, false);
		persona.insertarAficion("ajedrez");
		persona.insertarAficion("fútbol");
		System.out.println(persona);
		
		String personaJSON = gson.toJson(persona);
		System.out.println(personaJSON);
		
		// convierte de String en formato JSON a objeto Java
		Persona persona2 = gson.fromJson(personaJSON, Persona.class);
		// se guarda en un objeto
		
		// RESUMEN: .toJSON y .fromJSON
		
	}

}
