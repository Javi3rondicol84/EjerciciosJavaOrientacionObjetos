package TP7_Streaming;

public class FEstuvoActorYNoDirector extends Filtro {
	private String actor;
	private String director;
	
	public FEstuvoActorYNoDirector(String actor, String director) {
		this.actor = actor;
		this.director = director;
	}

	@Override
	public boolean cumple(Pelicula pl) {
		return new FAND(new FEstuvoActor(this.actor), new FNoTieneDirector(this.director)).cumple(pl);
	}
}
