package TP7_Streaming;

public class FContieneGenero extends Filtro {
	private String genero;
	
	public FContieneGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public boolean cumple(Pelicula pl) {
		return pl.obtenerGeneros().contains(this.genero);
	}
	
	
}
