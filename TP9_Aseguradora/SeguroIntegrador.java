package TP9_Aseguradora;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SeguroIntegrador extends SeguroGeneral {
	private ArrayList<SeguroGeneral> seguros;
	//no se incluye en la busqueda de seguros. no se devuelve a si mismo, si no a los seguros que tenga de hijos.
	
	public SeguroIntegrador(CostoPoliza calcularCostoPoliza) {
		super(calcularCostoPoliza);
		this.seguros = new ArrayList<SeguroGeneral>();
	}
	
	@Override
	public double getMontoAsegurado() {
		double suma = 0;
		
		for(int i = 0; i < this.seguros.size(); i++) {
			suma += this.seguros.get(i).getMontoAsegurado();
		}
		
		return suma;
	}
	
	public int getNumeroPoliza() { //el mayor numero de los seguros que contiene
		int numeroMayor = 0;
		
		for(int i = 0; i < this.seguros.size(); i++) {
			if(numeroMayor < this.seguros.get(i).getNumeroPoliza()) {
				numeroMayor = this.seguros.get(i).getNumeroPoliza();
			}
		}
		
		return numeroMayor;
	}

	@Override
	public ArrayList<Seguro> buscar(Filtro filtro, Comparator<Seguro> comp) {
		ArrayList<Seguro> lista = new ArrayList<Seguro>();

		for(int i = 0; i < this.seguros.size(); i++) {
			lista.addAll(this.seguros.get(i).buscar(filtro, comp));
		}
		
		
		if(comp != null) {
			Collections.sort(lista, comp);
		}
		
		return lista;
	}
}
