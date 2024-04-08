package TP9_Padron_Electoral;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class ElementoSE {
	private String nombre;
	
	public ElementoSE(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public boolean equals(Object obj) {
		ElementoSE elemento = (ElementoSE) obj;
		
		try {
			return this.getNombre().equals(elemento.getNombre());
		}
		catch(Exception exc) {
			return false;
		}
	}
	
	public abstract int getVotosCumplen(Filtro filtro);
	
	public abstract int getCantidadTotalVotos();
	
	public abstract ArrayList<Candidato> getListaCandidatos(Comparator<Candidato> comp);
		
}
