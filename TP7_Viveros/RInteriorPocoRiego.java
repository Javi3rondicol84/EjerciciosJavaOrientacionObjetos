package TP7_Viveros;

public class RInteriorPocoRiego extends Requerimiento {
	private int pocoRiego;
	
	public RInteriorPocoRiego(int pocoRiego) {
		this.pocoRiego = pocoRiego;
	}
	
	@Override
	public boolean cumpleRequerimiento(Planta pl) {
		return pl.getTipo_ambiente().equals(pl.getTipo_uno()) && pl.getReq_agua() < this.pocoRiego;
	}

}
