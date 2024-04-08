package TP7_V2_Streaming;

public class FiltroPeliculaContieneActor extends Filtro {
	private String actor;
	
	public FiltroPeliculaContieneActor(String actor) {
		this.actor = actor;
	}
	
	@Override
	public boolean cumple(Pelicula pl) {
		return pl.contieneActor(actor);
	}

}
