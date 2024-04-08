package TP4_Seleccion;

public class Futbolista extends Contingente {
	private String posicion;
	private int goles;
	
	public Futbolista() {
		this.setPosicion("diestro");
		this.setGoles(20);
		this.setRol("Futbolista");
		this.setNombre("Marco");
		this.setEstado("En pais de origen");
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}
	
	
}
