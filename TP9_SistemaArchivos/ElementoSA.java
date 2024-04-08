package TP9_SistemaArchivos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public abstract class ElementoSA {
	private String nombre;
	private LocalDate fechaCreacion;
	private LocalDate fechaModificacion;
	
	public ElementoSA(String nombre, LocalDate fechaCreacion, LocalDate fechaModificacion) {
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
	}
	
	
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public String toString() {
		return this.getNombre();
	}


	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}



	public LocalDate getFechaModificacion() {
		return fechaModificacion;
	}



	public void setFechaModificacion(LocalDate fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}



	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract double getTamanio();
	
	public abstract int getCantElementos();
	
	public abstract ArrayList<ElementoSA> buscar(Filtro ft, Comparator<ElementoSA> comp);
	
	public abstract ElementoSA copia();
	
	
}
