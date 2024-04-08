package TP5_CongresoComputacion;

import java.util.ArrayList;

public class Sistema {
	private ArrayList<String> temasGenerales;
	private ArrayList<String> temasEspecificos;
	private ArrayList<Trabajo> trabajos;
	private ArrayList<Evaluador> evaluadores;
	
	public Sistema() {
		this.temasGenerales = new ArrayList<String>();
		this.temasEspecificos = new ArrayList<String>();
		this.trabajos = new ArrayList<Trabajo>();
		this.evaluadores = new ArrayList<Evaluador>();
		this.inicializarTemas();
		this.inicializarTrabajos();
		this.inicializarEvaluadores();
	}
	
	public void inicializarTrabajos() {
		Trabajo tr = new Trabajo();
		Trabajo tr2 = new Trabajo();
		tr2.setNombre("Programador");
		this.trabajos.add(tr);
		this.trabajos.add(tr2);
		
	}
	
	public void inicializarEvaluadores() {
		Evaluador ev = new Evaluador();
		Evaluador ev2 = new Evaluador();
		
		this.evaluadores.add(ev);
		this.evaluadores.add(ev2);
	}
	
	public void inicializarTemas() {
		String tg1 = "algoritmo";
		String tg2 = "programacion";
		
		this.temasGenerales.add(tg1);
		this.temasGenerales.add(tg2);
		
		String te1 = "visualizacion";
		String te2 = "redes de comunicacion";
		
		this.temasEspecificos.add(te1);
		this.temasEspecificos.add(te2);
	}
	
	public void evaluadoresPermitidosEnTrabajo(Trabajo tr) {
		//recorrerevualuadores y mostrar permitidos a ese trabajo dado
		
		System.out.println("Evaluadores permitidos: ");
		
		for(int i = 0; i < this.evaluadores.size(); i++) {
			if(tr.sePuedeAniadirEvaluador(this.evaluadores.get(i))) {
				System.out.println(this.evaluadores.get(i).getNombre());
			}
		
		}
		
	}
	
	public void trabajosQuePuedenAsignarseEvaluador(Evaluador ev) {
		//recorrer trabajos y mostrar a los que el evaluador puede ser asignado
		
		System.out.println("Trabajos a los que se puede asignar el trabajador");
		
		for(int i = 0; i < this.trabajos.size(); i++) {
			if(this.trabajos.get(i).sePuedeAniadirEvaluador(ev)) {
				System.out.println(this.trabajos.get(i).getNombre());
			}
		}
		
	}
	
	public void trabajosQueTieneUnEvaluador(Evaluador ev) {
		//recorrer con for los trabajos del sistema
		//3) cuántos trabajos tiene un evaluador determinado y
		int suma = 0;
		for(int i = 0; i < this.trabajos.size(); i++) {
			if(this.trabajos.get(i).sePuedeAniadirEvaluador(ev)) {
				suma++;
			}
		}
		
		System.out.println("El evaluador "+ev.getNombre()+" tiene "+suma+" trabajos");
	}
	
	public static void main(String [] args) {
		Sistema sist = new Sistema();
		Evaluador ev = new Evaluador();
		Trabajo tr = new Trabajo();
		sist.evaluadoresPermitidosEnTrabajo(tr);
		sist.trabajosQuePuedenAsignarseEvaluador(ev);
		sist.trabajosQueTieneUnEvaluador(ev);
	}
	
	public void determinarTipoDeEvaluador(Evaluador ev) {
		if(esGeneral(ev)) {
			System.out.println("El evaluador es de tipo general");
		}
		else if(esExperto(ev)) {
			System.out.println("El evaluador es de tipo experto");
		}
		else {
			System.out.println("El evaluador no es de ningun tipo");
		}
	}
	
	private boolean esGeneral(Evaluador ev) {
		ArrayList<String> temas = ev.obtenerTemasConocidos();
		int suma = 0;
		
		for(int i = 0; i < this.temasGenerales.size(); i++) {
			if(temas.contains(this.temasGenerales.get(i))) {
				suma++;
			}
		}
		
		if(suma == this.temasGenerales.size()) {
			return true;
		}
		
		return false;
	}
	
	private boolean esExperto(Evaluador ev) {
		ArrayList<String> temas = ev.obtenerTemasConocidos();
		int suma = 0;
		
		for(int i = 0; i < this.temasEspecificos.size(); i++) {
			if(temas.contains(this.temasEspecificos.get(i))) {
				suma++;
			}
		}
		
		if(suma == this.temasEspecificos.size()) {
			return true;
		}
		
		return false;
	}
	
}
