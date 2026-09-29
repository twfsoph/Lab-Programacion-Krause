package main.java.com.trabajopractico.tp4.ej4;

public class Cancion {
	private String titulo;
	private int duracion;
	
	public Cancion(String titulo, int duracion) {
		this.titulo = titulo;
		this.duracion = duracion;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
}