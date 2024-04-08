package TP9_Futbol5;

public class FiltroOR extends Filtro {
	private Filtro f1;
	private Filtro f2;

	public FiltroOR(Filtro f1, Filtro f2) {
		this.f1 = f1;
		this.f2 = f2;
	}
	
	@Override
	public boolean cumple(Socio sc) {
		return f1.cumple(sc) || f2.cumple(sc);
	}
	
}
