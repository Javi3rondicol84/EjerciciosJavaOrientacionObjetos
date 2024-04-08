package TP7_CandyCrush;

public class FFOcupaXLugares extends Filtro {
	private int cant_lugares;
	
	public FFOcupaXLugares(int cant) {
		this.cant_lugares = cant;
	}

	@Override
	public boolean cumple(Ficha fc) {
		return fc.getCant_casilleros() > this.cant_lugares;
	}
	
	
}
