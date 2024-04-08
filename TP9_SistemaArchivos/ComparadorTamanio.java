package TP9_SistemaArchivos;

import java.util.Comparator;

public class ComparadorTamanio implements Comparator<ElementoSA>{

	@Override
	public int compare(ElementoSA el1, ElementoSA el2) {
		if(el1.getTamanio() == el2.getTamanio()) {
			return 0;
		}
		else if(el1.getTamanio() > el2.getTamanio()) {
			return 1;
		}
		else {
			return -1;
		}
		
	}

}
