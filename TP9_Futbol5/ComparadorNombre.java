package TP9_Futbol5;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<Socio>{

	@Override
	public int compare(Socio s1, Socio s2) {
		return s1.getNombre().compareTo(s2.getNombre());
	}

}
