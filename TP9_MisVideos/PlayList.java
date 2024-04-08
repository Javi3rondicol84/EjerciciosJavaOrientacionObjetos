package TP9_MisVideos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PlayList extends Elemento {
	private String titulo;
	protected ArrayList<Elemento> elementos;
	private double tiempoCarga;
	
	public PlayList(String titulo, double tiempoCarga) {
		this.elementos = new ArrayList<Elemento>();
		this.tiempoCarga = tiempoCarga;
		this.titulo = titulo;
	}
	
	public void addElemento(Elemento elemento) {
		if(!elementos.contains(elemento)) {
			this.elementos.add(elemento);
		}
	}

	@Override
	public ArrayList<Video> buscar(Filtro filtro, Comparator<Video> comp) {
		ArrayList<Video> lista = new ArrayList<Video>();
		
		for(int i = 0; i < this.elementos.size(); i++) {
			lista.addAll(this.elementos.get(i).buscar(filtro, comp));
		}
		
		if(comp != null) {
			Collections.sort(lista, comp);
		}
		
		return lista;
	}

	@Override
	public ArrayList<String> getCategorias() {
		ArrayList<String> tags = new ArrayList<String>();
		ArrayList<String> tagsParciales;
		
		for(int i = 0; i < this.elementos.size(); i++) {
			tagsParciales = this.elementos.get(i).getCategorias();
			this.aniadirNoRepetidos(tags, tagsParciales);
		}
		
		return tags;
	}

	private void aniadirNoRepetidos(ArrayList<String> tags,
		ArrayList<String> tagsParciales) {
		
		for(int i = 0; i < tagsParciales.size(); i++) {
			if(!tags.contains(tagsParciales.get(i))) {
				tags.add(tagsParciales.get(i));
			}
		}
		
	}

	@Override
	public int getCantidadVideos() {
		int suma = 0;
		
		for(int i = 0; i < this.elementos.size(); i++) {
			suma += this.elementos.get(i).getCantidadVideos();
		}
		
		return suma;
	}

	@Override
	public double getDuraccion() {
		double suma = 0;
		
		for(int i = 0; i < this.elementos.size(); i++) {
			suma += this.elementos.get(i).getDuraccion();
		}
		
		return suma + this.getTiempoCarga();
	}
	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getTiempoCarga() {
		return tiempoCarga;
	}

	public void setTiempoCarga(double tiempoCarga) {
		this.tiempoCarga = tiempoCarga;
	}
	
	
	
}
