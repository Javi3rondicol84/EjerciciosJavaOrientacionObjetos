package TP7_BusquedaDocumentos;

import java.util.ArrayList;

public class Documento {
	private String titulo;
	private String contenido_textual;
	private ArrayList<String> autores;
	private ArrayList<String> palabras_claves;
	
	public Documento(String titulo, String contenido) {
		this.titulo = titulo;
		this.contenido_textual = contenido;
		this.autores = new ArrayList<String>();
		this.palabras_claves = new ArrayList<String>();
		this.aniadirAutoresyPalabrasDefault();
	}
	
	public void aniadirAutoresyPalabrasDefault() {
		String p1 = "palabra1";
		String p2 = "palabra2";
		
		this.palabras_claves.add(p1);
		this.palabras_claves.add(p2);
		
		String a1 = "autor1";
		String a2 = "autor2";
		
		this.autores.add(a1);
		this.autores.add(a2);
	}
		
	public String toString() {
		return "Titulo documento: " + this.getTitulo();
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getContenido_textual() {
		return contenido_textual;
	}
	public void setContenido_textual(String contenido_textual) {
		this.contenido_textual = contenido_textual;
	}
	
	public ArrayList<String> getAutores() {
		return new ArrayList<String>(autores);
	}
	
	public void addAutor(String autor) {
		if(!this.autores.contains(autor.toLowerCase())) {
			this.autores.add(autor.toLowerCase());
		}
	}

	public ArrayList<String> getPalabras_claves() {
		return new ArrayList<String>(palabras_claves);
	}
	
	public void addPalabraClave(String palabra) {
		if(!this.palabras_claves.contains(palabra)) {
			this.palabras_claves.add(palabra);
		}
	}
	
}
