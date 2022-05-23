package json;

import com.google.gson.Gson;

public class Main {

	public static void main(String[] args) {
		
		// hay que importarlo
		Gson gson = new Gson();
		
		// inicializacion
		Persona persona = new Persona(25, "Chema", null);
		persona.insertarAficion("ajedrez");
		System.out.println(persona);
		
		String personaJSON = gson.toJson(persona);
		System.out.println(personaJSON);
	}

}
