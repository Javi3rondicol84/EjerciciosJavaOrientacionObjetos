package TP7_Streaming;

public class FAND extends Filtro {
	private Filtro f1;
	private Filtro f2;
	
	public FAND(Filtro f1, Filtro f2) {
		this.f1 = f1;
		this.f2 = f2;
	}

	@Override
	public boolean cumple(Pelicula pl) {
		return this.f1.cumple(pl) && this.f2.cumple(pl);
	}
}
