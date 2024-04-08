package TP7_Streaming;

public class FNOT extends Filtro {
	
	private Filtro ft;
	
	public FNOT(Filtro ft) {
		this.ft = ft;
	}
	
	@Override
	public boolean cumple(Pelicula pl) {
		return !this.ft.cumple(pl);
	}
}
