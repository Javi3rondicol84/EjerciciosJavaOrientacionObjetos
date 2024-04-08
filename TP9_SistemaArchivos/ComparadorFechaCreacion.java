package TP9_SistemaArchivos;

import java.util.Comparator;

public class ComparadorFechaCreacion implements Comparator<ElementoSA>{

	@Override
	public int compare(ElementoSA el1, ElementoSA el2) {
		
		return el1.getFechaCreacion().compareTo(el2.getFechaCreacion());
		
	}

}
