
public class Bicicleta extends Vehiculo{
	
	private int cambios;
	
	
	// constructor
	public Bicicleta(float velocidad, int asientos, int orientacionRuedas, int cambios) {
		super(velocidad, asientos, orientacionRuedas);
		this.cambios = cambios;
	}

	
	// metodo parar de vehiculo
	public void parar () {
		System.out.println("Metodo parar de bicicleta");
	}
	

	public int getCambios() {
		return cambios;
	}


	public void setCambios(int cambios) {
		this.cambios = cambios;
	}
	
	
}
