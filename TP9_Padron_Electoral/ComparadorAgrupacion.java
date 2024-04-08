package TP9_Padron_Electoral;

import java.util.Comparator;

public class ComparadorAgrupacion implements Comparator<Candidato>{
	
	@Override
	public int compare(Candidato can1, Candidato can2) {
		
		return can1.getAgrupacion().compareTo(can2.getAgrupacion());
	}
	
}