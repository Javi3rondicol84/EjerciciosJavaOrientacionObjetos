package TP5_CongresoComputacion;

import java.util.ArrayList;

public class Trabajo {
	protected ArrayList<String> keyWords;
	private String nombre;
	
	public Trabajo() {
		this.keyWords = new ArrayList<String>();
		this.aniadirKeyWords();
		this.setNombre("Ecologista");
	}
	
	public void aniadirKeyWords() {
		String t1 = "ambiente";
		String t2 = "arboles";
		String t3 = "clima";
		
		this.keyWords.add(t1);
		this.keyWords.add(t2);
		this.keyWords.add(t3);
	}
	
	public void aniadirKeyWord(String kw) {
		if(!this.keyWords.contains(kw.toLowerCase())) {
			this.keyWords.add(kw.toLowerCase());
		}
	}
	
	public boolean sePuedeAniadirEvaluador(Evaluador ev) {
		//conocimiento del evaluador en todos los temas del trabajo en el keywords
		ArrayList<String> temEvals = ev.obtenerKeyWords(); 
		int contador = 0;
		
		for(int i = 0; i < this.keyWords.size(); i++) {
			if(temEvals.contains(this.keyWords.get(i))) {
				contador++;
			}
		}
		
		if(contador == this.keyWords.size()) {
			return true;
		}
		
		return false;
	}
	
	public ArrayList<String> obtenerKeyWords() {
		ArrayList<String> copia = new ArrayList<String>(this.keyWords);
		
		return copia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
