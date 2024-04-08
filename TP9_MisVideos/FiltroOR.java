package TP9_MisVideos;

public class FiltroOR extends Filtro {
	private Filtro filtro1;
	private Filtro filtro2;
	
	public FiltroOR(Filtro filtro1, Filtro filtro2) {
		this.filtro1 = filtro1;
		this.filtro2 = filtro2;
	}

	@Override
	public boolean cumple(Video video) {
		return this.filtro1.cumple(video) || this.filtro2.cumple(video);
	}
}
