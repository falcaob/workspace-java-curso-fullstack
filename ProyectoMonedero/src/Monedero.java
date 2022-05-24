import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Monedero {

	private double cantidad;
	
	public Monedero(double cantidad) {
		this.cantidad = cantidad;
	}
	
	public void verDinero() {
		System.out.println("Tengo " + this.cantidad + " € en el monedero");
	}
	
	public void meterDinero(double dinero) {
		// this.cantidad = this.cantidad + dinero
		this.cantidad += dinero;
	}
	
	public void sacarDinero(double dinero) {
		this.cantidad -= dinero;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void leerEnDisco() {

		try {
			String contenido = new String ( Files.readAllBytes( Paths.get("monedero.txt") ) );
			this.cantidad = Double.parseDouble(contenido); // de String a Double
			// 
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("No existe el archivo monedero.txt");
		}	
	}

	public void guardarEnDisco() {
		try {
			FileWriter fileWriter = new FileWriter("monedero.txt");
			// para escribir
			fileWriter.write(String.valueOf(this.cantidad)); // de Double a String
			fileWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
	
}
