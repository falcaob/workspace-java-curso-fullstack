
public class Main {

	public static void main(String[] args) {
		
		Monedero monedero = new Monedero(0.0);
		// al principio del Main
		monedero.leerEnDisco();
		
		
		monedero.meterDinero(10.50);
		monedero.meterDinero(25.50);
		monedero.meterDinero(50.50);
		
		monedero.verDinero();
		
		// al final del Main
		monedero.guardarEnDisco();
	}

}
