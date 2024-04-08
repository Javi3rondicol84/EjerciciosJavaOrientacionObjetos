package TP2_Sistema_Gastos;

public class Impuesto { // recauda x cantidad con el impuesto
	//atributos como nombre y monto que recauda
	private int monto;
	private String nombre;

	public Impuesto() {
		this.nombre = "imp1";
		this.monto  = 100;
	
	}
	
	public Impuesto(String nombre, int monto) {
		this.nombre = nombre;
		this.monto = monto;
	
	}
	
	
	//setters getters

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	
	
	
	
}
