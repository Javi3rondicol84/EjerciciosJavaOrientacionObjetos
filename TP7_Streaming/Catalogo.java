package TP7_Streaming;

import java.util.ArrayList;

public class Catalogo {
	private ArrayList<Pelicula> catalogo;
	private Criterio ct;
	
	
	public Catalogo() {
		this.catalogo = new ArrayList<Pelicula>();
		this.ct = new CriterioDuraccionFecha();
	}
	
	public Catalogo(Criterio ct) {
		this.catalogo = new ArrayList<Pelicula>();
		this.ct = ct;
	}
	
	public void cambiarCriterio(Criterio ct) {
		this.ct = ct;
	}
	
	public void buscarEnCatalogo(Filtro ft) {
		int n = this.catalogo.size();
		int suma = 0;
		
		System.out.println("Peliculas: \n");
		for(int i = 0; i < n; i++) {
			if(ft.cumple(this.catalogo.get(i))) {
				System.out.println(this.catalogo.get(i));
				System.out.println();
			}
			
			suma++;
		}
		
		if(suma == 0) {
			System.out.println("No se encontraron peliculas rentables bajo ese filtro");
		}
		
	}
	
	public void verPeliculasRentables() {
		int n = this.catalogo.size();
		
		System.out.println("Peliculas rentables: ");
		for(int i = 0; i < n; i++) {
			if(ct.cumpleCriterio(this.catalogo.get(i))) {
				System.out.println(this.catalogo.get(i));
			}
		}
		
		if(n == 0) {
			System.out.println("No se encontraron peliculas rentables bajo ese criterio");
		}
	}
	
	public void peliculaEsRentable(Pelicula pl) {
		if(this.ct.cumpleCriterio(pl)) {
			System.out.println("La Pelicula "+pl.getTitulo()+" es rentable");
		}
		else {
			System.out.println("La Pelicula "+pl.getTitulo()+" NO es rentable");
		}
	}
	
	public void aniadirPelicula(Pelicula pl) {
		if(!this.catalogo.contains(pl)) {
			this.catalogo.add(pl);
		}
	}
	
	public void removerPelicula(Pelicula pl) {
		this.catalogo.remove(pl);
	}
}
