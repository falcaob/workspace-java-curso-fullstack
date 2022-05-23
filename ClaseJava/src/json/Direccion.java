package json;

public class Direccion {
	
	private String nombre;
	private int numero;
	
	// constructor
	public Direccion(String nombre, int numero) {
		super();
		this.nombre = nombre;
		this.numero = numero;
	}

	// getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
