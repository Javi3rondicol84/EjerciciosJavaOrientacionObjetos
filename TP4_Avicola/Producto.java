package TP4_Avicola;

import java.time.LocalDate;

public class Producto {
	protected LocalDate venc;
	private int lote;
	private String nombre_producto;

	public Producto() {
		this.venc = LocalDate.of(2023, 12, 20);
		this.setLote(1111);
		this.setNombre_producto("ProductoGenerico");
	}
	
	public static void main(String [] args) {
		Producto prod = new ProductoRefrigerado();
		prod.verEtiqueta();
	}
	
	public void verEtiqueta() {
		System.out.println("El nombre del producto es: "+this.getNombre_producto()+", su lote es: "+this.getLote()+", su fecha de vencimiento es: "+this.venc.getDayOfMonth()+"/"+this.venc.getMonthValue()+"/"+this.venc.getYear());
	}


	public LocalDate getVenc() {
		return venc;
	}


	public void setVenc(LocalDate venc) {
		this.venc = venc;
	}


	public int getLote() {
		return lote;
	}


	public void setLote(int lote) {
		this.lote = lote;
	}


	public String getNombre_producto() {
		return nombre_producto;
	}


	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	
	
}
