package TP9_Futbol5;

import java.util.Comparator;

public class ComparadorTotalAlquileresID implements Comparator<Socio> {

	private int id;
	
	public ComparadorTotalAlquileresID(int id) {
		this.id = id;
	}
	
	@Override
	public int compare(Socio s1, Socio s2) {
		return s1.getCantidadTotalAlquiler(id) - s2.getCantidadTotalAlquiler(id);
	}

}
