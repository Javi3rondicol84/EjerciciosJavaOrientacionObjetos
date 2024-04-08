package TP9_SistemaArchivos;

public class FNombreContiene extends Filtro {
	private String palabra;
	
	public FNombreContiene(String palabra) {
		this.palabra = palabra;
	}
	
	@Override
	public boolean cumple(ElementoSA elemento) {
		return elemento.getNombre().contains(this.palabra);
	}

}
