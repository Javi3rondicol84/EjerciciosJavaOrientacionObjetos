package TP7_V2_Streaming;

public class FiltroPeliculaTieneDirector extends Filtro {
	private String director;
	
	public FiltroPeliculaTieneDirector(String director) {
		this.director = director;
	}
	
	@Override
	public boolean cumple(Pelicula pl) {
		return pl.getDirector().equals(director);
	}
	
}
