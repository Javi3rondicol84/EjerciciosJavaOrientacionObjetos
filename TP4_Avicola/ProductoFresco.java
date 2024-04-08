package TP4_Avicola;

import java.time.LocalDate;

public class ProductoFresco extends Producto {

	private String granja_origen;
	private LocalDate fecha_envasado;

	
	public ProductoFresco() {
		this.setNombre_producto("productofresco");
		this.setGranja_origen("Avicola");
		this.fecha_envasado = LocalDate.of(2023, 4, 25);
	}
	
	@Override
	public void verEtiqueta() {
		System.out.println("El nombre del producto es: "+this.getNombre_producto()+", su lote es: "+this.getLote()+", su fecha de vencimiento es: "+this.venc.getDayOfMonth()+"/"+this.venc.getMonthValue()+"/"+this.venc.getYear());
		System.out.println("La granja de origen es: "+this.getGranja_origen()+", la fecha de envasado es: "+this.fecha_envasado.getDayOfMonth()+"/"+this.fecha_envasado.getMonthValue()+"/"+this.fecha_envasado.getYear());
	}
	

	public String getGranja_origen() {
		return granja_origen;
	}


	public void setGranja_origen(String granja_origen) {
		this.granja_origen = granja_origen;
	}


	public LocalDate getFecha_envasado() {
		return fecha_envasado;
	}


	public void setFecha_envasado(LocalDate fecha_envasado) {
		this.fecha_envasado = fecha_envasado;
	}
	
	
}
