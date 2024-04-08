package TP9_Aseguradora;

import java.util.Comparator;

public class ComparadorNumeroPoliza implements Comparator<SeguroGeneral>{

	@Override
	public int compare(SeguroGeneral s1, SeguroGeneral s2) {
	
		return s1.getNumeroPoliza() - s2.getNumeroPoliza();
	}

}
