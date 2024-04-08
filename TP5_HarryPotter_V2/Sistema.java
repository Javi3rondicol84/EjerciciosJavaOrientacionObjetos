package TP5_HarryPotter_V2;

import java.util.ArrayList;
import java.util.Random;

public class Sistema {
	ArrayList<Casa> casas;
	
	public Sistema() {
		this.casas = new ArrayList<Casa>();
	}
	//CORREGIR ENEMIGOS Y QUE NO SALEN TODOS LOS ALUMNOS
	public void verCasasYAlumnos() {
		ArrayList<Alumno> copiaAlumnos;
		if(this.casas.size() > 0) {

			
			for(int i = 0; i < casas.size(); i++) {
				//revisado cada casa, ver si en la casa que se esta viendo, sus alumnos.
				
				copiaAlumnos = casas.get(i).obtenerAlumnos();
				
				if(copiaAlumnos.size() > 0) {
					verAlumnos(copiaAlumnos, casas.get(i));
				}
				else {
					System.out.println("La casa "+this.casas.get(i).getNombre() + " No tiene alumnos");
				}
				
			}
			
		}
		else {
			System.out.println("No hay casas en el sistema");
		}
		
	}
	
	public void verAlumnos(ArrayList<Alumno> alum, Casa casa) {
		for(int i = 0; i < alum.size(); i++) {
			System.out.println("Esta el alumno "+alum.get(i).getNombre()+ " en la casa: "+casa.getNombre());
		}
	}
	
	public void aniadirCasa(Casa cs) {
		
		if(!this.casas.contains(cs)) {
			this.casas.add(cs);
		}
		else {
			System.out.println("La casa ya esta en el sistema");
		}
		
	}
	
	public void aniadirAlumnoCasa(Alumno al) { 
		Random r = new Random();
		int random = r.nextInt(this.casas.size());
		
		//poner lista de casas
		//el alumno no debe estar en otra casa, y dicho alumno no podra aniadirse a la lista de enemigos de la casa en la que esta
		
		
		if(!estaEnOtraCasa(al)) { 
			//ver que la casa no sea una de las casas enemigas de la casa a la que se aniadira
			this.casas.get(random).aniadirAlumno(al);
			
		}
		else {
			System.out.println("El alumno "+al.getNombre()+" ya está en la casa "+this.casas.get(random).getNombre()+", no se puede aniadir de nuevo a una casa");
		}
		
	}
	
	public boolean estaEnOtraCasa(Alumno al) {
		ArrayList<Alumno> alumnos;
		
		for(int i = 0; i < this.casas.size(); i++) {
			alumnos = this.casas.get(i).obtenerAlumnos();
			if(alumnos.contains(al)) {
				return true;
			}
		}
		
		return false;
	}
	
	
	public static void main(String [] args) {
	
		
		Sistema sist = new Sistema();
		CasaPura casa2 = new CasaPura();
		Casa casa1 = new Casa();
		casa1.setNombre("Slytherin");
		
		Alumno alumno = new Alumno();
		Alumno alumno2 = new Alumno();
		alumno2.setNombre("Hermione");
		Alumno alumno3 = new Alumno();
		alumno3.setNombre("Ron");
		
		casa1.aniadirEnemigoPorDefecto();

		sist.aniadirCasa(casa2);
		sist.aniadirCasa(casa1);
		sist.aniadirAlumnoCasa(alumno);
		sist.aniadirAlumnoCasa(alumno2);
		sist.aniadirAlumnoCasa(alumno3);
		
	
		sist.verCasasYAlumnos();
		
	
		

		
	}
	
}
