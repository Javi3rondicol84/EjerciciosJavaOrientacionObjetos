package TP9_Aseguradora;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class SeguroTemporal extends Seguro {
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	
	public SeguroTemporal(CostoPoliza calcularCostoPoliza,
			LocalDate fechaInicio, LocalDate fechaFin) {
		super(calcularCostoPoliza);
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}
	
	@Override
	public double getMontoAsegurado() {
		if(LocalDate.now().isAfter(this.fechaInicio) && LocalDate.now().isBefore(this.fechaFin)) {
			return this.calcularCosto.getCostoPoliza(this);
		}
		
		return 0;
	}
	
	public ArrayList<Seguro> buscar(Filtro filtro, Comparator<Seguro> comp) {
		ArrayList<Seguro> lista = new ArrayList<Seguro>();
		
		if(LocalDate.now().isAfter(this.fechaInicio) && LocalDate.now().isBefore(this.fechaFin)) {
			lista.add(this);
		}
		
		return lista;
		
	}
	
}
