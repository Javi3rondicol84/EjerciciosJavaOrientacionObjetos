package TP5_HarryPotter;

import java.util.ArrayList;

public class Casa {
	private ArrayList<Alumno> alumnos;
	private ArrayList<Cualidad> cualidades;
	private int tope_casa = 2;
	private String nombre;
	
	public Casa() {
		this.alumnos = new ArrayList<Alumno>();
		this.cualidades = new ArrayList<Cualidad>();
		this.setNombre("Griffindor");
		this.aniadorCualidadesPorDefecto();
	}
	
	public void aniadorCualidadesPorDefecto() {
		Cualidad c1 = new Cualidad();
		Cualidad c2 = new Cualidad();
		c2.setNombre("Salto");
		
		this.AniadirCualidad(c1);
		this.AniadirCualidad(c2);
	}
	
	public void AniadirCualidad(Cualidad cualidad) {
		this.cualidades.add(cualidad);
	}

	public int getTope_casa() {
		return tope_casa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void AniadirAlumno(Alumno alumno) {
		
		if(this.alumnos.size() < this.getTope_casa()) {
			if((esApto(alumno)) && (cumpleRequisitoExtra(alumno))) {
				this.alumnos.add(alumno);
				System.out.println("El alumno "+alumno.getNombre()+" se aniadio a la casa "+this.getNombre());
			}
			else {
				System.out.println("El Alumno "+alumno.getNombre()+" No cumple los requisitos para entrar a la casa "+this.getNombre());
			}
		}
		else {
			System.out.println("La casa "+this.getNombre()+" está llena");
		}
		
	}
	
	public boolean esApto(Alumno alumno) {
		boolean esApto = false;
		boolean encontrado = false;
		ArrayList<Cualidad> cuali_alumno = alumno.obtenerCualidades();
		int cumple = 0;
		int i = 0;
		int j = 0;
		if(this.cualidades.size() == cuali_alumno.size()) {
			while(i < this.cualidades.size()) {
				
				while((j < this.cualidades.size()) && (!encontrado)) {
					if(cualidades.get(i).getNombre().equals(cuali_alumno.get(j).getNombre())) {
						cumple++;
						encontrado = true;
					}
					
					j++;
				}
				
				i++;
				encontrado = false;
				j = 0;
			}
		}
		
		if(cumple == this.cualidades.size()) {
			esApto = true;
		}
		
		return esApto;
	}
	
	public boolean cumpleRequisitoExtra(Alumno alumno) {
		return true;
	}
	
	public ArrayList<Alumno> obtenerAlumnos() {
		ArrayList<Alumno> copia = new ArrayList<Alumno>(alumnos);
		return copia;
	}
	
}
