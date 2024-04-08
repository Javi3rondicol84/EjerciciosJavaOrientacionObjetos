package TP7_V2_Agroquimicos;

import java.util.ArrayList;

public class Enfermedad {
	private String nombre;
	private ArrayList<String> estadoPatologicosQueCausa;
	
	public Enfermedad(String nombre) {
		this.nombre = nombre;
		this.estadoPatologicosQueCausa = new ArrayList<String>();
	}
	
	public void addEstadoPatologicosQueCausa(String estado) {
		if(!this.estadoPatologicosQueCausa.contains(estado)) {
			this.estadoPatologicosQueCausa.add(estado);
		}
		
	}
	
	public ArrayList<String> getEstadosPatologicos() {
		return new ArrayList<String>(this.estadoPatologicosQueCausa);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
