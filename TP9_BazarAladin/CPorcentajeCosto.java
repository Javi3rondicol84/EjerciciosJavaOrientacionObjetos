package TP9_BazarAladin;

public class CPorcentajeCosto extends Calculador {
	private double monto;
	private double porcentaje;
	
	public CPorcentajeCosto(double monto, double porcentaje) {
		this.monto = monto;
		this.porcentaje = porcentaje;
	}
	
	@Override
	public double calcularCostoAlquiler() {
		return this.monto - (this.monto * this.porcentaje);
	}
}
