package SistemaDeArchivos;

import java.time.LocalDate;

public abstract class Elemento {
	private String nombre;
	private LocalDate fechaCreacion;
	
	public Elemento(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract Double getTamanio();
	
	public int getCantElementos() {
		return 1;
	}
	
}
