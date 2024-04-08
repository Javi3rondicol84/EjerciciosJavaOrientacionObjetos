package TP9_Aseguradora;

public class CPMontoFijo extends CostoPoliza {
	private double monto;
	
	public CPMontoFijo(double monto) {
		this.monto = monto;
	}
	
	@Override
	public double getCostoPoliza(Seguro seg) {
		return this.monto;
	}

}
