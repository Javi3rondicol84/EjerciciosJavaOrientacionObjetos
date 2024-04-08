package TP9_Aseguradora;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<SeguroGeneral>{
	private Comparator<SeguroGeneral> comp1;
	private Comparator<SeguroGeneral> comp2;
	
	public ComparadorCompuesto(Comparator<SeguroGeneral> comp1, Comparator<SeguroGeneral> comp2) {
		this.comp1 = comp1;
		this.comp2 = comp2;
	}
	
	
	@Override
	public int compare(SeguroGeneral s1, SeguroGeneral s2) {
		int resultado = this.comp1.compare(s1, s2);
		
		if(resultado != 0) {
			return 1;
		}
		else {
			return this.comp2.compare(s1, s2);
		}
		
	}

}
