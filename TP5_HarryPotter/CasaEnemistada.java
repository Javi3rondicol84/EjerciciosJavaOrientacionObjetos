package TP5_HarryPotter;

import java.util.ArrayList;

public class CasaEnemistada extends CasaPura{
	private ArrayList<Alumno> alumnos;
	private ArrayList<Cualidad> cualidades;
	private ArrayList<Casa> enemigos;
	
	public CasaEnemistada() {
		super();
		this.setNombre("Slytherin");
		this.enemigos = new ArrayList<Casa>();
		this.aniadirEnemigosACasa();
	}
	
	public void aniadirEnemigosACasa() {
		Casa casa = new Casa();
		casa.setNombre("Slytherin");
		
		this.aniadirEnemigo(casa);
	}
	
	public void aniadirEnemigo(Casa casa) {
		
		if(this.getNombre().equals(casa.getNombre())) {
			System.out.println("La casa "+this.getNombre()+" no se puede enemistar consigo misma");
		}
		else {
			this.enemigos.add(casa);
		}
	}
	
	@Override
	public boolean cumpleRequisitoExtra(Alumno alumno) {
		boolean noCasaEnemiga = true;
		
		for(int i = 0; i < enemigos.size(); i++) {
			if(this.getNombre().equals(enemigos.get(i).getNombre())) {
				noCasaEnemiga = false;
				System.out.println("El alumno "+alumno.getNombre()+" no se puede aniadir a la Casa "+enemigos.get(i).getNombre()+" porque es Casa enemiga");
			}
		}
		
		return noCasaEnemiga;
	}
}
