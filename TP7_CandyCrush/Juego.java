package TP7_CandyCrush;

import java.util.ArrayList;

public class Juego {
	private ArrayList<Tablero> tableros;

	public Juego() {
		this.tableros = new ArrayList<Tablero>();
	}

	public void aniadirTablero(Tablero tr) {
		if(!this.tableros.contains(tr)) {
			this.tableros.add(tr);
		}
	}
	
	
}
