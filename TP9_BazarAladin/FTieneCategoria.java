package TP9_BazarAladin;

public class FTieneCategoria extends Filtro {
	private String categoria;
	
	public FTieneCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	@Override
	public boolean cumple(Elemento elemento) {
		return elemento.tieneCategoria(categoria);
	}

}
