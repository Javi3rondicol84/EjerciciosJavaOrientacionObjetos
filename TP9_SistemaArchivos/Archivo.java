package TP9_SistemaArchivos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Archivo extends ElementoSA {
	private double tamanio;
	
	public Archivo(String nombre, Double tamanio, LocalDate fechaCreacion, LocalDate fechaModificacion) {
		super(nombre, fechaCreacion, fechaModificacion);
		this.tamanio = tamanio;
	}

	@Override
	public double getTamanio() {
		return tamanio;
	}

	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}

	@Override
	public int getCantElementos() {
		return 1;
	}

	@Override
	public ArrayList<ElementoSA> buscar(Filtro ft, Comparator<ElementoSA> comp) {
		ArrayList<ElementoSA> lista = new ArrayList<ElementoSA>();
		
		if(ft.cumple(this)) {
			lista.add(this);
		}
		
		return lista;
	}

	@Override
	public Archivo copia() {
		Archivo copia = new Archivo(this.getNombre(), this.getTamanio(), this.getFechaCreacion(), this.getFechaModificacion());
		return copia;
	}
	
	

}
