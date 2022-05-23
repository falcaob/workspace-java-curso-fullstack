package json;

import java.util.ArrayList;

public class Persona {
	
	// atributos
	private int edad;
	private String nombre;
	private ArrayList<String> aficiones;
	private boolean funcionario;
	private Direccion direccion; // objeto de direfente clase
	
	
	// constructor parametrizado
	public Persona(int edad, String nombre, ArrayList<String> aficcion, boolean funcionario) {
		this.edad = edad;
		this.nombre = nombre;
		this.aficiones = new ArrayList<String>();
		this.funcionario = funcionario;
		this.direccion = new Direccion("Castilla", 169);
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


	public boolean isFuncionario() {
		return funcionario;
	}


	public void setFuncionario(boolean funcionario) {
		this.funcionario = funcionario;
	}


	public Direccion getDireccion() {
		return direccion;
	}


	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	

}
