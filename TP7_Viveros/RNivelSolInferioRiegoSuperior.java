package TP7_Viveros;

public class RNivelSolInferioRiegoSuperior extends Requerimiento {
	private int Sol;
	private int Agua;
	
	public RNivelSolInferioRiegoSuperior(int Sol, int Agua) {
		this.Sol = Sol;
		this.Agua = Agua;
	}
	
	@Override
	public boolean cumpleRequerimiento(Planta pl) {
		return pl.getReq_sol() < this.Sol && pl.getReq_agua() > this.Agua;
	}

}
