package TP2_Sistema_Gastos;

public class Gasto { //gastos de la ciudad
	private int monto_gasto;
	private String nombre_gasto;

	public Gasto() {
		this.monto_gasto = 1000;
		this.nombre_gasto = "educacion";
	}
	
	public Gasto(int monto, String nombre) {
		this.monto_gasto = monto;
		this.nombre_gasto = nombre;
	}
	
	

	
	//setters getters
	public int getMonto_gasto() {
		return monto_gasto;
	}

	public void setMonto_gasto(int monto_gasto) {
		this.monto_gasto = monto_gasto;
	}

	public String getNombre_gasto() {
		return nombre_gasto;
	}

	public void setNombre_gasto(String nombre_gasto) {
		this.nombre_gasto = nombre_gasto;
	}
	
	
}
