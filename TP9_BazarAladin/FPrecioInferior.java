package TP9_BazarAladin;

public class FPrecioInferior extends Filtro {
	private double precio;
	
	public FPrecioInferior(double precio) {
		this.precio = precio;
	}
	
	@Override
	public boolean cumple(Elemento elemento) {
		return elemento.getPrecio() < this.precio;
	}

}
