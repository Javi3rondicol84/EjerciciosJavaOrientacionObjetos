package TP9_Aseguradora;

public class FiltroAND extends Filtro {
	private Filtro f1;
	private Filtro f2;
	
	public FiltroAND(Filtro f1, Filtro f2) {
		this.f1 = f1;
		this.f2 = f2;
	}
	
	@Override
	public boolean cumple(SeguroGeneral seg) {
		return f1.cumple(seg) && f2.cumple(seg);
	}

}
