package com.trabajopractico.tp7.ej1;

public class Producto {
	private String nombre;
	private String codigo;
	private int precio;
	
	public Producto(String nombre, String codigo, int precio) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public int getPrecio() {
		return precio;
	}
}
