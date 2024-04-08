package TP5_Cooperativa;

import java.util.ArrayList;

public class Lote {
	private ArrayList<String> mineralesRequeridos;
	private int superficie_hectareas;
	private String nombre_lote; 
	
	public Lote(int superficie, String nombre) {
		this.superficie_hectareas = superficie;
		this.nombre_lote = nombre;
		this.mineralesRequeridos = new ArrayList<String>();
		this.aniadirMineralesRequeridos();
	}
	
	public void aniadirMineralesRequeridos() {
		String n1 = "circon";
		String n2 = "rutilo";
		String n3 = "cuarzo";
		
		this.mineralesRequeridos.add(n1);
		this.mineralesRequeridos.add(n2);
		this.mineralesRequeridos.add(n3);
	}
	
	public boolean cerealSatisfaceRequerimientos(Cereal cr) {
		ArrayList<String> mineralesCr = cr.obtenerMinerales();
		int suma = 0;
		//containsAll
		for(int i = 0; i < this.mineralesRequeridos.size(); i++) {
			if(mineralesCr.contains(mineralesRequeridos.get(i))) {
				suma++;
			}
		}
		
		if(suma == this.mineralesRequeridos.size()) {
			return true;
		}
		
		//return mineralesCr.containsAll(mineralesRequeridos);
		return false;
	}
	
	
	public ArrayList<String> obtenerMinerales() {
		ArrayList<String> copia = new ArrayList<String>(mineralesRequeridos);
		
		return copia;
	}

	public int getSuperficie_hectareas() {
		return superficie_hectareas;
	}

	public void setSuperficie_hectareas(int superficie_hectareas) {
		this.superficie_hectareas = superficie_hectareas;
	}

	public String getNombre_lote() {
		return nombre_lote;
	}

	public void setNombre_lote(String nombre_lote) {
		this.nombre_lote = nombre_lote;
	}
	
	
}
