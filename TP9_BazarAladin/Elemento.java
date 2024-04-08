package TP9_BazarAladin;

import java.util.ArrayList;

public abstract class Elemento {
	private String nombre;

	protected Calculador calculador;
	
	public Elemento(String nombre) {
		this.nombre = nombre;
	}
	
	public void setCalculador(Calculador calculador) {
		this.calculador = calculador;
	}
	
	public abstract int getCantidadProductos();	
	
	public String getNombre() {
		return nombre;
	}
	
	public String toString() {
		return "Nombre: "+this.getNombre();
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract double getPrecio();
	
	public abstract double getPeso();
	
	public abstract int getCantidadTotalProductos();
	
	public abstract ArrayList<Elemento> buscar(Filtro ft);
	
	public abstract ArrayList<String> getCategorias();
	
	public abstract Producto getProductoMenorPrecio();
	
	public abstract boolean tieneCategoria(String palabra);
	
}
