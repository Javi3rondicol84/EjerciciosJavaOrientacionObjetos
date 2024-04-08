package TP7_Streaming;

public class FNoTieneDirector extends Filtro {
	
	private String director;
	
	public FNoTieneDirector(String director) {
		this.director = director;
	}
	
	@Override
	public boolean cumple(Pelicula pl) {
		return new FNOT(new FTieneDirector(this.director)).cumple(pl);
	}

}
