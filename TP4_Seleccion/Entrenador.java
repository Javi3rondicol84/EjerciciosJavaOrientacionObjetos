package TP4_Seleccion;

public class Entrenador  extends Contingente{
	private int id_federacion;

	public Entrenador() {
		this.setId_federacion(23232);
		this.setRol("Entrenador");
		this.setNombre("Jose");
		this.setEstado("En concentracion");
	}
	
	public int getId_federacion() {
		return id_federacion;
	}

	public void setId_federacion(int id_federacion) {
		this.id_federacion = id_federacion;
	}
	
	
}
