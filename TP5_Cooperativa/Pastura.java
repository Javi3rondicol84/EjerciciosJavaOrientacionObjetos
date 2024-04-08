package TP5_Cooperativa;

import java.util.ArrayList;

public class Pastura extends Cereal {
	private int minSup = 50;
	
	public Pastura(String nombre, int minSup) {
		super(nombre);
		this.setMinSup(minSup);
		
	}

	@Override
	public boolean loteSatisfaceRequerimientos(Lote lt) {
		ArrayList<String> minLotes = lt.obtenerMinerales();
		int suma = 0;
		
		for(int i = 0; i < this.mineralesRequeridos.size(); i++) {
			if(minLotes.contains(mineralesRequeridos.get(i))) {
				suma++;
			}
		}
		
		if(suma == this.mineralesRequeridos.size() && lt.getSuperficie_hectareas() >= this.getMinSup()) {
			return true;
		}
		
		return false;
	}

	public int getMinSup() {
		return minSup;
	}

	public void setMinSup(int minSup) {
		this.minSup = minSup;
	}
	
	
}
