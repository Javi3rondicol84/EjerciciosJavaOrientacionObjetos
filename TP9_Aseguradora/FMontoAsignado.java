package TP9_Aseguradora;

public class FMontoAsignado extends Filtro{
	private int monto;
	
	public FMontoAsignado(int monto) {
		this.monto = monto;
	}

	@Override
	public boolean cumple(SeguroGeneral seg) {
		return seg.getMontoAsegurado() > this.monto;
	}
	
	
}
