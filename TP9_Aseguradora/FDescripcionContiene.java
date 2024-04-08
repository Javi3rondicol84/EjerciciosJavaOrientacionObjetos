package TP9_Aseguradora;

public class FDescripcionContiene extends Filtro {
	private String palabra;
	
	public FDescripcionContiene(String palabra) {
		this.palabra = palabra;
	}
	
	@Override
	public boolean cumple(SeguroGeneral seg) {
		return seg.getDescripcion().contains(palabra);
	}

}
