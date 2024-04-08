package TP9_AlquiloAhora;

import java.util.Comparator;

public class ComparadorAntiguedad implements Comparator<Item>{

	@Override
	public int compare(Item it1, Item it2) {
		return it1.getAntiguedadMeses() - it2.getAntiguedadMeses();
	}

}
