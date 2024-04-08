package TP9_SistemaArchivos;

public class FNombreIgual extends Filtro {
	private String nombre;
	
	public FNombreIgual(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public boolean cumple(ElementoSA elemento) {
		return elemento.getNombre().equals(this.nombre);
	}

}
