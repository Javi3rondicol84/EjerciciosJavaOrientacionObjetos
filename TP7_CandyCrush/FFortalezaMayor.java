package TP7_CandyCrush;

public class FFortalezaMayor extends Filtro {
	private int fortaleza;
	
	public FFortalezaMayor(int fort) {
		this.fortaleza = fort;
	}

	@Override
	public boolean cumple(Ficha fc) {
		return fc.getDestruccion() > this.fortaleza;
	}
	
}
