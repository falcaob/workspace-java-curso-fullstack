package com.teatro;

import java.util.Scanner;

public class Obra extends Teatro {

	private String titulo;
	private String genero;
	private int duracion;
	private double precio;
	
	

	public Obra(String teatro, String calle, int superficie, int accesos, String titulo, String genero, int duracion, double precio) {
		
		// invocación al constructor de la superclase (Teatro)
		super(teatro, calle, superficie, accesos);
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
		this.precio = precio;
	}



	public void mostrarObra() {
		System.out.println("Hoy representamos " + this.titulo + ", género: " + 			this.genero + ", Duracion:" + this.duracion);
	}
	
	public void mostrarPrecio() {
		System.out.println("Precio: " + this.precio);
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getGenero() {
		return genero;
	}



	public void setGenero(String genero) {
		this.genero = genero;
	}



	public int getDuracion() {
		return duracion;
	}



	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}


	// opción 1 del menú
	public void verProgramacion() {
		this.mostrarObra();
		this.mostrarTeatro();
		this.mostrarPrecio();
	}
	
	public boolean estaOcupadoLocalidad(int fila, int butaca) {
		for(Localidad localidad : this.localidades) {
			if((localidad.getFila() == fila) && (localidad.getButaca() == butaca)) {
				// para acceder al get de un booleano .is
				return localidad.isOcupado();
			}
		}
		
		// en este punto del método, la localidad No existe
		return true;
	}


	// opción 2 del menú
	public void mostrarTodasLocalidades() {
		
		int contador = 0;
		// contador = 10; para que haga el salto 
		
		for(Localidad localidad : this.localidades) {
			
//			String ocupada = (CONDICION) ? VALOR_SI_CUMPLE : VALOR_SI_NO_CUMPLE;
			String ocupada = (localidad.isOcupado()) ? "Ocupada" : "Libre";
			System.out.print(localidad.getFila() + "." + localidad.getButaca() + " "  + ocupada + "  ");
			
			contador++;
			if(contador == 10) {
				System.out.println();
				contador = 0;
			}
		}
		
	}


	// opción 3 del menú
	public void mostrarLocalidadesOcupadas() {


		for(Localidad localidad : this.localidades) {
			if(localidad.isOcupado()) {
				System.out.println(localidad.getFila() + "." + localidad.getButaca()
				+ " " + localidad.getNombre() +", Tlf: " + localidad.getTelefono()
				+ ", Tipo: " + localidad.getTipo());
			}
				
			
		}
		
	}


	// opción 4 del menú
	public void venderLocalidad(Scanner keyboard) {
		
		System.out.println("¿En qué final quieres sentarte (0-4)? ");
		int fila = keyboard.nextInt();
		
		System.out.println("¿Y qué butaca (0-9)? ");
		int butaca = keyboard.nextInt();
		
		System.out.println("¿Cómo se llama? ");
		String nombre = keyboard.next();
		
		System.out.println("¿Su teléfono? ");
		int telefono = keyboard.nextInt();
		
		System.out.println("¿Cuántos años tiene? ");
		int edad = keyboard.nextInt();
		
		if(this.estaOcupadoLocalidad(fila, butaca)) {
			System.out.println("Esta ocupada o no existe la localidad");
			return;
		}
		
		
		
		// validación para el nombre
		if(nombre.length() == 0) {
			System.out.println("El nombre no puede estar vacio");
			return;
		}
		
		
		
		// en este punto del programa puedo reservar la localidad
		
		for(Localidad localidad : this.localidades) {
			if((localidad.getFila() == fila) && (localidad.getButaca() == butaca)) {
				localidad.reservarLocalidad(nombre, telefono, edad, this.precio);
				System.out.println("Se ha vendido la localidad "
						+ localidad.getFila() + "." + localidad.getButaca()
						+ " a " + localidad.getNombre() + " por " 
						+ localidad.getPrecioTotal() + " euros");
			}
		}
		
		
	}
	
	
	
	
		
}
	
	
	
	
