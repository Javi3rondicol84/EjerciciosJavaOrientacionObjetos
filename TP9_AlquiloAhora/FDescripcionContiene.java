package TP9_AlquiloAhora;

public class FDescripcionContiene extends Filtro {
	private String palabra;
	
	public FDescripcionContiene(String palabra) {
		this.palabra = palabra;
	}

	@Override
	public boolean cumple(Item item) {
		return item.getDescripcion().contains(this.palabra);
	}
}
