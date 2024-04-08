package TP7_V2_Streaming;

import java.util.ArrayList;

public class Plataforma {
	private ArrayList<Pelicula> peliculas;
	private Filtro politicaAdquisicion;
	
	public Plataforma(Filtro criterio) {
		this.politicaAdquisicion = criterio;
		this.peliculas = new ArrayList<Pelicula>();
	}
	
	public void setPolitica(Filtro nuevoCriterio) {
		this.politicaAdquisicion = nuevoCriterio;
	}
	
	public void addPelicula(Pelicula pl) {
		if(!this.peliculas.contains(pl)) {
			this.peliculas.add(pl);
		}
	}
	
	public boolean esRentable(Pelicula pl) {
		return this.politicaAdquisicion.cumple(pl);
	}

	public ArrayList<Pelicula> buscar(Filtro ft) {
		ArrayList<Pelicula> pelisFiltradas = new ArrayList<Pelicula>();
			
		for(int i = 0; i < this.peliculas.size(); i++) {
			
			if(ft.cumple(this.peliculas.get(i))) {
				pelisFiltradas.add(this.peliculas.get(i));
			}
			
		}
		
		
		return pelisFiltradas;
	}
	
}
