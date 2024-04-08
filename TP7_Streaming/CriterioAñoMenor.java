package TP7_Streaming;

public class CriterioAñoMenor extends Criterio {
	private int año;
	
	public CriterioAñoMenor(int año) {
		this.año = año;
	}
	
	@Override
	public boolean cumpleCriterio(Pelicula pl) {
		return pl.getAño_estreno() < this.año;
	}

}
