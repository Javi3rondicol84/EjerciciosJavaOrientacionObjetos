package TP9_MisVideos;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Elemento {

	public abstract ArrayList<Video> buscar(Filtro filtro, Comparator<Video> comp);
	
	public abstract ArrayList<String> getCategorias();
	
	public abstract int getCantidadVideos();
	
	public abstract double getDuraccion();
}
