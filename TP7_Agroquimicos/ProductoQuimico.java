package TP7_Agroquimicos;

import java.util.ArrayList;

public class ProductoQuimico {
	private String nombre;
	
	private ArrayList<String> estadosPatologicosQueTrata;
	private ArrayList<Cultivo> cultivosDesaconsejados;
	
	public ProductoQuimico(String nm) {
		this.nombre = nm;
		this.estadosPatologicosQueTrata = new ArrayList<String>();
		this.estadosDefault();
		this.cultivosDesaconsejados = new ArrayList<Cultivo>();
	}
	
	public void aniadirEstadoPatologico(String nm) {
		String estado = nm.toLowerCase();
		if(!this.estadosPatologicosQueTrata.contains(estado)) {
			this.estadosPatologicosQueTrata.add(estado);
		}
	}
	
	public void estadosDefault() {
		String e1 = "hojas amarillas";
		String e2 = "hojas mordidas";
		String e3 = "deshidratacion";
		
		this.estadosPatologicosQueTrata.add(e1);
		this.estadosPatologicosQueTrata.add(e2);
		this.estadosPatologicosQueTrata.add(e3);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		return this.getNombre();
	}
	
	
	public boolean trataEnfermedad(Enfermedad ef) {
		return this.estadosPatologicosQueTrata.containsAll(ef.obtenerEstadosEnfermedad());
	}
	
	@Override
	public boolean equals(Object obj) {
		ProductoQuimico pq = (ProductoQuimico) obj;
		try {
			return this.getNombre().equals(pq.getNombre());
		}
		catch(Exception e) {
			
		}
		
		return false;
	}
	
}
