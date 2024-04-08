package TP5_HarryPotter;

import java.util.ArrayList;
import java.util.Random;

public class Sistema {
	private ArrayList<Casa> casas;
	
	public Sistema() {
		this.casas = new ArrayList<Casa>();
	}
	
	public static void main(String [] args) {
	
		
		Sistema sist = new Sistema();
		CasaEnemistada casa = new CasaEnemistada();
		CasaPura casa2 = new CasaPura();
		casa2.setNombre("Griffindor");
		
	
		Alumno alumno = new Alumno();
		Alumno alumno2 = new Alumno();
		Alumno alumno3 = new Alumno();
		alumno2.setNombre("Hermione");
		alumno3.setNombre("Malfoy");
		
		sist.aniadirCasa(casa);
		sist.aniadirCasa(casa2);
		sist.aniadirAlumnoCasa(alumno);
		sist.aniadirAlumnoCasa(alumno2);
		sist.aniadirAlumnoCasa(alumno3);
		sist.verCasasYAlumnos();
		
	
		

		
	}
	
	public void verCasasYAlumnos() {
		ArrayList<Alumno> copia;
		if(this.casas.size() > 0) {

			
			for(int i = 0; i < casas.size(); i++) {
				//revisado cada casa, ver si en la casa que se esta viendo, sus alumnos.
				
				copia = casas.get(i).obtenerAlumnos();
				
				if(copia.size() > 0) {
					verAlumnos(copia, casas.get(i));
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
	
	public void verAlumnos(ArrayList<Alumno> copia, Casa casa) {
		for(Alumno alum : copia) {
			System.out.println("Esta el alumno "+alum.getNombre()+ " en la casa: "+casa.getNombre());
		}
	}
	
	public void aniadirCasa(Casa casa) {
		this.casas.add(casa);
	}
	
	public void aniadirAlumnoCasa(Alumno alumno) { //aqui se aniade si o si
		Random r = new Random();
		int random = r.nextInt(this.casas.size());

		if(!estaEnOtraCasa(alumno)) { 
			
			this.casas.get(random).AniadirAlumno(alumno);
			
		}
		
	}
	
	public boolean estaEnOtraCasa(Alumno alumno) {
		boolean estaEnCasa = false;
		int i = 0;
		int j = 0;
		
		ArrayList<Alumno> alumnoscopia;
		while(i < this.casas.size()) {
			alumnoscopia = this.casas.get(i).obtenerAlumnos(); //esta vacio la primera vez
			while(j < alumnoscopia.size() && (!estaEnCasa)) { //quizas this.alumnos.size
				if(alumnoscopia.get(j).getNombre().equals(alumno.getNombre())) {
					System.out.println("El alumno "+alumno.getNombre()+" no se anadio otra vez, ya que ya existe en la casa "+this.casas.get(i).getNombre());
					estaEnCasa = true;
				}
				
				j++;
			}
			j = 0;
			i++;
		}
		
		return estaEnCasa;
	}

	public ArrayList<Casa> getCasas() {
		ArrayList<Casa> copia = new ArrayList<Casa>(casas);
		return copia;
	}

	
	
}
