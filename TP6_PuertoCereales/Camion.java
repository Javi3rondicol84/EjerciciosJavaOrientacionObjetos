package TP6_PuertoCereales;

import java.time.LocalDate;


public class Camion{
	private String nombre;
	private LocalDate fechaCarga;
	
	public Camion(String nm, LocalDate fecha) {
		this.nombre = nm;
		this.fechaCarga = fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate obtenerFechaCarga() {
		return fechaCarga;
	}

	public String toString() {
		return this.nombre;
	}
	
	public void descargarCamion() {
		System.out.println("Camion descargado: " + this);
	}
	
	
}
