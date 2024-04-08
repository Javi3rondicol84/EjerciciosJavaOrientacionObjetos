package TP7_CandyCrush;

public class FFortalezaMayorDestruccionMayor extends Filtro {
	
	private FFortalezaMayor ft;
	private FDestruccionMayor ft2;
	
	public FFortalezaMayorDestruccionMayor(int fort, int dest) {
		ft = new FFortalezaMayor(fort);
		ft2 = new FDestruccionMayor(dest);
	}
	
	@Override
	public boolean cumple(Ficha fc) {
		return new FiltroAND(ft, ft2).cumple(fc);
	}

}
