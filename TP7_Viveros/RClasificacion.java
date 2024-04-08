package TP7_Viveros;

public class RClasificacion extends Requerimiento {
	private String clasif;
	
	public RClasificacion(String clasif) {
		this.clasif = clasif;
	}
	
	@Override
	public boolean cumpleRequerimiento(Planta pl) {
		return pl.getClasif_superior().equalsIgnoreCase(this.clasif);
	}

}
