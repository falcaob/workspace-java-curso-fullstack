
public class Coche {
	
	// declarando atributos
	private float velocidad;
	private float caballos;
	private int asientos;
	private int orientacionRuedas;
	
	// atributos estaticos
		public static final float factorConversionCvKw = 1.35f;
		// final para que no se puede cambiar
	
	// existe constructor por defecto cuando hay uno parametrizado
	public Coche() {}
	
	// constructor parametrizado
	public Coche(float velocidad, float caballos, int asientos, int orientacionRuedas) {
		//System.out.println("Constructor de la clase Coche");
		this.velocidad = velocidad;
		this.caballos = caballos;
		this.asientos = asientos;
		this.orientacionRuedas = orientacionRuedas;
	}
	
	// metodo estatico
	// convierte los caballos  (cv) a kilowatios (kw)
	public static float convertirCvKw(float cv) {
		float kw = cv / Coche.factorConversionCvKw;
		return kw;
	}
	
	// convierte los kilovatios a caballos
	public static float convertirKwCv(float kw) {
		float cv = kw * Coche.factorConversionCvKw;
		return cv;
	}
	
	
	// metodos no estaticos
	
	public void acelerar() {
//		this.velocidad = this.velocidad + 5;
		this.velocidad += 5;
		if (this.velocidad > 50) {
			this.velocidad = 50;
		}
	}
	
	public void acelerar(float incrementoVelocidad) {
		this.velocidad += incrementoVelocidad;
		if (this.velocidad > 50) {
			this.velocidad = 50;
		}
	}
	
	public void desacelerar() {
		this.velocidad -= 5;
	}
	
	public void desacelerar(float decrementoVelocidad) {
		this.velocidad -= decrementoVelocidad;
	}
	
	public void desacelerar(boolean marchaAtras) {
		if(marchaAtras) this.velocidad = -5.0f;
		else this.desacelerar();		
	}
	
	
	public void parar () {}
	//public void desacelerar () {}
	public void girarIzquierda () {}
	public void girarDerecha () {}
	
	// metodos getters and setters (son siempre public)
	// get no recibe ningun parametro, retorna
	public int getAsientos() {
		return this.asientos;
	}
	
	public float getCaballos() {
		return caballos;
	}

	public void setCaballos(float caballos) {
		this.caballos = caballos;
	}

	public float getVelocidad() {
		return velocidad;
	}

	public int getOrientacionRuedas() {
		return orientacionRuedas;
	}

	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}

}
