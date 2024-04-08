package TP7_Streaming;

public class FTieneDirector extends Filtro {
	private String director;
	
	public FTieneDirector(String director) {
		this.director = director;
	}
	
	@Override
	public boolean cumple(Pelicula pl) {
		return pl.getDirector().equals(this.director);
	}

}
