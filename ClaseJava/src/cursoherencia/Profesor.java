package cursoherencia;

public class Profesor extends Persona {

	private int numeroDeEdadesEstudiantes;
	private double sumaDeEdadesEstudiantes;
	private double estudiantesEdadMedia;
	
	// constructor parametrizado
	public Profesor(int numeroDeEdadesEstudiantes, double sumaDeEdadesEstudiantes, double estudiantesEdadMedia) {
		
		super();
		this.numeroDeEdadesEstudiantes = numeroDeEdadesEstudiantes;
		this.sumaDeEdadesEstudiantes = sumaDeEdadesEstudiantes;
		this.estudiantesEdadMedia = estudiantesEdadMedia;
	}
	
	// metodos no estaticos
	public void agregarEdadEstudiante(int edad) {
		System.out.println("Metodo agregarEdadEstudiante de Profesor");
	}
	
	public void monstrarInfo() {
		System.out.println("Metodo mostrarInfo de Profesor");
	}
	
	
	// getters and setters

	public int getNumeroDeEdadesEstudiantes() {
		return numeroDeEdadesEstudiantes;
	}

	public void setNumeroDeEdadesEstudiantes(int numeroDeEdadesEstudiantes) {
		this.numeroDeEdadesEstudiantes = numeroDeEdadesEstudiantes;
	}

	public double getSumaDeEdadesEstudiantes() {
		return sumaDeEdadesEstudiantes;
	}

	public void setSumaDeEdadesEstudiantes(double sumaDeEdadesEstudiantes) {
		this.sumaDeEdadesEstudiantes = sumaDeEdadesEstudiantes;
	}

	public double getEstudiantesEdadMedia() {
		return estudiantesEdadMedia;
	}

	public void setEstudiantesEdadMedia(double estudiantesEdadMedia) {
		this.estudiantesEdadMedia = estudiantesEdadMedia;
	}

	@Override
	public void mostrarID() {
		System.out.println(this.id);
		
	}
	
	
	
	
}
