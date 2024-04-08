package TP7_Agroquimicos;

import java.util.ArrayList;

public class Enfermedad {
	private String nombre;
	private ArrayList<String> estadosPatologicos;
	
	public Enfermedad(String nm) {
		this.nombre = nm;
		this.estadosPatologicos = new ArrayList<String>();
	}
	
	//aniaidr estados patologicos
	
	public void aniadirEstadoPatologico(String nm) {
		String estado = nm.toLowerCase();
		if(!this.estadosPatologicos.contains(estado)) {
			this.estadosPatologicos.add(estado);
		}
	}
	
	public void estadosDefault() {
		String e1 = "hojas amarillas";
		String e2 = "hojas mordidas";
		String e3 = "deshidratacion";
		
		this.estadosPatologicos.add(e1);
		this.estadosPatologicos.add(e2);
		this.estadosPatologicos.add(e3);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<String> obtenerEstadosEnfermedad() {
		return new ArrayList<String>(this.estadosPatologicos);
	}
	
	@Override
	public boolean equals(Object obj) {
		Enfermedad ef = (Enfermedad) obj;
		try {
			if(this.getNombre().equals(ef.getNombre())) {
				return true;
			}
		}
		catch(Exception e) {
			
		}
		
		return false;
	}
}
