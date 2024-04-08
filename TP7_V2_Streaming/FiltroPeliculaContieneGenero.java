package TP7_V2_Streaming;

public class FiltroPeliculaContieneGenero extends Filtro {
	private String genero;
	
	public FiltroPeliculaContieneGenero(String genero) {
		this.genero = genero;
	}
	
	@Override
	public boolean cumple(Pelicula pl) {
		return pl.contieneGenero(genero);
	}

}
