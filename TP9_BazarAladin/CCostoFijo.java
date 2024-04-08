package TP9_BazarAladin;

public class CCostoFijo extends Calculador {
	private double monto;
	
	public CCostoFijo(double monto) {
		this.monto = monto;
	}
	
	@Override
	public double calcularCostoAlquiler() {
		return this.monto;
	}

}
