package TP7_Viveros;

public class ReqNOT extends Requerimiento {
	private Requerimiento rq;
	
	public ReqNOT(Requerimiento rq) {
		this.rq = rq;
	}
	
	@Override
	public boolean cumpleRequerimiento(Planta pl) {
		return !this.rq.cumpleRequerimiento(pl);
	}

}
