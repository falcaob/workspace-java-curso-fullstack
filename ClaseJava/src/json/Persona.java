package json;

import java.util.ArrayList;

public class Persona {
	
	// atributos
	private int edad;
	private String nombre;
	private ArrayList<String> aficiones;
	
	
	// constructor parametrizado
	public Persona(int edad, String nombre, ArrayList<String> aficcion) {
		this.edad = edad;
		this.nombre = nombre;
		this.aficiones = new ArrayList<String>();
	}


	public void insertarAficion(String aficion) {
		this.aficiones.add(aficion);
	}	

	// sobreescritura de un método
	@Override
	public String toString() {
		return "Persona [edad=" + edad + ", nombre=" + nombre + ", aficiones=" + aficiones + "]";
	}

	
	
	// getters and setters
	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public ArrayList<String> getAficcion() {
		return aficiones;
	}
		

}
