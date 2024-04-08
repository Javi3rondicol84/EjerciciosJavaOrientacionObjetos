package TP6_PuertoCerealesV2;

public abstract class Elemento {
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract boolean esMayor(Elemento el);
	
}

