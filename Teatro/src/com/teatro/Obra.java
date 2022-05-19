package com.teatro;

public class Obra {

	private String titulo;
	private String genero;
	private int duracion;
	private double precio;
	

	public Obra(String titulo, String genero, int duracion, double precio) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
		this.precio = precio;
	}
	
	
	public void mostrarObra() {
		System.out.println("hoy representamos " + this.titulo);
	}
	
}
