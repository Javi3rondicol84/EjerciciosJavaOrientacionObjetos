package TP9_Aseguradora;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class SeguroGeneral {
	private int DNI;
	private String descripcion;
	private int numeroPoliza;
	protected CostoPoliza calcularCosto;
	
	public SeguroGeneral(CostoPoliza calcularCostoPoliza) {
		this.calcularCosto = calcularCostoPoliza;
	}
	
	public void setCostoPoliza(CostoPoliza calcularCostoPoliza) {
		this.calcularCosto = calcularCostoPoliza;
	}
	
	public abstract ArrayList<Seguro> buscar(Filtro filtro, Comparator<Seguro> comp);
	
	
	public int getDNI() {
		return DNI;
	}
	public void setDNI(int dNI) {
		DNI = dNI;
	}
	public abstract double getMontoAsegurado();
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getNumeroPoliza() {
		return numeroPoliza;
	}
	public void setNumeroPoliza(int numeroPoliza) {
		this.numeroPoliza = numeroPoliza;
	}
	
	
}
