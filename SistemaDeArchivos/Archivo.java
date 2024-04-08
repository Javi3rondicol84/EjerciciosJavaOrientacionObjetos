package SistemaDeArchivos;

import java.time.LocalDate;

public class Archivo extends Elemento {
	private Double tamanio;
	private LocalDate fecha_mod;
	
	public Archivo(String nombre, Double tamanio) {
		super(nombre);
		this.tamanio = tamanio;
	}
	
	public Double getTamanio() {
		return tamanio;
	}
	
	
	public void setTamanio(Double tamanio) {
		this.tamanio = tamanio;
	}
	
	
	public LocalDate getFecha_mod() {
		return fecha_mod;
	}
	
	
}
