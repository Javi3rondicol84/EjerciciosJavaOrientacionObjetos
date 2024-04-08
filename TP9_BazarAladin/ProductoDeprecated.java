package TP9_BazarAladin;

import java.time.LocalDate;

public class ProductoDeprecated extends Producto {
	private LocalDate antiguedad;
	private LocalDate vencimiento;
	public static final int DESCUENTO = 2;
	
	public ProductoDeprecated(String nombre, Calculador calculador, LocalDate antiguedad, LocalDate vencimiento) {
		super(nombre, calculador);
		this.antiguedad = antiguedad;
		this.vencimiento = vencimiento;
	}
	
	public double getPrecio() {
		
		if(this.antiguedad.isAfter(this.vencimiento)) {
			return super.getPrecio() / DESCUENTO; 
		}
		else {
			return super.getPrecio();
		}
	}
}
