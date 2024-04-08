package TP9_Futbol5;

public class FiltroPrecioSuperior extends Filtro {
	private int precio;
	
	public FiltroPrecioSuperior(int precio) {
		this.precio = precio;
	}

	@Override
	public boolean cumple(Socio sc) {
		return sc.pagoPrecioSuperior(precio);
	}

}
