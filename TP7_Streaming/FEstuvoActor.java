package TP7_Streaming;

public class FEstuvoActor extends Filtro {
	private String actor;
	
	public FEstuvoActor(String actor) {
		this.actor = actor;
	}
	
	@Override
	public boolean cumple(Pelicula pl) {
		return pl.obtenerActores().contains(this.actor);
	}

}
