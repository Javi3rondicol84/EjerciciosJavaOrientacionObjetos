package TP7_V2_Agroquimicos;

import java.util.ArrayList;

public class Cultivo {
	private String nombre;
	private ArrayList<Enfermedad> enfermedadesFrecuentes;
	
	public Cultivo(String nombre) {
		this.nombre = nombre;
		this.enfermedadesFrecuentes = new ArrayList<Enfermedad>();
	}
	
	public void addEnfermedadFrecuente(Enfermedad ef) {
		if(!this.enfermedadesFrecuentes.contains(ef)) {
			this.enfermedadesFrecuentes.add(ef);
		}
	}
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public boolean productoQuimicoSirve(ProductoQuimico pq) {
		boolean trataEnfermedad = false;
		int i = 0;


		while(i < this.enfermedadesFrecuentes.size() && !trataEnfermedad) {
		
			if(pq.trataEnfermedad(this.enfermedadesFrecuentes.get(i))) {
				trataEnfermedad = true;
			}
			
			i++;
		}
		
		

		return !pq.desaconsejaCultivo(this) && trataEnfermedad;
	}
}
