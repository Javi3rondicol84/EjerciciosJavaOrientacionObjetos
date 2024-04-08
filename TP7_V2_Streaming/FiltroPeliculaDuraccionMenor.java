package TP7_V2_Streaming;

public class FiltroPeliculaDuraccionMenor extends Filtro {
	private int duraccion;
	
	public FiltroPeliculaDuraccionMenor(int duraccion) {
		this.duraccion = duraccion;
	}
	
	@Override
	public boolean cumple(Pelicula pl) {
		return pl.getDuraccion() < duraccion;
	}

}
