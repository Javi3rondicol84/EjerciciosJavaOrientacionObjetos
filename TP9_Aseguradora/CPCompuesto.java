package TP9_Aseguradora;

public class CPCompuesto extends CostoPoliza {
	private CostoPoliza cp1;
	private CostoPoliza cp2;
	@Override
	public double getCostoPoliza(Seguro seg) {
		return cp1.getCostoPoliza(seg) + cp2.getCostoPoliza(seg);
	}
	
	
}
