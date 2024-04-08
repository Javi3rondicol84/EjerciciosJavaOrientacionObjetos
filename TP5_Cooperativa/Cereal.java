package TP5_Cooperativa;

import java.util.ArrayList;

public class Cereal {
	private String nombre_grano;
	protected ArrayList<String> mineralesRequeridos;
	
	public Cereal(String nombre) {
		this.nombre_grano = nombre;
		this.mineralesRequeridos = new ArrayList<String>();
	}
	
	public ArrayList<String> obtenerMinerales() {
		ArrayList<String> copia = new ArrayList<String>(mineralesRequeridos);
		
		return copia;
	}
	
	public boolean loteSatisfaceRequerimientos(Lote lt) {
		ArrayList<String> minLotes = lt.obtenerMinerales();
		int suma = 0;
		
		for(int i = 0; i < this.mineralesRequeridos.size(); i++) {
			if(minLotes.contains(mineralesRequeridos.get(i))) {
				suma++;
			}
		}
		
		if(suma == this.mineralesRequeridos.size()) {
			return true;
		}
		
		return false;
	}

	public String getNombre_grano() {
		return nombre_grano;
	}

	public void setNombre_grano(String nombre_grano) {
		this.nombre_grano = nombre_grano;
	}
	
	@Override
	public String toString() {
		return "Mineral: " + this.getNombre_grano();
	}
}
