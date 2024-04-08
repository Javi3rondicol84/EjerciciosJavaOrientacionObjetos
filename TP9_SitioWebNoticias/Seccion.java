package TP9_SitioWebNoticias;

import java.util.ArrayList;

public class Seccion extends Contenido {
	private String nombre;
	private String imagen;
	private ArrayList<Contenido> contenido;
	
	public Seccion(String nombre) {
		this.nombre = nombre;
		this.contenido = new ArrayList<Contenido>();
	}
	
	public String toString() {
		return "Seccion: " + this.getNombre();
	}

	public void addContenido(Contenido contenido) {
		this.contenido.add(contenido);
	}
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	@Override
	public int getCantidadNoticias() {
		int suma = 0;
		
		for(int i = 0; i < this.contenido.size(); i++) {
			suma += this.contenido.get(i).getCantidadNoticias();
		}
		
		return suma;
	}

	@Override
	public ArrayList<Noticia> buscarNoticias(Filtro filtro) {
		ArrayList<Noticia> noticias = new ArrayList<Noticia>();
		ArrayList<Noticia> resultadoParcial;
		
		for(int i = 0; i < this.contenido.size(); i++) {
			resultadoParcial = this.contenido.get(i).buscarNoticias(filtro);
			noticias.addAll(resultadoParcial);
		}
		
		return noticias;
	}

	@Override
	public ArrayList<String> obtenerListadoSitio() {
		// TODO Auto-generated method stub
		ArrayList<String> lista = new ArrayList<String>();
		lista.add(this.getNombre());
		String concatenado = "";
		
		for(int i = 0; i < this.contenido.size(); i++) {
	
			concatenado += "\\" + this.contenido.get(i).obtenerListadoSitio();
			concatenado += "\n\t";
			
			if(!lista.contains(concatenado)) {
				lista.add(concatenado);
			}
		}
		
		
	
		
		return lista;
	}

//
//	@Override
//	public String obtenerListadoSitio() {
//		String concatenado = "";
//		
//		for(int i = 0; i < this.contenido.size(); i++) {
//			concatenado += this.getNombre();
//			concatenado += "\\" + this.contenido.get(i).obtenerListadoSitio();
//			concatenado += "\n\t";
//		}
//		
//		return concatenado;
//	}
	
	
	
}
