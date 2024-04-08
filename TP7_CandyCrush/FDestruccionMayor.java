package TP7_CandyCrush;

public class FDestruccionMayor extends Filtro {
	private int destruccion;
	
	public FDestruccionMayor(int dest) {
		this.destruccion = dest;
	}
	
	@Override
	public boolean cumple(Ficha fc) {
		return fc.getDestruccion() > this.destruccion;
	}

}
