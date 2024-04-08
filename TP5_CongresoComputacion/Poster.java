package TP5_CongresoComputacion;

import java.util.ArrayList;

public class Poster extends Trabajo {
	
	public Poster() {
		super();
	}
	
	@Override
	public boolean sePuedeAniadirEvaluador(Evaluador ev) {
		ArrayList<String> temEvals = ev.obtenerKeyWords(); 

		
		for(int i = 0; i < this.keyWords.size(); i++) {
			if(temEvals.contains(this.keyWords.get(i))) {
				return true;
			}
		}

		
		return false;
	}
	
}
