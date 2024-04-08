package TP6_Abstraccion_V3;

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
