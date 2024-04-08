package TP7_Viveros;

public class RTieneNombreVulgar extends Requerimiento {
	private String nombre_vulgar;
	
	public RTieneNombreVulgar(String nombre_vulgar) {
		this.nombre_vulgar = nombre_vulgar;
	}
	
	@Override
	public boolean cumpleRequerimiento(Planta pl) {
		return pl.obtenerNombresVulgares().contains(this.nombre_vulgar);
	}

}
