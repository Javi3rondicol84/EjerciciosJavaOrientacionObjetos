package TP9_SistemaArchivos;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<ElementoSA>{
	private Comparator<ElementoSA> comp1;
	private Comparator<ElementoSA> comp2;
	
	@Override
	public int compare(ElementoSA el1, ElementoSA el2) {
		int resultado = comp1.compare(el1, el2);
		
		if(resultado != 0) {
			return 1;
		}
		else {
			return comp2.compare(el1, el2);
		}

	}
	
	
}
