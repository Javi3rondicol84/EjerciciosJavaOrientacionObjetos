package TP4_Avicola;

import java.time.LocalDate;

public class ProductoRefrigerado extends Producto {
	private int codigo_organismo;
	private String granja_origen;
	private LocalDate fecha_envasado;
	private double temp_manten_recomendada;
	
	public ProductoRefrigerado() {
		this.setNombre_producto("productorefrigerado");
		this.setGranja_origen("Avicola");
		this.fecha_envasado = LocalDate.of(2023, 2, 20);
		this.setCodigo_organismo(232223);
		this.setTemp_manten_recomendada(23.5);
	}
	@Override
	public void verEtiqueta() {
		System.out.println("El nombre del producto es: "+this.getNombre_producto()+", su lote es: "+this.getLote()+", su fecha de vencimiento es: "+this.venc.getDayOfMonth()+"/"+this.venc.getMonthValue()+"/"+this.venc.getYear());
		System.out.println("La granja de origen es: "+this.getGranja_origen()+", la fecha de envasado es: "+this.fecha_envasado.getDayOfMonth()+"/"+this.fecha_envasado.getMonthValue()+"/"+this.fecha_envasado.getYear());
		System.out.println("El codigo de organismo es: "+this.getCodigo_organismo()+", la temperatura recomendada es: "+this.getTemp_manten_recomendada());
	}
	
	
	public int getCodigo_organismo() {
		return codigo_organismo;
	}
	public void setCodigo_organismo(int codigo_organismo) {
		this.codigo_organismo = codigo_organismo;
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
	public double getTemp_manten_recomendada() {
		return temp_manten_recomendada;
	}
	public void setTemp_manten_recomendada(double temp_manten_recomendada) {
		this.temp_manten_recomendada = temp_manten_recomendada;
	}
	
	
	
}
