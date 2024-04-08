package TP9_SitioWebNoticias;

import java.util.ArrayList;

public abstract class Contenido {
	
	public abstract int getCantidadNoticias();
	
	public abstract ArrayList<Noticia> buscarNoticias(Filtro filtro);
			
	public abstract ArrayList<String> obtenerListadoSitio();
}
