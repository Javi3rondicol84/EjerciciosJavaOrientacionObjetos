package TP6_PuertoCereales;

public class Barco {
	private String nombre;
	private int capacidad;
	
	public Barco(String nm, int cap) {
		this.nombre = nm;
		this.capacidad = cap;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	public String toString() {
		return this.getNombre();
	}
	
	public void cargarBarco() {
		System.out.println("Barco: " + this);
	}
	
	
}
