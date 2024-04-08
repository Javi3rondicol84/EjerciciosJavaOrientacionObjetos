package TP7_Streaming;

public class CriterioA�oMenor extends Criterio {
	private int a�o;
	
	public CriterioA�oMenor(int a�o) {
		this.a�o = a�o;
	}
	
	@Override
	public boolean cumpleCriterio(Pelicula pl) {
		return pl.getA�o_estreno() < this.a�o;
	}

}
