package TP7_Viveros;

public class RNombreCientificoIncluyePalabra extends Requerimiento {
	private String palabra;
	
	public RNombreCientificoIncluyePalabra(String palabra) {
		this.palabra = palabra;
	}
	
	@Override
	public boolean cumpleRequerimiento(Planta pl) {
		return pl.getNombre().contains(this.palabra);
	}

}
