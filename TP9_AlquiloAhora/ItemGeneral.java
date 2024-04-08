package TP9_AlquiloAhora;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class ItemGeneral {
	private String nombre;
	
	public ItemGeneral(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public abstract ArrayList<Item> buscar(Filtro filtro, Comparator<Item> comp);
	
	public String toString() {
		return "Item: "+this.getNombre();
	}
}
