package TP9_Padron_Electoral;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Candidato> {

	private Comparator<Candidato> comp1;
	private Comparator<Candidato> comp2;
	
	public ComparadorCompuesto(Comparator<Candidato> comp1, Comparator<Candidato> comp2) {
		this.comp1 = comp1;
		this.comp2 = comp2;
	}
	
	@Override
	public int compare(Candidato can1, Candidato can2) {
		int resultado = comp1.compare(can1, can2);
		
		if(resultado != 0) {
			return 1;
		}
		else {
			return resultado = comp2.compare(can1, can2);
		}
	}

}
