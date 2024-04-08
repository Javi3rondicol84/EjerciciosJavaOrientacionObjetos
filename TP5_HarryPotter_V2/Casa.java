package TP5_HarryPotter_V2;

import java.util.ArrayList;


public class Casa {
	protected ArrayList<Casa> enemigos;
	protected ArrayList<String> cualidades;
	protected ArrayList<Alumno> alumnos;
	private int tope_casa = 2;
	private String nombre;
	
	public Casa() {
		this.enemigos = new ArrayList<Casa>();
		this.alumnos = new ArrayList<Alumno>();
		this.cualidades = new ArrayList<String>();
		this.setNombre("Griffindor");
		this.aniadirCualidadesPorDefecto();
	}
	
	public void aniadirEnemigoPorDefecto() {
		
		Casa e1 = new Casa(); //Bucle aqui porque ejecuta el constructor casa que a su vez crea una casa que a su vez...
		e1.setNombre("Slytherin");
		
		if(!enemigos.contains(e1)) {
			enemigos.add(e1);
		}
		else {
			System.out.println("La casa no se puede enemistar consigo misma");
		}
		
	}
	
	public void aniadirEnemigo(Casa cs) {
		
		if(!enemigos.contains(cs)) {
			enemigos.add(cs);
		}
		else {
			System.out.println("La casa no se puede enemistar consigo misma");
		}
		
	}
	
	public boolean noEsCasaEnemiga(Alumno al) { //verificar que el alumno no se aniada a una casa enemiga de la casa en la que está
		
		for(int i = 0; i < this.enemigos.size(); i++) {
			if(this.enemigos.get(i).getNombre().equals(this.getNombre())) {
				System.out.println("El alumno "+al.getNombre()+" no puede aniadirse a la casa "+this.getNombre()+" porque es enemiga");
				return false;
			}
		}
		
		
		return true;
	}

	public void aniadirCualidadesPorDefecto() {
		String c2 = "Salto";
		String c1 = "Inteligencia";
		
		this.addCualidad(c1);
		this.addCualidad(c2);
	}
	
	public void addCualidad(String cualidad) {
		if(!cualidades.contains(cualidad)) {
			this.cualidades.add(cualidad);
		}
	}
	
	public void aniadirAlumno(Alumno al) {
		if(this.alumnos.size() < this.getTope_casa()) {
			
			if(!this.alumnos.contains(al)) {
				
				if(esApto(al) && (noEsCasaEnemiga(al))) {
					this.alumnos.add(al);
					System.out.println("El alumno "+al.getNombre()+" se aniadio a la casa "+this.getNombre());
				}
				else {
					System.out.println("El alumno "+al.getNombre()+" NO se aniadio a la casa "+this.getNombre() + " ya que no tiene las cualidades necesarias");
				}
				
			}
			else {
				System.out.println("El alumno "+al.getNombre()+" ya está en la casa "+this.getNombre()+", no se puede aniadir de nuevo a una casa");
			}
		}
		else {
			System.out.println("El Alumno "+al.getNombre()+" no se anadio a La casa "+this.getNombre()+" por que está llena");
		}
	
	}
	
	public boolean esApto(Alumno al) {
		ArrayList<String> cual_alums = al.obtenerCualidades();
		int suma = 0;
		
		for(int i = 0; i < this.cualidades.size(); i++) {
			
			if(cual_alums.contains(this.cualidades.get(i))) {
				suma++;
			}
			
		}
		
		if(suma == this.cualidades.size()) {
			return true;
		}
		
		
		return false;
	}
	
	
	@Override
	public boolean equals(Object o1) {
		
		try {
			Casa cs = (Casa) o1;
			
			return this.getNombre().equals(cs.getNombre());
			
		}
		catch(Exception e) {
			
		}
		
		
		return false;
	}
	
	
	public ArrayList<Alumno> obtenerAlumnos() {
		ArrayList<Alumno> copia = new ArrayList<Alumno>(alumnos);
		return copia;
	}
	
	
	public int getTope_casa() {
		return tope_casa;
	}
	public void setTope_casa(int tope_casa) {
		this.tope_casa = tope_casa;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
