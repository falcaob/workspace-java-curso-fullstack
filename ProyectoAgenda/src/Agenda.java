import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Agenda {
	
	// Key / Valor
	private HashMap<String, Contacto> contactos;
	
	// constructor 
	public Agenda() {
		this.contactos = new HashMap<String, Contacto>();
		this.leerEnDisco();
	}
	
	public boolean agregarContacto(Contacto nuevocontacto) {
		
		// extraemos el nombre del nuevoContacto que queremos agregar
		String nombre = nuevocontacto.getNombre();
		
		// ver si ya existe el nombre entre los contactos
		if(this.contactos.containsKey(nombre)) {
			return false;
		}
		// aquí el nombre no existe y lo agregamos 
		this.contactos.put(nombre, nuevocontacto);
		
		this.escribirEnDisco();
		
		return true;
		
	}
	
	public boolean eliminarContacto(String nombre) {
		
		// si el nombre del nuevo contacto NO existe en los contactos
		if(!this.contactos.containsKey(nombre)) {
			return false;
		}
				
		// elimina el contacto de el HashMap de contactos
		this.contactos.remove(nombre);
		
		this.escribirEnDisco();
				
		return true;
	}
	
	public boolean existeContacto(String nombre) {
		return this.contactos.containsKey(nombre);
		
	}
	
	public void listarContactos() {
		// iterar los contacto (HashMap) mediante un forEach
		for(String nombre : this.contactos.keySet()) {
			// extraer contacto a partir del nombre del contacto
			//Contacto contacto = this.contactos.get(nombre);
			//System.out.println(nombre + " tiene el teléfono " + contacto.getTelefono());
			this.contactos.get(nombre).mostrarInfo();
		}
	}
	
	// si existe el contacto, retornamos el contacto y si no, null
	public Contacto buscarContacto(String nombre) {
		// operador ternario
		return (this.contactos.containsKey(nombre)) ?
				this.contactos.get(nombre) : null;
		}
	
	
	public void listarContactosAlfabeticamente() {

		ArrayList<String> nombres = new ArrayList<>(this.contactos.keySet());
		Collections.sort(nombres);
		
		for (String nombre : nombres) {
			System.out.println(nombre 
					+ " tiene el teléfono " 
					+ this.contactos.get(nombre).getTelefono());
		}
		
	}
	
	private void leerEnDisco() {
		
		try {
			// cargo contactos aquí a través del archivo
			String contenidoJSON = new String ( Files.readAllBytes( Paths.get("agenda.json") ) );
			
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			Agenda agenda = gson.fromJson(contenidoJSON, Agenda.class);
			this.contactos = agenda.getContactos();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
	}

	public HashMap<String, Contacto> getContactos() {
		return contactos;
	}
	
	private void escribirEnDisco() {
		// inicializacion
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		// this para acceder a los atributos de la misma clase donde me encuentro
		// conversion de objeto Java (Agenda) a String formato JSON
		String contenidoJSON = gson.toJson(this);
		
		try {
			FileWriter fileWriter = new FileWriter("agenda.json");
			fileWriter.write(contenidoJSON);
			fileWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
