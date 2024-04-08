package TP9_SitioWebNoticias;

import java.util.ArrayList;

public class Noticia extends Contenido {
	private String linkAsociado;
	private String titulo;
	private ArrayList<String> palabrasClaves;
	private String introduccion;
	private String texto;
	private String autor;
	
	public Noticia(String link) {
		this.linkAsociado = link;
		this.palabrasClaves = new ArrayList<String>();
	}
	
	public boolean contienePalabraClave(String palabra) {
		return this.palabrasClaves.contains(palabra);
	}
	
	public void addPalabraClave(String palabra) {
		if(!this.palabrasClaves.contains(palabra)) {
			this.palabrasClaves.add(palabra);
		}
	}
	
	public String toString() {
		return "Noticia: " + this.getTitulo();
	}
	
	public String getLinkAsociado() {
		return linkAsociado;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIntroduccion() {
		return introduccion;
	}

	public void setIntroduccion(String introduccion) {
		this.introduccion = introduccion;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setLinkAsociado(String linkAsociado) {
		this.linkAsociado = linkAsociado;
	}
	
	@Override
	public int getCantidadNoticias() {
		return 1;
	}

	@Override
	public ArrayList<Noticia> buscarNoticias(Filtro filtro) {
		ArrayList<Noticia> noticias = new ArrayList<Noticia>();
		
		if(filtro.cumple(this)) {
			noticias.add(this);
		}
		
		return noticias;
	}

	@Override
	public ArrayList<String> obtenerListadoSitio() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public String obtenerListadoSitio() {
//		return this.getLinkAsociado();
//	}


	
}
