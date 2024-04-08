package TP9_MisVideos;

public class FiltroNOT extends Filtro {
	private Filtro filtro;
	
	public FiltroNOT(Filtro filtro) {
		this.filtro = filtro;
	}

	@Override
	public boolean cumple(Video video) {
		return !this.filtro.cumple(video);
	}
}
