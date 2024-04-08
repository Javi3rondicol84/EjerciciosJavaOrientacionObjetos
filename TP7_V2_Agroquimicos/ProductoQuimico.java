package TP7_V2_Agroquimicos;

import java.util.ArrayList;

public class ProductoQuimico {
	private String nombre;
	private ArrayList<Cultivo> cultivosDesaconsejados;
	private ArrayList<String> estadosPatologicosQueTrata;
	
	
	
	public ProductoQuimico(String nombre) {
		this.nombre = nombre;
		this.cultivosDesaconsejados = new ArrayList<Cultivo>();
		this.estadosPatologicosQueTrata = new ArrayList<String>();
		
	}
	
	

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public void addCultivoDesaconsejado(Cultivo cv) {
		if(!this.cultivosDesaconsejados.contains(cv)) {
			this.cultivosDesaconsejados.add(cv);
		}
		
	}
	
	public void addEstadoQueTrata(String estado) {
		if(!this.estadosPatologicosQueTrata.contains(estado)) {
			this.estadosPatologicosQueTrata.add(estado);
		}
		
	}
	
	public boolean trataEnfermedad(Enfermedad ef) {
		return this.estadosPatologicosQueTrata.containsAll(ef.getEstadosPatologicos());
	}
	
	public boolean desaconsejaCultivo(Cultivo cv) {
		return this.cultivosDesaconsejados.contains(cv);
	}
}
