package TP9_BazarAladin;

public class ComboPagaUno extends Combo {
	public ComboPagaUno(String nombre, Filtro criterio, double tope_descuento, double descuento) {
		super(nombre, criterio, tope_descuento, descuento);
	}

	@Override
	public double getPrecio() {
		double precioMayor = 0;
		
		for(int i = 0; i < this.elementos.size(); i++) {
			if(precioMayor < this.elementos.get(i).getPrecio()) {
				precioMayor = this.elementos.get(i).getPrecio();
			}
		}
		
		return precioMayor;
	}
	
}
