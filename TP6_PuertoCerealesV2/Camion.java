package TP6_PuertoCerealesV2;

import java.time.LocalDate;

public class Camion extends Elemento{
	private LocalDate fechaCarga;
	
	public Camion(String nombre, LocalDate fecha) {
		this.setNombre(nombre);
		this.fechaCarga = fecha;
	}
	
	@Override
	public boolean esMayor(Elemento el) {
		return this.getFecha().isAfter(((Camion) el).getFecha());
	}

	public String toString() {
		return this.getNombre();
	}
	
	public boolean equals(Object obj) {
		try {
			return this.getNombre().equals(((Camion) obj).getNombre()) && this.getFecha().equals(((Camion) obj).getFecha());
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public LocalDate getFecha() {
		return this.fechaCarga;
	}
	
	public void descargar(Barco b) {
		System.out.println("Camion "+this+" descargado en barco "+b.getNombre());
	}
}
