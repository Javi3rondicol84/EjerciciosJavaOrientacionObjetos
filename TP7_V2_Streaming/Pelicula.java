package TP7_V2_Streaming;

import java.util.ArrayList;

public class Pelicula {
	private String titulo;
	private String sinopsis;
	private ArrayList<String> generos;
	private ArrayList<String> actores;
	private String director;
	private int añoEstreno;
	private int duraccion;
	private int edadMinima;
	
	public Pelicula(String titulo, String sinopsis, String director, int añoEstreno, int duraccion, int edadMinima) {
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.director = director;
		this.añoEstreno = añoEstreno;
		this.duraccion = duraccion;
		this.edadMinima = edadMinima;
		this.generos = new ArrayList<String>();
		this.actores = new ArrayList<String>();
	}
	
	public void addActor(String actor) {
		if(!this.actores.contains(actor)) {
			this.actores.add(actor);
		}
	}
	
	public void addGenero(String genero) {
		if(!this.generos.contains(genero)) {
			this.generos.add(genero);
		}
	}
	
	public boolean contieneActor(String actor) {
		return this.actores.contains(actor);
	}
	
	public boolean contieneGenero(String genero) {
		return this.generos.contains(genero);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getAñoEstreno() {
		return añoEstreno;
	}

	public void setAñoEstreno(int añoEstreno) {
		this.añoEstreno = añoEstreno;
	}

	public int getDuraccion() {
		return duraccion;
	}

	public void setDuraccion(int duraccion) {
		this.duraccion = duraccion;
	}

	public int getEdadMinima() {
		return edadMinima;
	}

	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}
	
	
	
}
