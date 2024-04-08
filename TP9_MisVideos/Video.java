package TP9_MisVideos;

import java.util.ArrayList;
import java.util.Comparator;

public class Video extends Elemento {
	private String titulo;
	private double duraccion;
	private int visualizaciones;
	private int meGusta;
	private int noMeeGusta;
	private int añoPublicacion;
	private Usuario usuario;
	private ArrayList<String> tags;
	
	public Video(Usuario usuario) {
		this.tags = new ArrayList<String>();
		this.usuario = usuario;
	}
	
	public void addTag(String tag) {
		this.tags.add(tag);
	}
	
	public String toString() {
		return "Titulo: "+this.getTitulo()+", Visualizaciones: "+this.getVisualizaciones()+", Me gustas: "+this.getMeGusta();
	}
	
	public Video(String titulo, double duraccion, int visualizaciones,
			int meGusta, int noMeeGusta, int añoPublicacion, Usuario usuario,
			ArrayList<String> tags) {
		super();
		this.titulo = titulo;
		this.duraccion = duraccion;
		this.visualizaciones = visualizaciones;
		this.meGusta = meGusta;
		this.noMeeGusta = noMeeGusta;
		this.añoPublicacion = añoPublicacion;
		this.usuario = usuario;
		this.tags = tags;
	}

	public boolean contieneTag(String tag) {
		return this.tags.contains(tag);
	}
	
	@Override
	public ArrayList<Video> buscar(Filtro filtro, Comparator<Video> comp) {
		ArrayList<Video> lista = new ArrayList<Video>();
		
		if(filtro.cumple(this)) {
			lista.add(this);
		}
		
		return lista;
	}
	
	@Override
	public ArrayList<String> getCategorias() {
		// TODO Auto-generated method stub
		return new ArrayList<String>(this.tags);
	}
	
	@Override
	public int getCantidadVideos() {
		// TODO Auto-generated method stub
		return 1;
	}
	
	
	
	//setters getters
	
	public double getDuraccion() {
		return duraccion;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getVisualizaciones() {
		return visualizaciones;
	}
	public void setVisualizaciones(int visualizaciones) {
		this.visualizaciones = visualizaciones;
	}
	public int getMeGusta() {
		return meGusta;
	}
	public void setMeGusta(int meGusta) {
		this.meGusta = meGusta;
	}
	public int getNoMeeGusta() {
		return noMeeGusta;
	}
	public void setNoMeeGusta(int noMeeGusta) {
		this.noMeeGusta = noMeeGusta;
	}
	public int getAñoPublicacion() {
		return añoPublicacion;
	}
	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public void setDuraccion(double duraccion) {
		this.duraccion = duraccion;
	}
	
	
	
	
	
}
