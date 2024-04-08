package TP9_BazarAladin;

public class ComboMasterchef extends Combo {
	public static final String CATEGORIA = "Cocina Gourmet";
	
	public ComboMasterchef(String nombre, Filtro criterio, double tope_descuento, double descuento) {
		super(nombre, criterio, tope_descuento, descuento);
	}

	public void addProducto(Producto producto) {
		if((!elementos.contains(producto)) && producto.tieneCategoria(CATEGORIA)) {
			this.elementos.add(producto);
		}
	}

	
}
