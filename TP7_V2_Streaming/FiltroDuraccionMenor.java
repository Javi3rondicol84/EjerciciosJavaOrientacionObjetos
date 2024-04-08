package TP7_V2_Streaming;

public class FiltroDuraccionMenor extends Filtro {
	private int duraccion;
	
	public FiltroDuraccionMenor(int duraccion) {
		this.duraccion = duraccion;
	}
	
	@Override
	public boolean cumple(Pelicula pl) {
		return pl.getDuraccion() < duraccion;
	}

}
