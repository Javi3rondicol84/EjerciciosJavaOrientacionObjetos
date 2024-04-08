package TP7_V2_Streaming;

public class FiltroNOT extends Filtro {
	
	private Filtro f1;
	
	public FiltroNOT(Filtro f1) {
		this.f1 = f1;
	}
	
	@Override
	public boolean cumple(Pelicula pl) {
		return !this.f1.cumple(pl);
	}

}
