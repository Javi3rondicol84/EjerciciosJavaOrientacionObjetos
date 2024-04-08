package TP7_Viveros;

//clasificacion o poco riego

public class RCombinacion extends Requerimiento {
	private RClasificacion rf;
	private RInteriorPocoRiego rr;
	
	public RCombinacion(RClasificacion rf, RInteriorPocoRiego rr) {
		this.rf = rf;
		this.rr = rr;
	}
	
	@Override
	public boolean cumpleRequerimiento(Planta pl) {
		return new ReqAND(this.rf, this.rr).cumpleRequerimiento(pl);
	}
	
}
