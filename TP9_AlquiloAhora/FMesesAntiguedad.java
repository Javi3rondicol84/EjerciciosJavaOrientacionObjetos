package TP9_AlquiloAhora;

public class FMesesAntiguedad extends Filtro {
	private int meses;
	
	public FMesesAntiguedad(int meses) {
		this.meses = meses;
	}

	@Override
	public boolean cumple(Item item) {
		return item.getAntiguedadMeses() > this.meses;
	}
	
	
}
