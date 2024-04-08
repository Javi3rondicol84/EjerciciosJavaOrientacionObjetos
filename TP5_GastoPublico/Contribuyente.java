package TP5_GastoPublico;

public class Contribuyente {
	private String nombre;
	private int id_tributaria;
	private double monto_fijo_impuesto;
	
	public Contribuyente() {
		this.setNombre("Juan");
		this.setId_tributaria(300);
		this.setMonto_Impuesto(10000);
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId_tributaria() {
		return id_tributaria;
	}

	public void setId_tributaria(int id_tributaria) {
		this.id_tributaria = id_tributaria;
	}

	public double getMonto_Impuesto() {
		return monto_fijo_impuesto;
	}

	public void setMonto_Impuesto(double monto_fijo_impuesto) {
		this.monto_fijo_impuesto = monto_fijo_impuesto;
	}
	
	
}
