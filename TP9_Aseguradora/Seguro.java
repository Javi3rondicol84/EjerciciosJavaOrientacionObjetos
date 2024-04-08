package TP9_Aseguradora;

import java.util.ArrayList;
import java.util.Comparator;

public class Seguro extends SeguroGeneral {

	public Seguro(CostoPoliza calcularCostoPoliza) {
		super(calcularCostoPoliza);
	}

	@Override
	public ArrayList<Seguro> buscar(Filtro filtro, Comparator<Seguro> comp) {
		ArrayList<Seguro> lista = new ArrayList<Seguro>();
		
		if(filtro.cumple(this)) {
			lista.add(this);
		}
		
		return lista;
	}

	@Override
	public double getMontoAsegurado() {
		return this.calcularCosto.getCostoPoliza(this);
	}

}
