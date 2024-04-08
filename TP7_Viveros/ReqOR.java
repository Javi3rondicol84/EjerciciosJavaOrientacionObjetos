package TP7_Viveros;

public class ReqOR extends Requerimiento {
	private Requerimiento rq;
	private Requerimiento rq2;
	
	public ReqOR(Requerimiento rq, Requerimiento rq2) {
		this.rq = rq;
		this.rq2 = rq2;
	}
	
	@Override
	public boolean cumpleRequerimiento(Planta pl) {
		return this.rq.cumpleRequerimiento(pl) || this.rq2.cumpleRequerimiento(pl);
	}

}
