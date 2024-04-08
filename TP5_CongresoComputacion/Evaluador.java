package TP5_CongresoComputacion;

import java.util.ArrayList;

public class Evaluador {
	private ArrayList<String> keyWords;
	private ArrayList<String> temasConocidos;
	private String nombre;
	
	public Evaluador() {
		this.keyWords = new ArrayList<String>();
		this.temasConocidos = new ArrayList<String>();
		this.setNombre("Jorge");
		this.aniadirKeyWords();
		this.aniadirTemas();
	}
	
	public void aniadirTemas() {
		String t1 = "visualizacion";
		String t2 = "redes de comunicacion";
		
		this.temasConocidos.add(t1);
		this.temasConocidos.add(t2);
	}
	
	public void aniadirTema(String tema) {
		if(!this.temasConocidos.contains(tema.toLowerCase())) {
			this.temasConocidos.add(tema.toLowerCase());
		}
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
	
	public ArrayList<String> obtenerKeyWords() {
		ArrayList<String> copia = new ArrayList<String>(this.keyWords);
		
		return copia;
	}
	
	public ArrayList<String> obtenerTemasConocidos() {
		ArrayList<String> copia = new ArrayList<String>(this.temasConocidos);
		
		return copia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
