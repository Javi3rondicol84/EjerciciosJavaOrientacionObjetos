package TP9_BazarAladin;

public class CCompuesto extends Calculador {
	private Calculador c1;
	private Calculador c2;
	
	public CCompuesto(Calculador c1, Calculador c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	
	@Override
	public double calcularCostoAlquiler() {
		return c1.calcularCostoAlquiler() + c2.calcularCostoAlquiler();
	}

}
