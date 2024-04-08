package TP9_Futbol5;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Socio>{
	private Comparator<Socio> comparador1;
	private Comparator<Socio> comparador2;
	
	public ComparadorCompuesto(Comparator<Socio> comparador1, Comparator<Socio> comparador2) {
		this.comparador1 = comparador1;
		this.comparador2 = comparador2;
	}

	@Override
	public int compare(Socio s1, Socio s2) {
		int resultado = this.comparador1.compare(s1, s2);
		
		if(resultado != 0) {
			return resultado;
		}
		else {
			return resultado = this.comparador2.compare(s1, s2);
		}
		
	}
	
	

}
