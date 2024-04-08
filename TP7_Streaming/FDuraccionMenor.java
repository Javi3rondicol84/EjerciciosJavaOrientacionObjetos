package TP7_Streaming;

public class FDuraccionMenor extends Filtro {
	private int duraccion;
	
	public FDuraccionMenor(int duraccion) {
		this.duraccion = duraccion;
	}

	@Override
	public boolean cumple(Pelicula pl) {
		return pl.getMinutosDuraccion() < this.duraccion;
	}

}
