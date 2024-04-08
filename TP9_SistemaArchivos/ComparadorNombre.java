package TP9_SistemaArchivos;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<ElementoSA>{

	@Override
	public int compare(ElementoSA el1, ElementoSA el2) {
		return el1.getNombre().compareTo(el2.getNombre());
	}

}
