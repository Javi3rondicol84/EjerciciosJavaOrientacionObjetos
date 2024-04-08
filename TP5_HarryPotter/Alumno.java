package TP5_HarryPotter;

import java.util.ArrayList;

public class Alumno {
	private ArrayList <Familiar> familiares;
	private ArrayList <Cualidad> cualidades;
	private String nombre;
	
	public Alumno() {
		this.familiares = new ArrayList<Familiar>();
		this.cualidades = new ArrayList<Cualidad>();
		this.setNombre("Harry");
		this.aniadorCualidadesPorDefectoyFamiliares();
	}

	public void aniadorCualidadesPorDefectoyFamiliares() {
		Familiar f1 = new Familiar();
		Familiar f2 = new Familiar();
		f1.setNombreCasa("Slytherin");

		Cualidad c1 = new Cualidad();
		Cualidad c2 = new Cualidad();
		c2.setNombre("Salto");
		
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

	public void addFamiliar(Familiar familiar) {
		this.familiares.add(familiar);
	}
	
	public void addCualidad(Cualidad cualidad) {
		this.cualidades.add(cualidad);
	}
	
	public ArrayList<Familiar> obtenerFamiliares() {
		ArrayList <Familiar> copia = new ArrayList<Familiar>(familiares);
		
		return copia;
	}
	
	public ArrayList<Cualidad> obtenerCualidades() {
		ArrayList <Cualidad> copia = new ArrayList<Cualidad>(cualidades);
		
		return copia;
	}
	
}
