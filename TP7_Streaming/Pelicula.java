package TP7_Streaming;

import java.util.ArrayList;

public class Pelicula {
	private String titulo;
	private String sinopsis;
	private ArrayList<String> generos;
	private ArrayList<String> actores;
	private String director;
	private int año_estreno;
	private int minutosDuraccion;
	private int edadMinima;
	
	public Pelicula(String titulo, String sinopsis, String director,
			int año_estreno, int minutosDuraccion, int edadMinima) {
		super();
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.director = director;
		this.año_estreno = año_estreno;
		this.minutosDuraccion = minutosDuraccion;
		this.edadMinima = edadMinima;
		this.actores = new ArrayList<String>();
		this.generos = new ArrayList<String>();
	}
	
	public void aniadirActor(String actor) {
		if(!this.actores.contains(actor)) {
			this.actores.add(actor);
		}
	}
	
	public void removerActor(String actor) {
		this.actores.remove(actor);
	}
	
	public void aniadirGenero(String genero) {
		if(!this.generos.contains(genero)) {
			this.generos.add(genero);
		}
	}
	
	public void removerGenero(String genero) {
		this.generos.remove(genero);
	}
	
	public ArrayList<String> obtenerActores() {
		return new ArrayList<String>(this.actores);
	}
	
	public ArrayList<String> obtenerGeneros() {
		return new ArrayList<String>(this.generos);
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

	public int getAño_estreno() {
		return año_estreno;
	}

	public void setAño_estreno(int año_estreno) {
		this.año_estreno = año_estreno;
	}

	public int getMinutosDuraccion() {
		return minutosDuraccion;
	}

	public void setMinutosDuraccion(int minutosDuraccion) {
		this.minutosDuraccion = minutosDuraccion;
	}

	public int getEdadMinima() {
		return edadMinima;
	}

	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}
	
	public String toString() {
		return "Titulo: "+this.getTitulo()+", Sinopsis: "+this.getSinopsis()+", Director: "+this.getDirector()+"\nAño lanzamiento: "+this.getAño_estreno()+", Duraccion: "+this.getMinutosDuraccion()+ ", Edad minima requerida: "+this.getEdadMinima()+".";
	}
	
	@Override
	public boolean equals(Object obj) {
		Pelicula pl = (Pelicula) obj;
		try {
			if(this.getTitulo().equals(pl.getTitulo()) && this.getDirector().equals(pl.getDirector())) {
				return true;
			}
		}
		catch(Exception e) {
			
		}
		
		return false;
	}
	
}
