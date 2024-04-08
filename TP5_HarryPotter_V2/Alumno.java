package TP5_HarryPotter_V2;


import java.util.ArrayList;

public class Alumno {
	private ArrayList <String> familiares;
	private ArrayList <String> cualidades;
	private String nombre;
	
	public Alumno() {
		this.familiares = new ArrayList<String>();
		this.cualidades = new ArrayList<String>();
		this.setNombre("Harry");
		this.aniadorCualidadesPorDefectoyFamiliares();
	}

	public void aniadorCualidadesPorDefectoyFamiliares() {

		String f1 = "Slytherin";
		String f2 = "Griffindor";
		
		String c2 = "Salto";
		String c1 = "Inteligencia";
		
		this.addCualidad(c1);
		this.addCualidad(c2);
		this.addFamiliar(f1);
		this.addFamiliar(f2);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void addFamiliar(String familiar) {
		if(!this.familiares.contains(familiar)) {
			this.familiares.add(familiar);
		}
	}
	
	public void addCualidad(String cualidad) {
		if(!cualidades.contains(cualidad)) {
			this.cualidades.add(cualidad);
		}
	}
	
	public ArrayList<String> obtenerFamiliares() {
		ArrayList <String> copia = new ArrayList<String>(familiares);
		
		return copia;
	}
	
	public ArrayList<String> obtenerCualidades() {
		ArrayList <String> copia = new ArrayList<String>(cualidades);
		
		return copia;
	}
	
	@Override
	public boolean equals(Object o1) {
		
		try {
			Alumno al = (Alumno) o1;
			
			return this.getNombre().equals(al.getNombre());
		}
		catch(Exception e) {
			
		}
		
		return false;
	}
	
	
}	
	