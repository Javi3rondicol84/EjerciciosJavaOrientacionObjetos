package TP9_Aseguradora;

public class CPPorcentajeValorAsegurado extends CostoPoliza {
	double porcentaje = 0;
	
	public CPPorcentajeValorAsegurado(double porcentaje) {
		this.porcentaje = porcentaje;
	}
	
	@Override
	public double getCostoPoliza(Seguro seg) {
		return seg.getMontoAsegurado() * this.porcentaje;
	}

}
