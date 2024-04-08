package TP9_Padron_Electoral;

import java.util.Comparator;

public class ComparadorPartido implements Comparator<Candidato>{

	@Override
	public int compare(Candidato can1, Candidato can2) {
		
		return can1.getPartido().compareTo(can2.getPartido());
	}
	
}
