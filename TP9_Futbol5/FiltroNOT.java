package TP9_Futbol5;

public class FiltroNOT extends Filtro {
	private Filtro f1;

	public FiltroNOT(Filtro f1) {
		this.f1 = f1;
	}
	
	@Override
	public boolean cumple(Socio sc) {
		return !f1.cumple(sc);
	}
	
	
}
